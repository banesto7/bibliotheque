package biblio;

public class Emprunt{
	private Lecteur lecteur;
	private Livre livre;
	public Emprunt(){}
	public Emprunt(Lecteur lecteur, Livre livre){
		this.lecteur = lecteur;
		this.livre = livre;
	}
	public boolean equals(Object o){
		return this.lecteur.equals(((Emprunt)o).lecteur)	&& this.livre.equals(((Emprunt)o).livre);
	}
	public void affiche(){	System.out.println(lecteur.getId()+" "+livre.getRef()+" "+livre.getTitre()); }
	public int 	hashCode(){	
		return lecteur.getId().hashCode()+livre.getRef().hashCode();	
	}

}

