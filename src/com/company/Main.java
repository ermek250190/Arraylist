package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> arrayList1 = new ArrayList<>();         // array 1
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList1.add(random.nextInt(100));
        }

        System.out.println("obshie elementi"+arrayList1);

ArrayList<Integer> arrayList2 = new ArrayList<>();    //  array 2
        arrayList2.addAll(arrayList1);
        System.out.println("jup sandatr");
        for (int j : arrayList2) {
            if (j % 2 == 0)
                System.out.print(j + ", ");
        }

        ArrayList<Integer> arrayList3 = new ArrayList<>();      //  array 3

          arrayList3.addAll(arrayList1);
        System.out.println("\ntak sandar ");
          for (int i : arrayList3) {

            if (i % 2 == 1) {

                System.out.print(i + ",  ");    //   konsolgo chikti 
            }

        }
    }

}



