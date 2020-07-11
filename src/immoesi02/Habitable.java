/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;


import java.time.*;

/**
 *
 * @author SAFA
 */

public class Habitable extends Bien {
	
	 int nbrPieces;
	    boolean meuble;

	    public Habitable(int nbrPieces,String nom,Type type, boolean meuble, String adress,Wilaya wilaya, String descriptif, String date, Transactions Transaction, Wilaya wilayaEchange, double superficie, double prix, Proprietaire proprietaire, boolean Negociation) throws NegativeException {
	        
                super(adress, nom,type,wilaya, descriptif, date, Transaction,wilayaEchange, superficie, prix, proprietaire, Negociation);
	        if (nbrPieces <=0) 
                    throw new NegativeException();
                this.nbrPieces = nbrPieces;
	        this.meuble = meuble;
	    }

			@Override
		public void afficherDetails() 
{   if(this.archiver!=true) {
			
	System.out.println(" Le Bien :"+this.getNom());
	Type tp =this.type;
    System.out.println(" Le type du bien est :"+ tp.getType());
	System.out.println(" wilaya:" +this.getWilaya());
	System.out.println(" adresse : "+this.getAdress());
	System.out.println(" date d'ajout :"+this.getDate());
    System.out.println(" Transaction :"+this.getTransaction());
    System.out.println(" superfecie en metre caré :"+this.getSuperficie());
	System.out.println(" nombre de pieces :"+this.nbrPieces);
    System.out.println(" meuble ? :"+this.meuble);
    Proprietaire p =this.getProprietaire();
    p.afficherProprietaireDetails();
	System.out.println("un descriptif du bien : "+this.getDescriptif());
	System.out.println(" le prix du bien est :"+this.getPrix());
	System.out.println(" Negociation ? :"+this.isNegociation());
							
		}										
	}
		
		

}
