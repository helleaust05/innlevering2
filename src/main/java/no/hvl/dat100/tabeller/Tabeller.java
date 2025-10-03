package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int i=0;i<tabell.length;i++) {
            System.out.println(tabell[i]);
        }

	}

	// b)
	public static String tilStreng(int[] tabell) {
        String utskrift = "[";
        for (int i=0;i<tabell.length;i++) {
            utskrift += tabell[i];
            if (i < tabell.length-1) {
                utskrift += ",";
                }
        }
        utskrift += "]";
        System.out.println(utskrift);
        return utskrift;
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
        for (int i=0; i<tabell.length; i++) {
            sum += tabell[i];
        }
        System.out.println("Summen av tallene er: " + sum);
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
       for  (int i=0;i<tabell.length;i++) {
           if (tabell[i] == tall) {
               System.out.println("Tallet " + tall + " er i tabellen"); //
               return true;
           }
       }
        System.out.println("Tallet " + tall + " er ikke i tabellen");
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for (int i=0; i<tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] revers = new int[tabell.length];
        for (int i=0;i<tabell.length;i++) {
            revers[i] = tabell[tabell.length- i- 1];
        }
        for (int tall : revers) {
            System.out.print(tall + " ");
        }
        return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] >= tabell[i + 1]) {
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] c = new int[tabell1.length + tabell2.length];

        System.arraycopy(tabell1, 0, c, 0, tabell1.length);
        System.arraycopy(tabell2, 0, c, tabell1.length, tabell2.length);

        for  (int tall : c) {
            System.out.print(tall + " ");
        }
        return c;
	}
}
