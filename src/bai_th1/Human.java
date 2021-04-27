package bai_th1;


public class Human {
    private String fullName;
    private int birthDay;
    private String id;

    public Human(String fullName, int birthDay, String id) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + this.fullName + '\'' +
                ", birthDay=" + this.birthDay +
                ", id='" + this.id+ '\'' +
                '}';
    }
}
