import java.util.Random;
import java.util.Scanner;

public class Apumetodi {
	public String lueMerkkijono() {
		System.out.println("Syötä merkkijono.");
		Scanner lukija = new Scanner(System.in);
		String mjono = lukija.nextLine();
		return(mjono);
	}
	public int lueKokonaisluku() {
		System.out.println("Syötä kokonaisluku.");
		Scanner lukija = new Scanner(System.in);
		int luku = lukija.nextInt();
		return(luku);
	}
	public int satunnainenKokonaisluku(int ylaraja) {
		Random r = new Random();
		int satunnainen = r.nextInt(ylaraja);
		return(satunnainen);
	}
	public static void tulostaLauta(String[][] lauta) {
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(j == 2) {
					System.out.println(lauta[i][j]);
				}
				else {
					System.out.print(lauta[i][j] + "|");
				}
			}
		}
		
	}
}
