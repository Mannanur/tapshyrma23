package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> tak = new ArrayList<>();
        ArrayList<Integer> jup = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            arr.add(i);
            if (i % 2 == 0) {
                jup.add(i);
            } else {
                tak.add(i);
            }
        }
        System.out.println(tak);
        System.out.println(jup);
    }
}
