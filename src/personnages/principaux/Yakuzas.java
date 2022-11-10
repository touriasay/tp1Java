package personnages.principaux;
import personnages.Humain;

public class Yakuzas extends Humain{

	private String clan;
	private int reputation = 0;

	public Yakuzas(String nom, int argent, String boisson, String clan, int reputation) {
		super(nom, argent, boisson);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant commercant) {
		this.gagnerArgent(commercant.getArgent());
		 
	 } 
	 
	public void gagner() {
		 reputation += 1;
		 System.out.println("Je viens de gagner 1 point de réputation");
	 }
	 
	public int perdre() {
		 this.perdreArgent(this.getArgent());
		 reputation -= 1;
		 System.out.println("J'ai perdu");
		
	}

}
