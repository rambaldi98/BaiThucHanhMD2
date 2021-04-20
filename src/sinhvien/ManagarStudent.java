package sinhvien;

import java.util.ArrayList;
import java.util.List;

public class ManagarStudent {
    private List<Student> students;

    public ManagarStudent() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void showStudent(){
        for (Student st: students
             ) {
            System.out.println(st);
        }
    }

    public void searchStudentById(int id){
        for ( Student st: students
             ) {
            if(st.getId() == id)
                System.out.println(st);
        }
    }
}
