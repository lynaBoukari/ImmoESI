/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;

import java.util.*;


public class CriterePrixMin implements Criteres {

	
	private double prixMin;
	public CriterePrixMin(double prixMin)
	{
		this.prixMin=prixMin;
	}
	
	@Override
	public Set<Bien> filtrage(Set<Bien>  biens) {
		
		 TreeSet<Bien> toRemove= new TreeSet<Bien>();
		  for(Bien b : biens )
		 {       if(b.prix<this.prixMin)
			 toRemove.add(b);
		      }
                 biens.removeAll(toRemove);
		 
		return biens;
	}

}

