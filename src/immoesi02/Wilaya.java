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

public enum Wilaya {

	    Adrar("Adrar",100000),

	    Chlef("Chlef",30000),

	    Aghouat("Aghouat",60000),

	    OumElBouaghi("OumElBouaghi",20000),

	    Batna("Batna",20000),

	    Bejaia("Bejaia",70000),

	    Biskra("Biskra",30000),

	    Bechar("Bechar",30000),

	    Blida("Blida",50000),

	    Bouira("Bouira",50000),

	    Tamenrasset("Tamenrasset",40000),

	    Tebessa("Tebessa",30000),

	    Telemcen("Telemcen",60000),

	    Tiaret("Tiaret",30000),

	    TiziOuzou("TiziOuzou",50000),

	    Alger("Alger",100000),

	    Djelfa("Djelfa",40000),

	    Jijel("Jijel",50000),

	    Setif("Setif",60000),

	    Saida("Saida",50000),

	    Skikda("Skikda",50000),

	    SidiBelAbbes("SidiBelAbbes",40000),

	    Annaba("Annaba",80000),

	    Guelma("Guelma",40000),

	    Constantine("Constantine",50000),

	    Medea("Medea",50000),

	    Mostaganem("Mostaganem",70000),

	    Msila("Msila",50000),

	    Mascara("Mascara",50000),

	    Ouergla("Ouergla",25000),

	    Oran("Oran",80000),

	    Bayadh("Bayadh",30000),

	    Illizi("Illizi",20000),

	    BordjBouArreridj("BordjBouArreridj",65000),

	    Boumerdes ("Boumerdes",50000),

	    Taref("Taref",50000),

	    Tindouf("Tindouf",25000),

	    Tissemsilt("Tissemsilt",40000),

	    Oued("Oued",20000),

	    Khenchela("Khenchela",30000),

	    SoukAhras("SoukAhras",50000),

	    Tipaza("Tipaza",50000),

	    Mila("Mila",50000),

	    AinDefla ("AinDefla",40000),

	    Naama("Naama",40000),

	    Temouchent ("Temouchent",50000),

	    Ghardaia ("Ghardaia",40000),

	    Relizane ("Relizane",40000);

	    private final String wilaya;
	    private final double prixMetres;
	    private Wilaya(String wilaya, double prixMetres)
	    {this.wilaya=wilaya;
	        this.prixMetres=prixMetres;
	    }

	    public String getWilaya(){
	        return this.wilaya;
	    }

	    public double getPrixMetres()
	    {return this.prixMetres;
	    }

    int getPrix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	} ;
