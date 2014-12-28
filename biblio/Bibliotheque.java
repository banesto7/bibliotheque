package biblio;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Bibliotheque{
	HashSet<Lecteur>listeLecteur= new HashSet<>();
	HashSet<Livre>listeLivre	= new HashSet<>();
	//ArrayList<Livre>   listeLivre 	= new ArrayList<>();
	HashSet<Emprunt> listeEmprunt = new HashSet<>();
	
	/////// CONSTRUCTOR ////////////////////
	public Bibliotheque(){}
	/////// METHODE ///////////////////////
	private boolean livreExiste(String ref){return true;}
	private boolean lecteurExiste(String id){return true;}
	private boolean empruntExiste(String id,String ref){return true;}
	////////////////////////////////////////////////
		private Livre livreExiste(Livre livre){
			Iterator<Livre> iter =  listeLivre.iterator();
			while(iter.hasNext()){
				Livre livreFound =  iter.next();
				if (livreFound.equals(livre))
					return livreFound;
			}
			return null;
		}
		////////////////////////////////////////////////
		private Lecteur lecteurExiste(Lecteur lecteur){
			Iterator<Lecteur> iter =  listeLecteur.iterator();
			while(iter.hasNext()){
				Lecteur lecteurFound =  iter.next();
				if (lecteurFound.equals(lecteur))
					return lecteurFound;
			}
			return null;
		}
		////////////////////////////////////////////////
		private Emprunt empruntExiste(Emprunt emprunt){
			Iterator<Emprunt> iter =  listeEmprunt.iterator();
			while(iter.hasNext()){
				Emprunt empruntFound =  iter.next();
				if (empruntFound.equals(emprunt))
					return empruntFound;
			}
			return null;
		}
	////////////////////////////////////////////////	

	////////////////////////////////////////////////
	public boolean ajouterLivre(String id, String titre){
		return listeLivre.add(new Livre(id,titre));
	}
	////////////////////////////////////////////////
	public boolean ajouterLecteur(String ref){
		return listeLecteur.add(new Lecteur(ref));
	}
	////////////////////////////////////////////////
	/**
	 * @param ref
	 * @param id
	 * @return true l'emprunt a été validé
	 */
	public boolean emprunt(String ref,String id){
		Lecteur lecteurRech = new Lecteur(ref);
		Livre livreRech = new Livre(id,null);
		
		if((lecteurRech=lecteurExiste(lecteurRech))==null){
			System.out.println("pas de lecteur");
			return false;
		}
		if((livreRech=livreExiste(livreRech))==null){
			System.out.println("pas de livre");
			return false;
		}
		if(!listeEmprunt.add(new Emprunt(lecteurRech,livreRech))){
			System.out.println("Deja Emprunt !!!");
			return false;
		}
		return true;
	}
	/////// RETOUR ///////////////////////////////////
	public boolean retour(String ref, String id){
		return listeEmprunt.remove(new Emprunt(new Lecteur(ref),new Livre(id,null)));
	}	
	////////// AFFICHAGE /////////////////////////
	public void afficheAllLivre(){
		Iterator<Livre> iter = listeLivre.iterator();
		while(iter.hasNext())
			iter.next().affiche();			
	}	
	public void afficheAllLecteur(){
		for (Lecteur e:listeLecteur)
			e.affiche();
	}
	public void afficheAllEmprunt(){
		for (Emprunt e:listeEmprunt)
			e.affiche();
	}
}