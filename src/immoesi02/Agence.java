package immoesi02;

import java.util.*;


public class Agence {
	
	public static Set<Bien> Biens;

    public static Set<Proprietaire> archiveProprietaire;
    public static  ArrayList<String> messages ;
    Admin admin = new Admin("lyna","safa");
    public Agence()
    {
            Biens= new TreeSet<>();
            archiveProprietaire = new TreeSet<Proprietaire>();
            messages = new ArrayList <String> ();
    }

    public void insererBien(Bien b , Proprietaire p)
    { 
         Biens.add(b); 
         p.listeBien.add(b);  
         archiveProprietaire.add(p); 
       
    }

    public void modifierBien(Bien b,Modifiable[] modifiable)
    {   
    	for(int i=0;i<modifiable.length;i++)
            modifiable[i].modifier(b);
       
    }

    public void supprimerBien(Bien b)
    {
    	Biens.remove(b); 
    } 
    
    public Bien rechercherBien(String nom)
    {
    	Bien b=null;  
    	Iterator<Bien> it = Biens.iterator();
    	while (it.hasNext())
    	{ 
    		b=it.next(); 

                if (nom.equalsIgnoreCase(b.getNom())) 
    	return b; }
    	return null; 
    	}
    
  public boolean archiverBien (Bien b)
  {
	  
	  if((b!=null) && (b.archiver==false) )
	  {
		  b.archiver=true;
		  return true;
	  }
	  return false ;
  }
  
  // les proprietaires 
 public Proprietaire rechercherProprietaire (String nom , String prenom)
 {
	 Proprietaire p =null;  
	 boolean trouv = false;
	 
 	Iterator<Proprietaire> it = archiveProprietaire.iterator();
 	while (it.hasNext() && trouv==false )
 	{ 
 		p=it.next(); 
    if (nom.equalsIgnoreCase(p.getNom()) && prenom.equalsIgnoreCase(p.getPrenom()))
    {
    	
    	
    	  trouv=true;
    	
    }	
 	
 
    }
 	
 	if(trouv==true)
 	{
 		return p;
 	}else return null;
 	
 
 }
 
   public void afficherProprietaire(String nom , String prenom) 
   {
	   Proprietaire p = this.rechercherProprietaire(nom ,prenom);
 	   p.afficherProprietaireDetails();
	        
	   if(p!=null)
		   
	   {
		   p.afficherBien();
	   }
	  
   }
    // pour les clients
   public void afficherBiens() // afficher tout les biens 
   {
	   int i=0;
	   //Iterator<Bien> it =Biens.iterator();
	   for  (Bien b : Biens)
	   {      i++;
                  System.out.println("le bien numéro "+i+":");
		  b.afficher();
	   
		   
                    
	   }
   }
   
   public void selectionnerBien(Bien b)
   {
	   b.afficherDetails();
   }
   
   public void rechercheCriteres( Criteres[] criteres) 
 
  {   Set<Bien> BiensCopy = Biens ;
  
	for(int i=0;i<criteres.length;i++) 
	{ 
		BiensCopy=criteres[i].filtrage(BiensCopy); 
	} 
	
      Bien b=null;
      Iterator<Bien> it =Biens.iterator();
	   while (it.hasNext())
	   {
		   b=it.next();
		   b.afficherDetails();
	   }
      
  } 
  
   public void contactUs ( String message ,Bien b)
  
   {     System.out.println(" Merci de nous avoir contacté , l'admin vous repondera dès que possible !");
	  System.out.println(" vous avez precisé le bien au nom :"+b.nom);
	   messages.add(message) ;
           
   }
   public void afficherMessages()
   {
	   String m="";
	   Iterator<String> it=messages.iterator();
	   while(it.hasNext())
	   {
		   
		  m=it.next();
		   System.out.println(" les messages sont :"+m);

		  }
	   
   }
   
   public boolean vendreBien(Bien b)
   {
	   return archiverBien(b);
   }
   
    public boolean echangeBien( Bien b)
    {
    	return archiverBien(b);
    }

   
   public boolean seConnecter(String nom , String motDepass)
   {
       if ((this.admin.nom.equals(nom)) &&(this.admin.motDepass.equals(motDepass))){
           System.out.println(" Vous etes connecté en mode ADMIN ! ");
           return true;
        }
       else {
           if(!(this.admin.nom.equals(nom))){
          System.out.println(" Le Nom est erroné ! ")  ;
           }
           else{
               if (!this.admin.motDepass.equals(motDepass))
               {
                    System.out.println(" Le mot de passe est erroné ! ")  ;
               }else{
                   if((!this.admin.nom.equals(nom)) &&(!this.admin.motDepass.equals(motDepass)))
                   {
                       System.out.println(" Le Nom et Le Mot de passe sont erronés ! ")  ;
                   }
               }
           }
           return false;
   }
   }
 }


