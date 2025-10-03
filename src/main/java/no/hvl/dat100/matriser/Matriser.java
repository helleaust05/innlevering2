package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] row  : matrise) {
            for (int tall : row) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String tekst = "";
        for (int[] row  : matrise) {
          for (int i = 0; i < row.length; i++) {
              tekst += row[i] + " ";
          }
            tekst += "\n";
        }
        System.out.println(tekst);
        return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
       int[][] x = new int[matrise.length][matrise[0].length];
       for (int i = 0; i < matrise.length; i++) {
           for(int j = 0; j < matrise[i].length; j++) {
               x[i][j] = matrise[i][j] * tall;
           }
       }
       return x;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        if (a == null || b == null) { //sjekker om en av tabellene er null
            return false;
        }
        if (a == null && b == null) {  //sjekker om begge er null
            return true;
        }
        if (a.length != b.length) { //sjekker om tabellene har lik lengde
            return false;
        }
        for  (int i = 0; i < a.length; i++) { //sjekker om radene har lik lengde
            if (a[i].length != b[i].length) {
                return false;
            }
            for (int j = 0; j < a[i].length; j++) { //sjekker hvert element
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
        int lengde = matrise.length;
        int[][] speilet = new int[lengde][lengde];

        for (int i = 0; i < lengde; i++) {
            for (int j = 0; j < lengde; j++) {
                speilet[j][i] = matrise[i][j];
            }
        }
        return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) { //frivillig

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
