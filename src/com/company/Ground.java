package com.company;

public class Ground {
    public static void main (String[] args) {
        int[][] ground;
        ground=new int[8][8];
        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++) {
                ground[i][j] = j + 1;
            }
        }
        render(ground);


    }


    private static void render(int[][] ground) {

        for (int[] anArr : ground) {

            for (int anAnArr : anArr) {

                System.out.print("━");

            }
            System.out.print("┃");
        }



    }
}
