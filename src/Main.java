import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Satir Sayisini giriniz: ");
		int satir = inp.nextInt();
		System.out.print("Sutun Sayisini giriniz: ");
		int sutun = inp.nextInt();
		int[][] matris = new int[satir][sutun];
		int[][] transpoze = new int[sutun][satir];

		System.out.println("Matris: \n");


		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = (int)(Math.random()*10)+1;
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("Matrisin Transpozesi:\n");
		for (int i = 0; i < sutun; i++) {
			for (int j = 0; j < satir; j++) {
				transpoze[i][j] = matris[j][i];
				System.out.print(transpoze[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
