/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.binaria;

import java.util.Scanner;

/**
 *
 * @author Arodi
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        n: Arreglo de numeros ingresados por el usuario
        inf: Posicion inferior 
        sup: Posicion superior
        b: Numero que buscara el usuario
        con: Confirmador que dira si el numero ha sido encontrado
        */
        int n[] = new int [5], inf=0, mit=0, sup=5, b;
        boolean con=false;
        
        //Se le pide al usuario que llene el arreglo
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"/5 Imgrese un numero:");
            n[i] = sc.nextInt();
        }
        
        //Se le pedira al usuario que ingrese el numero que desea buscar dentro del arreglo
        System.out.println("Ingrese el numero que desee buscar:");
        b = sc.nextInt();
        
        //Se crea un bucle que se repetira mientras la posicion inferior sea menor o igual a la posicion superior
        while(inf<=sup){
            //Se le da un valor a la posicion de la mitad, basado en el valor de las posiciones inferior y superior
            mit=(sup + inf)/2;
            
            //Si el valor en la posicion de la mitad es igual al valor que el usuario esta buscando, el confirmador se volvera verdadero y se terminara con el bucle
            if(n[mit]==b){
                con=true;
                break;
            }
            
            //Si el valor dentro de la posicion que poseera el valor de mit es mayor al valor del numero buscado por el usuario, se hara lo siguiente:
            if(n[mit]>b){
                
                //EL valor dentro de mitad sera el nuevo valor superior
                sup=mit;
                
                //El valor de mitad sera la mitad de la suma entre el nuevo valor superior y el valor inferior
                mit=(sup+inf)/2; 
            }
            
            //Si el valor dentro de la posicion que poseera el valor de mit es menor al valor del numero buscado por el usuario, se hara lo siguiente:
            if(n[mit]<b){
                
                //EL valor dentro de mitad sera el nuevo valor inferior
                inf=mit;
                
                //El valor de mitad sera la mitad de la suma entre el valor superior y el nuevo valor inferior
                mit=(sup+inf)/2;
            }
        }
        
        //Si se encuentra el valor a buscar dentro del arreglo, se le mostrara al usuario la posicion en la que esta el valor que busco
        if(con == true){
            System.out.println("Se ha encontrado el numero "+n[mit]+" dentro de la posicion "+mit);
        }
        
        //Si termina el bucle y no se encontro el valor dentro del arreglo, se le notificara al usuario que no se encontro el numero que quiso buscar
        else{
            System.out.println("No se ha encontrado el numero "+b+" dentro del arreglo.");
        }
    }
    
}
