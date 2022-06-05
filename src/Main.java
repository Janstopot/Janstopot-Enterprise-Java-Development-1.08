import CarClasses.UtilityVehicle;
import ListInterface.IntArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1

    public static double returnDouble(BigDecimal x){
        return x.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
    // 2

    public static BigDecimal returnReverse(BigDecimal x){
        return (x.negate()).setScale(1, RoundingMode.HALF_EVEN);

    }



    public static void main(String[] args) {

        //UtilityVehicle utilityVehicle1 = new UtilityVehicle(654, "asd", "model", 777, false);
        //System.out.println(utilityVehicle1.getModel());

        IntArrayList intlist = new IntArrayList();
        List<Integer> list = new ArrayList<>();


        intlist.add(3);
        intlist.add(6);
        intlist.add(2);
        intlist.add(9);
        intlist.add(3);
        intlist.add(6);
        intlist.add(2);
        intlist.add(9);
        intlist.add(3);
        intlist.add(6);
        intlist.add(2);
        intlist.add(45);

        System.out.println(intlist.get(45 , list));

    }



}