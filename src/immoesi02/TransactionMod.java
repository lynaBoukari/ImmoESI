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
public class TransactionMod implements Modifiable {
    Transactions trans;

    public TransactionMod(Transactions trans) {
        this.trans=trans;
    }
    
    @Override
    public void modifier(Bien b) {
      b.transaction=this.trans;
    }
    
}
