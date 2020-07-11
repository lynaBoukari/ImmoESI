/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author SAFA
 */

public class Maison extends Habitable { 
	
	
	int nbrEtage ;//le nombre d'etage 
    boolean garage, picsine, jardin;
    double superfHab;//superficie habitable

     public Maison (int nbrEtage, String nom,Type type ,boolean garage, boolean picsine, boolean jardin, double superfHab, int nbrPieces, boolean meuble, String adress, Wilaya wilaya, String descriptif, String date, Transactions Transaction, Wilaya wilayaEchange, double superficie, double prix, Proprietaire proprietaire, boolean Negociation) throws SupHabitableException,NegativeException{
       
         super(nbrPieces, nom,type,meuble, adress, wilaya, descriptif, date, Transaction,wilayaEchange, superficie, prix, proprietaire, Negociation);
        if (superfHab > superficie)
            throw  new SupHabitableException();
        if(nbrEtage<0) 
            throw new NegativeException() ;
        this.nbrEtage = nbrEtage;
        this.garage = garage;
        this.picsine = picsine; 
        this.jardin = jardin;
        this.superfHab = superfHab;
       
    }

    
   
   @Override
    public double calculPrixVente()
    { 
    	double reslt=super.calculPrixVente();
        if ((garage==true)||(picsine==true) ||(jardin==true))
        { 
        	(reslt)+=(0.5*(reslt)/100);
        }
     return (reslt);
     
    }

    /**
     *
     * @return
     */
    @Override
    public double calculPrixLocation()//redifinition du methode calculPrixLocation du class Bien
    { double reslt =super.calculPrixLocation();
        if (picsine==true)
        	(reslt)+=50000;
       return (reslt);     
    }
     
    @Override 
    public void afficherDetails()
    {  if(this.archiver==false) {
        super.afficherDetails();
        System.out.println("Nombre d'etages  :"+this.nbrEtage);
        System.out.println("superficie Habitable : " +this.superfHab+" m²");
        System.out.println("Garage ?:"+ this.garage +" Picine ? :"+  this.picsine+" Jardin ? :"+ this.jardin); 
    }
    
    }
    
}

