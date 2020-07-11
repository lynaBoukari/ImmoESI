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


public class Proprietaire implements Comparable<Proprietaire>{

	private String nom, prenom,email,tel,adresse;
	public  Set<Bien> listeBien;
	
	public Proprietaire ( String nom ,String prenom,String email,String tel,String adresse)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.tel=tel;
		this.adresse=adresse; 
		listeBien = new TreeSet <Bien>();
	}
	
	public String getNom()
	{
		return this.nom; 
	}
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public int compareTo(Proprietaire p)
	{ 
		String n=p.getNom();  
	  return this.nom.compareTo(n); 
	}
	
	public boolean ajouterBien(Bien b)
	{
		return listeBien.add(b); 
	}
	
	public void afficherProprietaireDetails()
	{
		System.out.println(" Le proprietaire :"+this.getNom()+ " "+this.getPrenom()+" Adresse :"+this.adresse+" Telephone :"+this.tel+"  Email :"+this.email+" .");
	}
	
	
	public void afficherBien()
	{
		   
		   for(Bien b :listeBien)
		   {
			   
			   b.afficher();
		   }
    }

	
	
	
}


