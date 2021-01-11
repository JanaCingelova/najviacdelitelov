package sk.kosickaakdemia.cingelova.najviacdelitelov;

public class Main {
    public static void main(String[] args) {
        int x = 999;
        int d;
        int c1=0;
        int x1=0;

        while (x >= 1) {
            int count = 0;
            System.out.print(x+": ");
            for (d = 1; d <= x; d++) {

                if (x % d == 0) {
                    count = count + 1;
                    System.out.print(" " + d);
                }

            }
            System.out.println();
            System.out.println(" Pocet delitelov " + x + " je " + count);

            if (count>c1){
                c1=count;
                x1=x;

            }
            x--;

        }System.out.println("Najvyšší počet deliteľov má číslo "+x1+ " a je to "+ c1+ " deliteľov");
    }

    }








