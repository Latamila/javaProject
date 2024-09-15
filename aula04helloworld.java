/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasjavas;

/**
 *
 * @author Dell
 */
public class aula04helloworld {
    public static void main(String[] args){
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        
        int resto = 22 % 7;
        System.out.println(resto);        
        
        boolean isDezMaiorqueVinte = 10 > 20;
        boolean isDezMenorqueVinte = 10 < 20;
        boolean isDezIgualqueVinte = 10 == 20;                
        boolean isDezIgualDez = 10 == 10.0;
        
        System.out.println("Dez maior que vinte? "+isDezMaiorqueVinte);         
        System.out.println("Dez menor que vinte? "+isDezMenorqueVinte);        
        System.out.println("Dez igual a vinte? "+ isDezIgualqueVinte);        
        System.out.println("Dez igual a dez? "+ isDezIgualDez);

        
    }
}
