/**
 * Programa que imprime que lavou o carro que você digita como input
 * 
 * @author Maryxlu
 * @version 09/07/2024
 */
package br.ufg.poo.g7;

import java.util.Scanner;

public class LavaJato extends LavarCarro{
    static String carro;
    /**
     * Metodo principal onde roda todo o codigo
     */
public static void main(String[] args) {
    System.out.println("Escreva a marca do seu carro:");
    try (Scanner scan = new Scanner(System.in)) {
        carro = scan.nextLine();
    }
    System.out.println(lavarCarro(carro));
}

/**
 * Metodo que retorna a frase de como o carro foi lavado
 *  
 * @return retorna uma frase de como o carro foi lavado
 */
public static String lavarCarro(String carro) {
    return "Carro: " + carro + " foi lavado.";
}
}