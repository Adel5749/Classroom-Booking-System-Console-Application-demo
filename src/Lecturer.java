public class Lecturer {
    private int id;
    private String Name;

    public Lecturer() {
        this.id=0;
        this.Name="";
    }

    public Lecturer(int id, String name) {
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
