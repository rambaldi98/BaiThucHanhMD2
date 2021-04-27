package bai_th1;

import java.util.ArrayList;
import java.util.List;

public class Room implements MethodRoom{
    private double numberDayHire;
    private double typeHire;
//    private double costHire;
    private List <Human> human;

    public Room(double numberHire, double typeHire) {
        this.numberDayHire = numberHire;
        this.typeHire = typeHire;
        this.human = new ArrayList<>();
    }

    public double getNumberHire() {
        return numberDayHire;
    }

    public void setNumberHire(double numberHire) {
        this.numberDayHire = numberHire;
    }

    public double getTypeHire() {
        return typeHire;
    }

    public void setTypeHire(double typeHire) {
        this.typeHire = typeHire;
    }

    public List<Human> getHuman() {
        return this.human;
    }
    // them nguoi
    public void addHuman(Human human) {
        this.human.add( human);
    }

    @Override
    public double costHire() {
        return this.getNumberHire()*this.getTypeHire();
    }
    @Override
    public boolean deleteHuman(String id) {
        Human human1 = null;
        for ( Human human2: human) {
            if(human2.getId().equals(id)){
                human1 = human2;
                break;
            }
        }
//        Human human1 = this.human.stream().filter(
//                p -> p.getId().equals(id)).
//                findFirst().orElse(null);
        if(human1 == null)
            return false;
        else {
            this.human.remove(human1);
            return true;
        }

    }
    @Override
    public void showHumanHire(){
        for (Human human:human
             ) {
            System.out.println(human.toString());
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberHire=" + numberDayHire +
                ", typeHire=" + typeHire +
//                ", costHire=" + getCostHire() +
                ", human=" + human +
                '}';
    }
}
