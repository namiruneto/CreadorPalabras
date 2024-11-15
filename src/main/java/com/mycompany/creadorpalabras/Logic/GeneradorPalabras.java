/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creadorpalabras.Logic;

import com.mycompany.creadorpalabras.Logic.Interface.NuevaPalabra;
import java.util.Random;

/**
 *
 * @author Namiruneto
 */
public class GeneradorPalabras implements NuevaPalabra{
    private static final char[] char_array = {
        'w', 'e', 'r', 'f', 'b','b','h','j','i','u','y','t','r','e','d','f','g','u','t','r','e','s','d','f','g','y','u','i','o','l','k','m','n','b','v','f','r','e','w','s','x','t','g','y','u','i','k','m','n','b','v','f','r','e','w','w','r','t','y','u','i','o','k','m','n','b','v','d',
        'w','s','x','c','f','g','h','u','i','o','p','l','k','n','b','v','f','d','e','w','a','z','x','c','g','h','u','i','o','p','u','y','t','r','e','w','q','s','d','f','g','k','j','b','v','c','x'
            
    };
            
    private Random random;
    public GeneradorPalabras(){
        this.random = new Random();
    }
    
    @Override
     public Word GenradorPalabras(int length){
         StringBuilder wordBuilder = new StringBuilder();
         for(int i = 0; i< length; i++){
             char randomChar = char_array[random.nextInt(char_array.length)];
             wordBuilder.append(randomChar);
         }
         return new Word(wordBuilder.toString());
     }
    
}
