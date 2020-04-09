public class Customer
{
    private String firstName;
    private String lastName;
    private String email;   

    //what is this? empty constructor
    public Customer()
    {
        this("", "", "");
    }
//fully loaded string
    public Customer(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;        
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
}