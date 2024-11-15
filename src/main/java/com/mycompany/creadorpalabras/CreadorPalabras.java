/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.creadorpalabras;

import com.mycompany.creadorpalabras.Logic.GeneradorPalabras;
import com.mycompany.creadorpalabras.Logic.WordFactory;
import com.mycompany.creadorpalabras.Logic.Word;
import java.util.List;

/**
 *
 * @author Namiruneto
 */
public class CreadorPalabras {

    public static void main(String[] args) {
        GeneradorPalabras generadorPalabras = new GeneradorPalabras();
        WordFactory wordFactory = new WordFactory(generadorPalabras);
        List<Word> words = wordFactory.generadorNuevasPalabras(5,3);
        for(Word word : words){
            System.out.println(word);
        }
    }
}
