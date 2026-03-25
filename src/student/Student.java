package student;

public class Student {
    private int id;
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(int id, String name, String email) {
        this(name, email);
        this.id = id;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
