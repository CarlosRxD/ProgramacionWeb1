/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1;

/**
 *
 * @author cardo
 */
public class Nombre {
     public static String getVocales(String nombre){
        String vocales = "<p>       Las vocales en tu nombre '"+nombre+"' son: ";
        nombre=nombre.toLowerCase();
        for(int i=0;i<nombre.length();i++){
           char letra = nombre.charAt(i);
            if(esVocal(letra)){
                vocales+=letra;
            }
    }
        vocales+="</p>";
        return vocales;
    }
    public static boolean esVocal(char x){
        return (x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u');
    }
}