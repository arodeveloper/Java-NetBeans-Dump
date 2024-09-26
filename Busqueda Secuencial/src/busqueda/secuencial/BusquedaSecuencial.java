package busqueda.secuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        n: Arreglo que contendra los numeros ingresados por el usuario
        res: Arreglo que contendra los resultados de la busqueda
        cores: Contador. Contara cuantos elementos han sido encontrados dentro del arreglo
        b: Numero que ingresara el usuario para buscar dentro del arreglo
        */
        int n[] = new int [5], res[] = new int [5], cores = 0, b;
        
        //Se le pide al usuario que digite 5 numeros
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"/5 Ingrese un numero");
            n[i] = sc.nextInt();
        }
        
        //Se le pide al usuario que digite un numero que desea buscar
        System.out.println("Ingrese un numero que desee buscar dentro del arreglo");
        b = sc.nextInt();
        
        //Se crea un bucle que se repetira 5 veces
        for (int i = 0; i < 5; i++) {
            
            //Si el numero a evaluar en el arreglo es igual al numero que el usuario ingreso, se procedera con lo siguiente
            if(n[i]==b){
                
                //Al arreglo dentro de la posicion del valor en cores se le asigna el valor del numero del arreglo evaluado en el momento 
                res[cores]=n[i];
                
                //A cores se le aumenta un numero
                cores++;
            }
        }
        
        //Se le mostrara al usuario si se encontro algun resultado, cuantos resultados se encontraron y los valores encontrados. Si no hay resultado, se le dira al usuario
         if(cores>0){
            System.out.println("Se han encontrado "+cores+" resultados:");
            for (int i = 0; i < cores; i++) {
                System.out.println((i)+". "+res[i]);
            }
         }
         else{
             System.out.println("No se ha encontrado ningun resultado.");
         }
    }
    
}
