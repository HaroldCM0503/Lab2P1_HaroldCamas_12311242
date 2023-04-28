/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_haroldcamas_12311242;
import java.util.Scanner;
/**
 *
 * @author harol
 */
public class Lab2P1_HaroldCamas_12311242 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean respuesta = true;
        while (respuesta){
            System.out.println("1.)Clasificacion");
            System.out.println("2.)Aproximar Pi");
            System.out.println("3.)MCD");
            System.out.println("4.)Salir");
            int opcion = 0;
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese su numero a analizar:");
                    int numero = 0;
                    numero = leer.nextInt();
                    while (numero <= 0){ //Validacion.
                        System.out.println("Elija un numero positivo:");
                        numero = leer.nextInt();
                    }
                    
                    boolean es_primo = true;
                    int contador = 2;
                    
                    //Comprobacion de si es primo o no.
                    while (contador < numero){
                        if (numero%contador == 0 ){
                            es_primo = false;
                            break;
                        }
                        else{
                            contador += 1;
                        }   
                    }
                    
                    //Comprobacion de si es par o no para ver cual respuesta le pertenece.
                    if (numero%2 == 0){ 
                        if (es_primo == true){
                            System.out.println("El numero es par y primo");
                        }
                        else {
                            System.out.println("El numero es solo par.");
                        }
                    }
                    
                    else { 
                        if (es_primo == true){
                            System.out.println("El numero es impar y primo");
                        }
                        else {
                            System.out.println("El numero es solo impar");
                        }
                    }
                    break;//Fin caso 1.
                    
                case 2:
                    System.out.println("Ingrese la precision del calculo");
                    int limite = 0;
                    limite = leer.nextInt();
                    
                    while (limite <= 0){
                        System.out.println("Elija un numero valido");
                        limite = leer.nextInt();
                    } //Fin validacion.
                    
                    int variable = 1;
                    double productoria = 1;
                    double numerador = 1;
                    double denominador = 1;
                    double division = 1;
                    
                    while (variable <= limite){
                        numerador = 4*Math.pow(variable, 2);
                        denominador = 4*Math.pow(variable, 2) - 1;
                        division = numerador/denominador;
                        productoria *= division;
                        variable++;
                    }
                    productoria *= 2;
                    System.out.println("El resultado es: " + productoria);
                    break;//Fin caso 2.
                    
                    
                case 3:
                    System.out.println("Escoja su primer numero: ");
                    int original_a = 0;
                    original_a = leer.nextInt();
                    
                    while (original_a <= 0){ //Validacion.
                        System.out.println("Elija un primer numero valido");
                        original_a = leer.nextInt();
                    }
                    
                    int numero_a = original_a;
                    //Uso 2 variables una para poder alterarla mas adelante y la original la dejo solo para usarla en el print final y perderla.
                    
                    System.out.println("Escoja su segundo numero: ");
                    int original_b = 0;
                    original_b = leer.nextInt();
                    
                    while (original_b <= 0){ //Validacion.
                        System.out.println("Elija un segundo numero valido");
                        original_b = leer.nextInt();
                    } 
                    
                    int numero_b = original_b;
                    //La misma copia que en la variable anterior.
                    
                    while (numero_a != numero_b){ //Ciclo principal para sacar el MCD.
                        if (numero_a > numero_b){
                            numero_a -= numero_b;
                        }
                        else {
                            numero_b -= numero_a;
                        }
                    }
                    System.out.println("El MCD de " +original_a +" y " +original_b +" es: " +numero_a);//Tambien se puede usar el numero_b pero como son el mismo en este momento la eleccion da igual.
                    break;//Fin caso 3.
                    
                case 4:
                    respuesta = false;
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;      
            }
        }
    }  
}
