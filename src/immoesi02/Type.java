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

public enum Type {
	Appartement("Appartement"),
	Maison("Maison"),
	Terrain("Terrain");
	
	private final String type;
	private Type(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return this.type;
	}

};

