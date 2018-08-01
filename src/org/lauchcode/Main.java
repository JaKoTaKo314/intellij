package org.lauchcode;

public class  Witaj {
    public static void main (String args[])

    {

        float a, b;

        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj swoją ulubioną liczbę?");
        a = odczyt.nextInt();
        if(a == 8) {
                System.out.println("To moja ulubiona liczba. Jak masz na imię?");
                String imie;
                Scanner odczyt2 = new Scanner(System.in);
                imie = odczyt2.nextLine();
                System.out.println("Witaj "+imie); }
            else {
            System.out.println("Fajnie mi też się podoba. Jak masz na imię?");
            String imie;
            Scanner odczyt2 = new Scanner(System.in);
            imie = odczyt2.nextLine();
            System.out.println("Witaj "+imie); }
        System.out.print("");
        System.out.print("Jeżeli jeden kologram to 1000gram a 1 gram to 1000mg. To ile miligramów liczy 0,08 kg?");
        b = odczyt.nextInt();
        if(b == 80000) {
            System.out.println("Brawo pierwsza poprawna odpowiedz"); }
        else if (b>8000){
            System.out.println("Trochę za dużo. Spróbuj jeszcze raz");//Zaczynam zagnieżdzać
            int d;
            Scanner odczyt3 = new Scanner(System.in);
            d = odczyt3.nextInt();
            if (d == 80000) {
                System.out.println("Brawo jak chcesz to potrafisz");}
                 else  {
                    System.out.println("Sprujemy innym razem");}
            }
          else  {
            System.out.println("Trochę za mało. Spróbuj jeszcze raz");//Zaczynam zagnieżdzać
            int e;
            Scanner odczyt4 = new Scanner(System.in);
            e = odczyt4.nextInt();
            if (e == 80000) {
                System.out.println("Brawo jak chcesz to potrafisz");}
                 else  {
                    System.out.println("Sprujemy innym razem");}}

        System.out.print("");
        System.out.print("Do zobaczenia wkrótce ");

    }
}

