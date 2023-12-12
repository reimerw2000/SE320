package SE320_Final_Assignment_WR;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame implements ActionListener {
  // Text fields for receiving weight and height
  private JTextField weightField = new JTextField();
  private JTextField heightField = new JTextField();

  // Text area to display contents
  private JTextArea jta = new JTextArea();

  // IO streams
  private DataOutputStream outputToServer;
  private DataInputStream inputFromServer;

  public static void main(String[] args) {
    new Client();
  }

  public Client() {
    // Panel p to hold the labels and text fields
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2, 2));
    
    p.add(new JLabel("Enter weight in kilograms"));
    p.add(weightField);
    
    p.add(new JLabel("Enter height in meters"));
    p.add(heightField);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(p, BorderLayout.NORTH);
    getContentPane().add(new JScrollPane(jta), BorderLayout.CENTER);

    weightField.addActionListener(this);
    heightField.addActionListener(this);

    setTitle("Client");
    setSize(500, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);

      // Create an input stream to receive data from the server
      inputFromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      outputToServer = new DataOutputStream(socket.getOutputStream());
    } catch (IOException ex) {
      jta.append(ex.toString() + '\n');
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() instanceof JTextField) {
      try {
        double weightInKilograms = Double.parseDouble(weightField.getText().trim());
        double heightInMeters = Double.parseDouble(heightField.getText().trim());

        // Send weight and height to the server
        outputToServer.writeDouble(weightInKilograms);
        outputToServer.writeDouble(heightInMeters);
        outputToServer.flush();

        // Get BMI from the server
        double bmi = inputFromServer.readDouble();

        // Display to the text area
        jta.append("Weight is " + weightInKilograms + " kg\n");
        jta.append("Height is " + heightInMeters + " meters\n");
        jta.append("BMI received from the server is " + bmi + '\n');
      } catch (IOException ex) {
        System.err.println(ex);
      }
    }
  }
}
