package biblio;
public class Lecteur{
	private String id;
	public Lecteur(){}
	public Lecteur(String id){
		setId(id);
	}
	public String 	getId(){ return id;}
	public void  	setId(String id){ this.id = id;}
	public boolean 	equals(Object obj){	
		//System.out.println(this.id==((Lecteur)obj).id);
		return this.id==((Lecteur)obj).id;	}
	public void affiche(){	System.out.println(id);	}
	public int 	hashCode(){	
		//System.out.println(id.hashCode());
		return id.hashCode();	
	}
}