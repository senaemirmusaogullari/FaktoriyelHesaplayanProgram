import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		System.out.print("n Değerini Giriniz :");
		int n = inp.nextInt();
		
		System.out.print("r Değerini Giriniz :");
		int r = inp.nextInt();

		int ntotal = 1;
		for (int i = 1; i <= n; i++) {
			ntotal = ntotal * i;
		}
		System.out.println(n + "!" + "Faktöriyel :" + ntotal);

		int rtotal = 1;
		for (int i = 1; i <= r; i++) {
			rtotal = rtotal * i;
		}
		System.out.println(r + "!" + "Faktöriyel :" + rtotal);

		int result = ntotal / rtotal;

		System.out.println("C(" + n + "," + r + ") = " + result);

	}

}
