package SurpriseSort;

import java.util.ArrayList;

public class SurpriseSort {
    public static void SurpriseSort (int[] list){
        for (int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int example[] = { 7, 2, 10, 20, 3, 50, 6, 40, 5, 35};
        SurpriseSort(example);

        for (int i = 0; i < example.length; i++) {
            System.out.println(example[i]);
        }
    }
}
