import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Repo rp = new Repo();

        rp.busList.add(new Bus(rp.busList.size()+1));
        rp.busList.add(new Bus(rp.busList.size()+1));

        Bus b1 = rp.busList.get(0);
        Bus b2 = rp.busList.get(1);
        System.out.println("버스1 번호 : " + b1.getNum());
        System.out.println("버스2 번호 : " + b2.getNum());
        b1.addPassenger(2);
        System.out.println(b1.getPassenger());
        System.out.println("잔여승객수 " + (b1.getMaxPassenger() -b1.getPassenger()));
        System.out.println("버스요금 : " + b1.getIncome());
        b1.addGas(-50);
        System.out.println(b1.getGas());
        b1.changeState("차고지행");
        b1.addGas(10);
        System.out.println(b1.getGas());
        System.out.println(b1.getState());
        b1.addPassenger(45);
        b1.addPassenger(4);
        System.out.println(b1.getPassenger());
        System.out.println(b1.getIncome());
        b1.addGas(-55);
        System.out.println(b1.getGas());
        System.out.println(b1.getState());


        System.out.println();
        System.out.println();
        rp.taxiList.add(new Taxi(rp.taxiList.size()+1));
        rp.taxiList.add(new Taxi(rp.taxiList.size()+1));

        Taxi t1 = rp.taxiList.get(0);
        Taxi t2 = rp.taxiList.get(1);
        System.out.println("택시1 번호 : " + t1.getNum());
        System.out.println("택시2 번호 : " + t2.getNum());
        System.out.println("주유량 : " + t1.getGas());
        System.out.println("상태 : " + t1.getState());

        t1.addPassenger(2);
        System.out.println(t1.getPassenger());
        System.out.println(t1.getBasicFee());
        t1.setDest("서울역", 2);
        System.out.println(t1.getDest());
        System.out.println(t1.getDistanceToDest() + "km");
        System.out.println(t1.getTaxiFee());
        System.out.println(t1.getState());
        t1.arrival();
        t1.addPassenger(5);
        t1.addPassenger(1);
        t1.setDest("구디단", 12);
        System.out.println("목적지 : " + t1.getDest() + " 거리 : " +t1.getDistanceToDest());
        System.out.println("탐승 승객수 : " + t1.getPassenger());
        System.out.println("잔여 승객수 : " + (t1.getMaxPassenger()  - t1.getPassenger()));
        System.out.println("목적지까지 거리 : " + t1.getDistanceToDest() + "km");
        System.out.println("지불할 요금 : " + t1.getTaxiFee());
        t1.addGas(-100);
        System.out.println(t1.getGas());
        System.out.println(t1.getState());
        t1.arrival();
        System.out.println(t1.getIncome());


    }
}