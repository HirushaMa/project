public class Cricketer
{
    protected String name;
    protected String birthday;
    protected double height;
    protected String country;
    protected String role;

    Cricketer()
    {

    }

    Cricketer(String name,String birthday,Double height,String country,String role)
    {
        this.name=name;
        this.birthday=birthday;
        this.height=height;
        this.country=country;
        this.role=role;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role=role;
    }

}