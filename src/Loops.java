import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println(System.lineSeparator() + "*******");
        l.printBrugereReverseArr();
        System.out.println(System.lineSeparator() + "*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

        // TODO Din kode her
        String[] strings = getBrugere();
        for (String astring : strings) {

            System.out.print(astring + " ");


        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        // TODO Din kode her
        String[] strings = getBrugere();
        for (int i = 4; i >= 0; i--) {
            System.out.print(strings[i] + " ");
        }

    }

    public void waitingFor0() {

        // TODO Din kode her
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x != 0) {
            System.out.print("Venter på 0! Skriv et tal... ");
            x = input.nextInt();

            if(x == 0)
            System.out.println("du har tastet 0. Så er det slut!");

        }

    }
}
