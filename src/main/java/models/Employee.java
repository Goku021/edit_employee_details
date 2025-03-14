package models;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String position;
    private String department;

    public Employee() {
    }

    // Constructor with all fields
    public Employee(int id, String name, String email, String position, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.position = position;
        this.department = department;
    }

    // Constructor without ID (for adding new employees)
    public Employee(String name, String email, String position, String department) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.department = department;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
