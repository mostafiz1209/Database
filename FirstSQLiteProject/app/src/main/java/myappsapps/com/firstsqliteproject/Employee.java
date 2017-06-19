package myappsapps.com.firstsqliteproject;

/**
 * Created by Mostafiz-pc on 2/1/2017.
 */
public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;


    public Employee(int id,String name,String email,String phone)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;

    }

    public Employee(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
