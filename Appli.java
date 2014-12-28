import biblio.*;
public class Appli{
	public static void main(String args[]){
		Bibliotheque biblio = new Bibliotheque();
		boolean ok;
		ok=biblio.ajouterLivre("BIBLE","La bible");
		System.out.println(ok); // true
		ok=biblio.ajouterLivre("BIBLE","La bible 2");
		System.out.println(ok); // false (doublon de réf.)
		ok=biblio.ajouterLecteur("bob");
		System.out.println(ok); // true
		ok=biblio.ajouterLecteur("bob");
		System.out.println(ok); // false (doublon d'id.)
System.out.println("----------EMPRUNTER-----------------");
		ok=biblio.emprunt("max","BIBLE");
		System.out.println(ok); // false (id. inconnu)
		ok=biblio.emprunt("bob","CORAN");
		System.out.println(ok); // false (réf. inconnue)
		ok=biblio.emprunt("bob","BIBLE");
		System.out.println(ok); // true
		ok=biblio.emprunt("bob","BIBLE");
		System.out.println(ok); // false (réf. déjà empruntée)
		
System.out.println("------Liste des emprunts-----------------");
biblio.afficheAllEmprunt();
		
System.out.println("----------RAPPORTER-----------------");
		ok=biblio.retour("bob","BIBLE");
		System.out.println(ok); // true
		ok=biblio.retour("bob","BIBLE");
		System.out.println(ok); // false (emprunt inconnu)	}
System.out.println("----------AFFICHER-----------------");
		biblio.afficheAllLecteur();
		biblio.afficheAllLivre();
		biblio.afficheAllEmprunt();
	}
}