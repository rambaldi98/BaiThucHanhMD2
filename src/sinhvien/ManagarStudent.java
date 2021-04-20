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

    public int searchStudentById(int id){
//        for ( Student st: students
//             ) {
//            if(st.getId() == id)
//                System.out.println(st);
//        }
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id)
                return i;
        }
        return -1;

    }

    public Student showStudentById(int index){
       return students.get(index);
    }
}
