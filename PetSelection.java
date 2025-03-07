import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pet Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Select a pet:");
        frame.add(label);
        
        // Creating radio buttons
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton fishButton = new JRadioButton("Fish");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        
        // Grouping radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);
        group.add(fishButton);
        group.add(rabbitButton);
        
        // Adding buttons to frame
        frame.add(dogButton);
        frame.add(catButton);
        frame.add(birdButton);
        frame.add(fishButton);
        frame.add(rabbitButton);
        
        JButton selectButton = new JButton("Show Selection");
        frame.add(selectButton);
        
        // Action listener for button click
        selectButton.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                String selectedPet = "No pet selected";
                if (dogButton.isSelected()) selectedPet = "Dog";
                else if (catButton.isSelected()) selectedPet = "Cat";
                else if (birdButton.isSelected()) selectedPet = "Bird";
                else if (fishButton.isSelected()) selectedPet = "Fish";
                else if (rabbitButton.isSelected()) selectedPet = "Rabbit";
                
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet);
            }
        });
        
        frame.setVisible(true);
    }
}
