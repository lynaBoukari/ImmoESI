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
public class SupHabitableException extends Exception {
    

    /**
     * Creates a new instance of <code>SupHabitableException</code> without
     * detail message.
     */
    public SupHabitableException() {
        System.out.println("la surface habitable ne peut pas étre plus grande que la surface totale ");
    }

    /**
     * Constructs an instance of <code>SupHabitableException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SupHabitableException(String msg) {
        super(msg);
    }
}
