/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_1;

/**
 *
 * @author cardo
 */
public class Tabla {
    public static String getTabla(int tabla){
        String r="";
        for(int i=1;i<=10;i++){
            r=r+"<tr>";
            r=r+"<td>"+tabla+"</td><td>*</td><td>"+i+"</td><td>=</td><td>"+tabla*i+"</td>";
            r=r+"</tr>";
        }
        return r;
    }
}
