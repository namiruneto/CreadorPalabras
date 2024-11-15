/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creadorpalabras.Logic;

/**
 *
 * @author Namiruneto
 */
public class Word {
    private String value;
    
    public Word(String value){
        this.value = value;
    }
    
    public  String getValue(){
        return  value;
    }
    
    @Override
    public String toString(){
        return value;
    }
}
