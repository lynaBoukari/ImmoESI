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
public class PrixMod implements Modifiable {

    
   private double prix ;

    public PrixMod(double prix) {
        this.prix = prix;
    }
    
    @Override
    public void modifier(Bien b) {
        b.prix=this.prix;
        
    }
    
    
}
