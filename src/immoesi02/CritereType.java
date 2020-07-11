/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immoesi02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CritereType implements Criteres {

	
	private Type type;
	public CritereType(Type type)
	{
		this.type=type;
	}
	
	@Override
	public Set<Bien> filtrage(Set<Bien>  biens) {
		 TreeSet<Bien> toRemove= new TreeSet<Bien>();
		  for(Bien b : biens )
		 {       if(b.type!=this.type)
			 toRemove.add(b);
		      }
                 biens.removeAll(toRemove);
		 
		return biens;
	
	}
}
