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
public class NomMod implements Modifiable{
     String nom;
    public NomMod(String nom) {
        this.nom=nom;
    }

    @Override
    public void modifier(Bien b) {
        b.nom=this.nom;
               
    }
    
    
}
