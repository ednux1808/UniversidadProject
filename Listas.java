/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructraLineales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author imagensala1juarez
 */
public class Listas {
    
    
    
    public static void main(String[] args) {
        List<String> lista =  new ArrayList<>();
        Map<String,Integer> tabla = new HashMap<>();
        
        lista.add("uno");
        lista.add("tres");
        lista.add("dos");
        
        tabla.put("eduardo",19);
        tabla.put("elias",21);
        tabla.put("alex",18);
        tabla.put("nose",17);
        
        for (Map.Entry<String, Integer> entry : tabla.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Nombre :"+key+" Edad: "+value);
            
        }
        
        
        lista.forEach((cadena) -> {
            System.out.println("-> "+cadena);
        });
        
        
    }
    
}
