package com.apnajec;
import java.lang.Math;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mynumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner (System.in);
        int usernumber=0;

        do {

            System.out.println("Guess a number between 1-100 :   \n");
            usernumber = sc.nextInt();

            if(usernumber==mynumber){
                System.out.println("WOOHOO , You finally did it !!!\n");
                break;
            }

            else if (usernumber>mynumber){
                System.out.print("Your n umber is too large\n");
            }

            else{
                System.out.print("Your number is too small \n");
            }
        }while(usernumber>0);

        System.out.print("My number is ");
        System.out.print(mynumber);
    }
}
