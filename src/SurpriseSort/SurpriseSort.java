package SurpriseSort;

import java.util.ArrayList;

public class SurpriseSort {
    public static ArrayList<Integer> SurpriseSort (ArrayList<Integer> list){
        for (int i = 1; i< list.size(); i++) {
            for(int j = 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<>();
        example.add(7);
        example.add(2);
        example.add(10);
        example.add(20);
        example = SurpriseSort(example);
        for (Integer i: example) {
            System.out.println(i);
        }
    }
}
