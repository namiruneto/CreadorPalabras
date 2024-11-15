/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creadorpalabras.Logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Namiruneto
 */
public class WordFactory {
    private GeneradorPalabras generadorPalabras;
    public  WordFactory(GeneradorPalabras generador){
        this.generadorPalabras = generador;
    }
    
    public List<Word> generadorNuevasPalabras(int numPalabras, int NumeroTamaño){    
    List<Word> words = new ArrayList<>();
    for (int i = 0; i < numPalabras; i++){
        words.add(generadorPalabras.GenradorPalabras(NumeroTamaño));
    }
    return words;
}
}
