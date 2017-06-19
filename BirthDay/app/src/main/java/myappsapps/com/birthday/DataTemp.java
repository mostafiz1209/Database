package myappsapps.com.birthday;

/**
 * Created by Mostafiz-pc on 3/12/2017.
 */
public class DataTemp {

    private int id;
    private String name;
    private String days;


    public DataTemp(String n,String d)
    {
        name=n;
        days=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
