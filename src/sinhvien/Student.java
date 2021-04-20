package sinhvien;

public class Student {
    private int id,prioritize;
    private Grade grade;
    private String name, address;

    public Student(int id, int prioritize, String name, String address) {
        this.id = id;
        this.prioritize = prioritize;
        this.name = name;
        this.address = address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(int prioritize) {
        this.prioritize = prioritize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", prioritize=" + prioritize +

                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", " + grade +
                '}';
    }
}
