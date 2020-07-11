/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CritereNbrPieces implements Criteres{

	private int nbrPieces ;
	public CritereNbrPieces (int nbrPieces )
	{
		this.nbrPieces=nbrPieces;
	}
	
	@Override
	public Set<Bien> filtrage(Set<Bien>  biens) {
		
		 TreeSet<Bien> toRemove= new TreeSet<Bien>();
		 for(Bien b: biens )
		 {
			
                Type tp = b.type;	   
			 if("Appartement".equals(tp.getType()))
			 {
				 if(((Appartement)b).nbrPieces<this.nbrPieces)
				 {
					 toRemove.add(b);
				 }
			 }else
			 
			 {
				 if("Maison".equals(tp.getType()))
				 {
					 if(((Maison)b).nbrPieces<this.nbrPieces)
					 {
						 toRemove.add(b);
					 }
				 }
				 
		
	       }
       }
                 
                 biens.removeAll(toRemove);
		 return biens;
   }


}
