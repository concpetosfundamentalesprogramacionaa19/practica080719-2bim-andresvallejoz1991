/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseArreglos;

/**
 *
 * @author andresvallejoz1991
 */
public class Principal {
      public static void main(String[] args) {
          int arreglo[] = {10,20,30,1,2,3,40,4};
          int v1 = ClaseArreglos.obtenerTamanioArreglo( arreglo , 8);
          System.out.printf("Arreglo [1] = %d",v1);
          int v2 = ClaseArreglos.obtenerTamanioArreglo2(arreglo, 8);
          System.out.printf("\nArreglo [2] = %d\n", v1);
      }
}
