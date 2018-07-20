/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructraLineales;

import java.util.Arrays;

/**
 *
 * @author imagensala1juarez
 */
public class Arreglos {
    
    public static void main(String[] args) {
        int[] numeros = {6,8,2,5,1,9,3};
        
        for (int numero : numeros) {
            System.out.println("-> "+numero);
        }
        //Ordenar los datos
        Arrays.sort(numeros);
        
        System.out.println("----------------------------");
        
         for (int numero : numeros) {
            System.out.println("-> "+numero);
        }
         
         /*
          *  No se puede hacer una busqueda binaria sin ordenar..
          */
         //prime faces
         //Busqueda Binaria
         int valorBuscar = 5;
         
         if(Arrays.binarySearch(numeros, valorBuscar) >= 0){
             System.out.println("Si existe"); 
        }else{
             System.out.println("No existe");
         }
         
        
    }
}
