public class Person
{
    public String fName;
    public String lName;
    public int age;
    
    Person()
    {    
    }
    
    public String setfName()
    {
        return fName = MainPanel.fNameField.getText();
    }
    
    public String setlName()
    {
        return lName = MainPanel.lNameField.getText();
    }
    
    public int setAge()
    {
        return age = MainPanel.ageSlider.getValue();
    }
    
    public String getInfo()
    {
        fName = MainPanel.fNameField.getText();
        lName = MainPanel.lNameField.getText();
        age = MainPanel.ageSlider.getValue();
        
        return fName + " " + lName + " " + age;
    }        
}
