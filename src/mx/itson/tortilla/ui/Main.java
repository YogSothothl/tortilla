/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.ui;
import mx.itson.tortilla.negocio.Operacion;
import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;


/**
 *
 * @author Propietario
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Escriba el enunciado separado: ");
       
        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
        
        String[] resultado = new Operacion().seprar(enunciado);
        
       for(String s : resultado){
           System.out.println(s);
       }
    }
    
    
}
