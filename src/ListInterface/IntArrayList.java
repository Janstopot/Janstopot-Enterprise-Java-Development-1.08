package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class IntArrayList implements IntList{

    @Override
    public void add(int number) {
        List<Integer> list = new ArrayList<>();
        if(list.size() > 10){
            List list2 = new ArrayList<>(list.size() + 5);
            for(int n : list){
                list2.add(n);
            }
        }else{
            list.add(number);
        }

    }

    @Override
    public int get(int number, List<Integer> list) {
        return list.indexOf(number);
    }
}
