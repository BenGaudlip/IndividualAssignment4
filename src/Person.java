public class Person
{
    private String fName;
    private String lName;
    private int age;
    
    Person()
    {    
        
    }
    
    public String setfName()
    {
        this.fName = fName;
        return fName;
    }
    
    public String setlName()
    {
        this.lName = lName;
        return lName;
    }
    
    public int setAge()
    {
        this.age = age;
        return age;
    }
    
    public String getInfo()
    {
        return fName + " " + lName + " " + age;
    }
            
}
