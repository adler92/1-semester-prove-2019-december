import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {

    public static void main(String[] args) {

            int num1 = 1;
            int num2 ;
int sum = num1 + num2;
            System.out.println("**** Quickmaths ****");
            Scanner input = new Scanner(System.in);

            while (num1 != -1) {
                System.out.print("Indtast A: ");
                num1 = input.nextInt();

                System.out.print("Indtast B: ");
                num2 = input.nextInt();

                System.out.println("Sum: " + (num1 + num2));

                int sum1 = num1 + num2;

                System.out.println("Gennemsnit: " + (sum1 / 2));

                System.out.println("------------");
            }


    }

}
