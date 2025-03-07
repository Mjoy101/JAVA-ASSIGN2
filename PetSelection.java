import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelection {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pet Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(7,1));
        
        JLabel label = new JLabel("Select a pet:" , SwingConstants.CENTER);
        frame.add(label);
        
        
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton parrotButton = new JRadioButton("Parrot");
        JRadioButton fishButton = new JRadioButton("Fish");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        
     
        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(parrotButton);
        group.add(fishButton);
        group.add(rabbitButton);
        
      
        frame.add(dogButton);
        frame.add(catButton);
        frame.add(parrotButton);
        frame.add(fishButton);
        frame.add(rabbitButton);
        
        JButton selectButton = new JButton("Show Selection");
        frame.add(selectButton);
        


        selectButton.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                String selectedPet = "No pet selected";
                if (dogButton.isSelected()) selectedPet = "Dog";
                else if (catButton.isSelected()) selectedPet = "Cat";
                else if (parrotButton.isSelected()) selectedPet = "Parrot";
                else if (fishButton.isSelected()) selectedPet = "Fish";
                else if (rabbitButton.isSelected()) selectedPet = "Rabbit";
                
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet);
            }
        });
        
        frame.setVisible(true);
    }
}
