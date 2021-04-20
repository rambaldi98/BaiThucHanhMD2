//import bai1opp.*;
//public class Main {
//    public static void main(String[] args) {
//        CanBo canBo1 = new CongNhan("cong",12,"nam","nb",3);
//        CanBo canBo2 = new KySu("he",13,"nam","hn","kysu");
//        CanBo canBo3 = new NhanVien("hi",23,"nu","hna","phu viec");
//        QuanLyCanBo a = new QuanLyCanBo();
//        a.addCanBo(canBo1);
//        a.addCanBo(canBo2);
//        a.addCanBo(canBo3);
////        a.showCanBo();
//        System.out.println();
////        System.out.println( a.searchCanBoByName("cong"));
//        a.deleteCanBo("he");
//        a.showCanBo();
//    }
//}

import sinhvien.*;
public class Main {
    public static void main(String[] args) {
        final Grade A = new Grade("Toan", "Ly", "Hoa");
        final Grade B = new Grade("Toan", "Hoa", "Sinh");
        final Grade C = new Grade("Van", "Su", "Dia");
        Student a = new Student(1,2,"cong","nb");
        Student b = new Student(2,2,"cong1","nb1");
        Student c = new Student(3,3,"cong2","hn");
        a.setGrade(A);
        b.setGrade(B);
        c.setGrade(C);
        ManagarStudent mana = new ManagarStudent();
        mana.addStudent(a);
        mana.addStudent(b);
        mana.addStudent(c);
        mana.showStudent();
        System.out.println();
//        System.out.println( mana.searchStudentById(1));
        System.out.println(mana.showStudentById(mana.searchStudentById(1)));
    }
}