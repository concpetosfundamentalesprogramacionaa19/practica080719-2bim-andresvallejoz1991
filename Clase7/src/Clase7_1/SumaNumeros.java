/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7_1;

/**
 *
 * @author andre
 */
public class SumaNumeros {
    
    public static int ObtenerSumaNumeros( int a){
        int suma = 0;
        for(int i = 1 ;i<=a; i++){
            
            suma = suma+1;
        } 
        return suma;
        
    }
    
    public static int ObtenerSuma2(int valor){
        if (valor <=0){
            return 0; 
        }else{
            return valor + ObtenerSuma2(valor-1);
        }
    }
}
