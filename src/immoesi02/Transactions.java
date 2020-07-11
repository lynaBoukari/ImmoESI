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
public enum Transactions {
	
	Vente("Vente"),
	   Location("Location"),
	   Echange("Echange");
	   private final String transaction;
	    private Transactions(String transaction)
	   { this.transaction=transaction;
	    }
	    public String getTransaction()
	    {return this.transaction;
	    }
	};
