package sk.kosickaakdemia.cingelova.najviacdelitelov;

public class Main {
    public static void main(String[] args) {
        int x = 999;
        int d;

        while (x >= 2) {
            int count = 0;
            for (d = 2; d < x; d++) {

                if (x % d == 0) {
                    count = count + 1;
                    System.out.print(" " + d);
                }


            }
            System.out.println(" Pocet delitelov " + x + " je " + count);
            x--;

        }
    }

    }








