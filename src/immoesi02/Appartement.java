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

public class Appartement extends Habitable {

	
	
	int etage ;
        TypeAppartement typeAppartement;//a revoir 
    boolean asc;

    public Appartement(int etage, TypeAppartement typeAppartement, boolean asc, int nbrPieces, String nom, Type type, boolean meuble, String adress, Wilaya wilaya, String descriptif, String date, Transactions Transaction,Wilaya wilayaEchange, double superficie, double prix, Proprietaire proprietaire, boolean Negociation) throws NegativeException {
        
        super(nbrPieces, nom, type, meuble, adress, wilaya, descriptif, date, Transaction,wilayaEchange, superficie, prix, proprietaire, Negociation);
        if (etage<0) throw new NegativeException();
        this.etage = etage;
        this.typeAppartement = typeAppartement;
        this.asc = asc;
    }

 
    


  

  @Override
  public double calculPrixVente()
  {prix= super.calculPrixVente();
     if (etage<2 ) 
        prix+=50000; 
  return prix;
  }
  @Override
  public double calculPrixLocation(){
      prix=super.calculPrixLocation();
       if (etage<2 ) 
        prix+=5000;
       if(etage>6 && asc==false)
           prix-=(500*  wilaya.getPrix());
      
       return prix;
  }
  
  
  @Override
  public void afficherDetails()
  {
      super.afficherDetails();
      System.out.println("F"+this.nbrPieces);
      System.out.println("pour"+this.transaction);
  }
}
