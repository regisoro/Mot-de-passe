import java.util.Scanner;

public class monApp {

	public static void main(String[] args) {
		int n = 1;
		String MotdePass = new String();
		Scanner clavier = new Scanner(System.in);
		while (MotdePass.equals("FroideuR") == false && n < 4) {
			System.out.println("Entrez votre mot de passe: ");
			MotdePass = clavier.next();
			n++;
		}
		if (MotdePass.equals("FroideuR")) {
			System.out.println("Bienvenue sur votre compte");

		} else {
			System.out.println("Desolé votre nombre d'essaie a expiré");
		}
		clavier.close();
	}

}
