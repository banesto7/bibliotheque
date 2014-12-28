package biblio;
public class Livre{
	String ref;
	String titre;
	public Livre(){}
	public Livre(String ref,String titre){
		this.ref = ref;
		this.titre = titre;
	}
	public String 	getRef	()	{return ref;}
	public void 	setRef	(String ref){ this.ref = ref;}
	public String	getTitre()	{return titre;}
	public void 	setTitre(String titre){ this.titre = titre;}
	public boolean  equals	(Object o){	return this.ref==((Livre)o).ref;	}
	public void 	affiche	()	{ System.out.println(ref+" "+titre);	}
	public int 	hashCode(){	return ref.hashCode();	}

}