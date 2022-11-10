package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, argent,"thé");
	}
		// TODO Auto-generated constructor stub
		
		void seFaireExtorquer() {
			int n = getArgent();
			perdreArgent(n);
			System.out.println(" le monde est vraiment trop injuste.");
		}
		void recevoir(int argent) {
			gagnerArgent(argent);
		}
	
	

}
