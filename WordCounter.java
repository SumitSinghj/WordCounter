import javax.swing.*;
import java.awt.event.*;

public class WordCounter extends JFrame {

    // Constructor to set up the GUI components
    public WordCounter() {
        // Set up the frame
        setTitle("Word Counter");
        setSize(750, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using absolute layout

        // Create components
        JLabel instructionLabel = new JLabel("Enter your paragraph below:");
        instructionLabel.setBounds(70, 20, 400, 30);
        instructionLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        
        JTextArea paragraphArea = new JTextArea();
        paragraphArea.setBounds(70, 70, 550, 300);
        paragraphArea.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 16));

        paragraphArea.setLineWrap(true);
        paragraphArea.setWrapStyleWord(true);

        JButton countButton = new JButton("Count Words");
        countButton.setBounds(200, 380, 120, 30);
        countButton.setBackground(new java.awt.Color(255, 102, 102));

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(70, 420, 300, 30);
        resultLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        // Add event listener for the button click
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String paragraph = paragraphArea.getText().trim();
                // Split by spaces and count words
                String[] words = paragraph.split("\\s+");
                int wordCount = (paragraph.isEmpty()) ? 0 : words.length;
                resultLabel.setText("Word Count: " + wordCount);
            }
        });

        // Add components to the frame
        add(instructionLabel);
        add(paragraphArea);
        add(countButton);
        add(resultLabel);

        setVisible(true); // Show the frame
    }

    public static void main(String[] args) {
        // Create the WordCounter frame
        new WordCounter();
    }
}
