/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;
import java.*;


/**
 *
 * @author SAFA
 */
public abstract class  Bien implements Comparable<Bien>{ 
	
	//LocalDateTime currentTime = LocalDateTime.now();
	    String adress,descriptif;
                  String date = null ;
		public Transactions transaction;
	    double superficie;
            public double prix;
	    Wilaya wilaya;
	    Type type;
	    Proprietaire proprietaire;
	    boolean negociation ;//si le prix est négociable ou non 
		public String nom;
		public boolean archiver;
                Wilaya wilayaEchange;
       
	    public Bien(String adress, String nom, Type type,Wilaya wilaya, String descriptif, String date, Transactions transaction,Wilaya wilayaEchange, double superficie,double prix, Proprietaire proprietaire, boolean negociation) {
	        this.nom=nom;
	        this.type=type;// a revoir
	    	this.adress = adress;
	        this.wilaya = wilaya;
	        this.descriptif = descriptif;
	       this.date = date ;
               
               try{
	        this.prix=prix;
	        
	        this.superficie = superficie;
               }catch(NumberFormatException e) {
                 System.out.println("cette valeur doit étre  un nombre , essaie encore !");}
	       this.proprietaire = proprietaire;
               this.transaction = transaction;
                 if (transaction==Transactions.Echange)
                 this.wilayaEchange=wilayaEchange ;   
                 else   this.wilayaEchange=null;
                  
                
	        this.negociation = negociation;
	        this.archiver=false;
                 
  }
	    
	   double calculPrixVente()
	    {   
	    	double reslt=this.prix;
	        if ((this.prix<5000000 )&& (this.wilaya.getPrixMetres()<50000))
	        {
	            reslt +=(3*(reslt)/100);
	            
	        }
	        else 
	        { 
	           if ((this.prix >5000000) ||(this.wilaya.getPrixMetres()>50000))  
	        	   reslt+=(3.5*(reslt)/100);
	           else {
	                 if ((this.wilaya.getPrixMetres()<50000)&&(this.prix<15000000))
	                	 reslt+=(2*(reslt)/100);
	                 else reslt+=(2.5*(reslt)/100);
	                 
	                     }
	           if ((reslt>15000000)&&(this.wilaya.getPrixMetres()<70000))
	        	   reslt+=(2*(reslt)/100);
	           else 
	        	   (reslt)+=(2.5*(reslt)/100);
	           
	        } 
	        
	    
	    return (reslt); 
	        
	       
	    }
           double claculPrix()
           {    double prix2 = 0;
               if (this.transaction==Transactions.Echange)
                   prix2= this.calculPrixEchane();
               if (this.transaction==Transactions.Vente)
                   prix2= this.calculPrixVente();
               if (this.transaction==Transactions.Location)
                    prix2=  this.calculPrixLocation();
               return prix2;
           }
	    
	    double calculPrixLocation()
	    {  
	    	double reslt=this.prix;
	        if ((this.superficie<60) && (this.wilaya.getPrixMetres()<50000))
	        	(reslt)+=((reslt)/100);
	        
	        else 
	        { if ((this.superficie<60) && (this.wilaya.getPrixMetres()>=50000))
	        	
	        	(reslt)+=(1.5*(reslt)/100);
	        else
	        { if (((this.superficie<=150 ) && (this.superficie >=60 ))&& (this.wilaya.getPrixMetres()<50000))
	             
	        	(reslt)+=(2*(reslt)/100); 
	         else 
	           {  if (((this.superficie<=150 ) && (this.superficie >=60 ))&& (this.wilaya.getPrixMetres()>=50000))
	             
	        	   (reslt)+=(2.5*(reslt)/100);
	           else
	                {
	                  if ((this.superficie>150 )&&(this.wilaya.getPrixMetres()<50000))
	             
	                	  (reslt)+=(3*(reslt)/100);
	                  else 
	                   {   if ((this.superficie>150 )&&(this.wilaya.getPrixMetres()>=50000))
	             
	                	   (reslt)+=(3.5*(reslt)/100);
	                   }
	              }
	            
	           }
	        }      
	        }    
	        return (reslt);     
	    }
	    double calculPrixEchane()
	    {
	    	double reslt=0;
	    	(reslt)=this.calculPrixVente();
	        if (this.wilaya==this.wilayaEchange)
	        	(reslt)+=(0.25*(reslt)/100);
	        return (reslt);
	    }
	    public void afficher()
	    {    if(this.archiver != true)
	       System.out.println(  " le nom : " +this.nom+ " : " +descriptif+ "\n");
	    }

	    public String getAdress() {
	        return this.adress;
	    }

	    public String getDescriptif() {
	        return this.descriptif;
	    }

	    public String getDate() {
	        return this.date;
	    }

	    public Transactions getTransaction()
	    {
	        return this.transaction;
	    }

	    public double getSuperficie() {
	        return this.superficie;
	    }

	    public double getPrix() {
	        return this.prix;
	    } 

	    public Wilaya getWilaya() {
	        return this.wilaya;
	    }
	    
	    public Type getType()
	    {
	    	return this.type; 
	    }

	    public Proprietaire getProprietaire() {
	        return this.proprietaire;
	    }

	    public boolean isNegociation() {
	        return this.negociation;
	    }
		public String getNom()
		{
			return this.nom;
		}
		
		public int compareTo(Bien p)
		{       
			String n =p.getDate(); 
                        
                            
                      
		             return this.date.compareTo(n); 
		}
	    
		public abstract void afficherDetails();
	    
	    
	}


