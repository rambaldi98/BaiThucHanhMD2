package bai_th1;

import java.util.ArrayList;
import java.util.List;

public class ManagerHotel implements MethodHotel {
    private List <Room> rooms;

    public ManagerHotel() {
        this.rooms = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    // them phong
    @Override
    public void addRoom(Room room) {
        this.rooms.add(room);
    }
    // hien thi thong tin phong
    @Override
    public void showRoom(){
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

}
