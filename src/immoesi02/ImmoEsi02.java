/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;


import java.time.*;
import java.util.*;

/**
 *
 * @author SAFA
 */
public class ImmoEsi02 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        // declaration des criteres
        CriterePrixMax pmax=new CriterePrixMax(10000000);
        CritereWilaya wil=new CritereWilaya(Wilaya.Adrar);
        Criteres[] criteres ={pmax,wil};
        // declaration des attribut modifiable
        PrixMod prix =new PrixMod(1000000);
        Modifiable[] modifiables ={prix}; 
        
        // declaration des type des biens
        Type type1=Type.Maison;
        Type type2=Type.Appartement;
        Type type3=Type.Terrain;
        
        //declarations des type d'appartements
        TypeAppartement sump =TypeAppartement.Sumplexe;
         TypeAppartement dub =TypeAppartement.Dublexe;
         
         // declarations des transactions
          Transactions vente =Transactions.Vente;
          Transactions echange =Transactions.Echange;
          Transactions location =Transactions.Location;
          
          // declaration de la liste des statuts juridique du terrain
          ArrayList<String> sttjuridiques = null ;
          
          // declarations des wilayas
        Wilaya wilaya1= Wilaya.Adrar;
        Wilaya wilaya2= Wilaya.Chlef;
        Wilaya wilaya3= Wilaya.Aghouat;
      
          
        // instancier un objet Agence
        Agence agence = new Agence();  
        
        // gerer les exceptions : negativeException , superficie Hbitable> superficie totale , NumberFormatException
        try{
        // declarations des proprietaires
        Proprietaire prop1= new  Proprietaire("Laouici","Safa","is_laouici@esi.dz","077777","Mila");
        Proprietaire prop2= new  Proprietaire("Boukari","Lyna","ib_boukariesi.dz","0666666","Béjaia");
        Proprietaire prop3= new  Proprietaire("Laouici","Haytem","ih_laouici@esi.dz","0555555","Mila");
        Proprietaire prop4= new  Proprietaire("Boukari","Youcef","iy_boukari@esi.dz","0111111","Béjaia");
        
        // declarations des biens
      
          Appartement bien1 = new Appartement(1,dub,false,4,"bien1",type2,false,"centre ville Chlef",wilaya2," Appartement duplex bon état situé a Adrar pour vente . ","02/01/2020",vente,null,120,4000000,prop2,false);
          Maison bien2 = new Maison(1,"bien2",type1,false,false,true,180,4,false,"centre ville Aghouat",wilaya3,"Maison bon état située a Adrar avec jardin pour vente .","03/01/2020",vente,null,200,20000000,prop1,true);
          Terrain bien3= new Terrain(3,sttjuridiques,"centre ville Adrar"," bien 3 ",type3,wilaya1,"Terrain de 500 metres carré situé a Adrar pour vente.","04/01/2020",vente,null,500,20000000,prop1,false);
          Appartement bien4 = new Appartement(1,dub,false,3,"bien4",type2,false," centre ville Aghouat",wilaya3," Appartement duplex bon état a Aghouat pour Location .","05/01/2020",location,null,100,4000000,prop2,false);
           Maison bien5 = new Maison(1,"bien5",type1,false,true,false,140,4,false,"centre ville Chlef .",wilaya2,"Maison bon état avec picine située en plein centre de Chlef pour location. ","06/01/2020",location,null,160,150000,prop3,true);
          Appartement bien6 = new Appartement(6,sump,false,1,"bien6",type2,false," ouest de l'Aghouat",wilaya3,"Appartement simplex bon état situé a ouest de l'Aghouat pour Location. ","07/01/2020",location,null,50,600000,prop2,false);
          Terrain bien7= new Terrain(1,sttjuridiques,"centre ville Adrar","  bien 7",type3,wilaya1,"Terrain de 650 metres carré situé a Adrar pour echange avec wilaya d'aghouat  .","08/01/2020",echange,wilaya3,650,18000000,prop1,false);
          Maison bien8 = new Maison(1,"bien8",type1,true,false,false,140,4,false," centre ville Chlef",wilaya2,"Maison bon état située au centre ville de Chlef avec garage pour echange a chlef .","09/01/2020",echange,wilaya2,200,14000000,prop2,true);
          Maison bien9 = new Maison(1,"bien9",type1,true,false,false,140,4,false,"Chlef",wilaya2," Maison bon état située au centre ville de Chlef avec garage pour echange a chlef . ","10/01/2020",echange,wilaya2,200,15000000,prop2,true);
            
          // se connecter en tant qu'admin
          boolean mode=agence.seConnecter("lyna", "safa"); 
          
          // si on est en  mode admin :
          if (mode==true){
          // ajouter les biens a la liste
            agence.insererBien(bien1, (bien1).getProprietaire());
            agence.insererBien(bien2, (bien2).getProprietaire());
            agence.insererBien(bien3, (bien3).getProprietaire());
            agence.insererBien(bien4, (bien4).getProprietaire());
            agence.insererBien(bien5, (bien5).getProprietaire());
            agence.insererBien(bien6, (bien6).getProprietaire());
            agence.insererBien(bien7, (bien7).getProprietaire());
            agence.insererBien(bien8, (bien8).getProprietaire());
          
            // afficher tout les biens
            System.out.println(" Afficher la liste de tous les biens ");
            agence.afficherBiens();
            
           
		
                
            
           // afficher les biens d'un proprietaire 
            System.out.println("Afficher les bien d'un proprietaire \n ");
          agence.afficherProprietaire("Boukari", "Lyna");
          // inserer un autre bien
          System.out.println("inserer un autre bien ");
          agence.insererBien(bien9, (bien9).getProprietaire());
           agence.afficherBiens();
          // supprimer un bien 
           System.out.println("supprimer un bien \n");
          agence.supprimerBien(bien7);
          agence.afficherBiens();
          // archiver un bien
           System.out.println("archiver un bien\n ");
          agence.archiverBien(bien2);
          agence.afficherBiens();
          
          
          // selectionner un bien == afficher tout ses details
           System.out.println("selectionner un bien == afficher tout ses details \n");
          agence.selectionnerBien(bien8);
           
          // recherche par criteres 
          System.out.println("recherche par criteres \n");
          agence.rechercheCriteres(criteres);
          
          // Calculer les prix finaux des biens
          System.out.println("Calculer les prix finaux des biens \n");
           int i=0;
            for (Bien b : Agence.Biens)
            { i++;
                System.out.println("Le prix final du bien n : "+i+"est:" +b.claculPrix());
                 
            }
            
            
          // modifier qlq attributs d'un bien( Nom transaction prix)
           System.out.println("modifier qlq attributs d'un bien \n");
           System.out.println("AVANT MODIFICATION : \n");
           bien9.afficherDetails();
           agence.modifierBien(bien9,modifiables);
           System.out.println("APRES MODIFICATION :\n");
           bien9.afficherDetails();
          
          // Calculer le prix final du bien modifié
            System.out.println("Calculer le prix final du bien modifié \n ");
            double prixfinale = bien9.claculPrix();
            System.out.println("le prix du bien modifié est : "+prixfinale);
            
            // envoyer un message a l'agence en precisant le bien concerné
           
            System.out.println("envoyer un message a l'agence en precisant le bien concerné \n");
            agence.contactUs(" bonjour le bien suivant m'interesse pour l'acheter . \n", bien9);
            
            
            
          
          

      
          }
      }
	
      catch (NegativeException e)
      {
          new NegativeException(); 
      }
      catch (SupHabitableException e)
      {
          new SupHabitableException();
      }
     catch (NumberFormatException e){
        System.out.println(" les parametres entrés sont incompatibles! \n");
         
     }
            
      
      }
    
    
    }

    

