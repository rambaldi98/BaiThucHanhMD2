package bai_th1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(20,2);
        add(room);

    }
    public static void add(Room room) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Manager Room");
            System.out.println("1. insert person");
            System.out.println("2.remove person by id");
            System.out.println("3. show cost Hire");
            System.out.println("4. show person of room");
            System.out.println("5. exit");
            String line = scanner.nextLine();

            switch (line) {
                case "1" : {
                    System.out.println("enter fullname");
                    String fullname = scanner.nextLine();
                    System.out.println("enter birthday");
                    int birthday = scanner.nextInt();
                    System.out.println("enter ID");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    Human human = new Human(fullname,birthday,id);
                    room.addHuman(human);
                    break;
                }
                case "2": {
                    System.out.println("enter id for remove human");
                    String id = scanner.nextLine();
                    room.deleteHuman(id);
                    break;
                }
                case "3" : {
                    System.out.println( room.costHire());
                    break;
                }
                case "4" : {
                    room.showHumanHire();
                    break;
                }
                case "5" :
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid continue");
                    continue;
            }
        }
    }

//    public static void main(String[] args) {
//           Human humans = new Human("a",1,"2");
////        humans.add(new Human("a",1,"1"));
//        Room a = new Room(3,1);
//        Room b = new Room(3,2);
//        b.addHuman(humans);
//
//        ManagerHotel hotel = new ManagerHotel();
//        hotel.addRoom(a);
//        hotel.addRoom(b);
//        System.out.println(b.toString());
//        b.showHumanHire();
////        b.deleteHuman("1");
////        b.showHumanHire();
////        hotel.showRoom();
//    }
}
