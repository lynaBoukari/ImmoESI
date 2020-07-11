/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;

/**
 *
 * @author SAFA
 */
import java.util.*;
public class Terrain extends Bien {
	
	    private  int nbrFacade ; //nombre des facade 
	    private ArrayList<String> sttjuridiques; 
            
    public Terrain(int nbrFacade, ArrayList<String> sttjuridiques, String adress, String nom, Type type, Wilaya wilaya, String descriptif, String date, Transactions transaction, Wilaya wilayaEchange, double superficie, double prix, Proprietaire proprietaire, boolean negociation) {
        super(adress, nom, type, wilaya, descriptif, date, transaction,wilayaEchange, superficie, prix, proprietaire, negociation);
        this.nbrFacade = nbrFacade;
        this.sttjuridiques = sttjuridiques;
    }

 @Override
	    public double calculPrixVente()//a revoir ca
	    {
		   double reslt =super.calculPrixVente();
	        if(this.nbrFacade>1)
	        	reslt+=(0.5*(this.nbrFacade))*prix/100; // a revoirrrrrrrrrrrrrr
	        return reslt;
	    }
	    
	   
	   @SuppressWarnings("static-access")
	   
	  public void afficherStatut()
	   {
		   if (!(this.sttjuridiques).isEmpty() && this.archiver==true)
		   {
			   for (int i = 0; i< sttjuridiques.size(); i++)
			   { System.out.println(" URL du Statut juridique "+i+1+" :"+sttjuridiques.get(i)); 
		        }
		   }
	   }
	   
	   public void afficherDetails()
	   {     if(this.archiver!=true)
	   {
		   System.out.println(" Le Bien :"+this.getNom());
		   Type tp =this.type;
		   System.out.println(" Le type du bien est :"+ tp.getType());
			System.out.println(" wilaya:" +this.getWilaya());
			System.out.println(" adresse : "+this.getAdress());
			System.out.println(" date d'ajout :"+this.getDate());
		    System.out.println(" Transaction :"+this.getTransaction());
		    System.out.println(" superfecie en metre caré :"+this.getSuperficie());
		    System.out.println(" Nombre de façades est :"+this.nbrFacade);
		    this.afficherStatut();
		    Proprietaire p =this.getProprietaire();
		    p.afficherProprietaireDetails();
			System.out.println("un descriptif du bien : "+this.getDescriptif());
			System.out.println(" le prix du bien est :"+this.getPrix());
			System.out.println(" Negociation ? :"+this.isNegociation());
	   }						
	   }

}

