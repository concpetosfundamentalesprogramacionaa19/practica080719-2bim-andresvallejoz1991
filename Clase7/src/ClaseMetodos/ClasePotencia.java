/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMetodos;

/**
 *
 * @author andre
 */
public class ClasePotencia {
    public static int get_potencia(int base, int exponente) {
        
        if (exponente == 1) {
            return base;
        } else{
            
            return base * get_potencia(base, exponente - 1);
        }
    }

    
}
