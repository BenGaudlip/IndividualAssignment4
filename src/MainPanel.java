import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class MainPanel extends JPanel implements ActionListener
{
    private JButton saveInfoButton;
    private JButton loadInfoButton;
    private JTextField fNameField;
    private JTextField lNameField;
    private JSlider ageSlider;
    private JLabel summaryLabel;
    
    Person person;
    
    MainPanel()
    {
        GridLayout grid = new GridLayout(2, 4);
        setLayout(grid);
        
        person = new Person();
        
        fNameField = new JTextField("Please enter your first name");
        add(fNameField);
        person.setfName();
                
        saveInfoButton = new JButton("Save Info");
        saveInfoButton.addActionListener(this);
        add(saveInfoButton);
        
        ageSlider = new JSlider(JSlider.HORIZONTAL, 1, 100, 100);
        ageSlider.setMajorTickSpacing(9);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);
        add(ageSlider);
        person.setAge();
        
        lNameField = new JTextField("Please enter your last name");
        add(lNameField);
        person.setlName();
              
        loadInfoButton = new JButton("Load Info");
        add(loadInfoButton);
        
        summaryLabel = new JLabel("No info yet.");
        add(summaryLabel); 
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton eventSource = (JButton)e.getSource();
        
        if(eventSource == saveInfoButton)
        {
            summaryLabel.setText(person.getInfo());
        }
    }
}
