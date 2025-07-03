package com.company;
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("Here 0 = Rock , 1 = Scissor and 2 = Paper.");

        System.out.print("It's Your Turn - ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(3);

        System.out.print("My Choice is - ");
        Random rd = new Random();
        int x = rd.nextInt(3);
        System.out.println(x);
// Here 0 = Rock , 1 = Scissor and 2 = Paper.
        if (A == 0 && x == 1){
            System.out.println("You Wins");
        }
        if (A == 0 && x == 0){
            System.out.println("Draw");
        }
        if (A == 0 && x == 2){
            System.out.println("You Loose!");
        }
        if (A == 1 && x == 1){
            System.out.println("Draw");
        }
        if (A == 1 && x == 0){
            System.out.println("You Loose!");
        }
        if (A == 1 && x == 2){
            System.out.println("You Wins");
        }
        if (A == 2 && x == 0){
            System.out.println("You Wins");
        }
        if (A == 2 && x == 1) {
            System.out.println("You Loose!");
        }
        if (A == 2 && x == 2){
            System.out.println("Draw");
        }


    }
}
