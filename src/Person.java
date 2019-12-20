/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    //array husnummer; // 3B
    String nationalitet; // Dansk
    //array fritidsStringeresser; // Snitning, LOL, strikke
    //array smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    int hojde; // 1.56 m
    int vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33
    //array eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    //array opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {

        return "Navn: " + navn + "By" + by;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        int alder = 18;

        //typecasting - widening Casting
        double myDouble = alder;
        System.out.println(alder);
        System.out.println(myDouble);
    }

}
