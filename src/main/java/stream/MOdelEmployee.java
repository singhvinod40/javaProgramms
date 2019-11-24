package stream;

public class MOdelEmployee {

    private String name;
    private int Id;
    private String city;

    public MOdelEmployee(String name, int id, String city) {
        this.name = name;
        Id = id;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

