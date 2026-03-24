/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema4sentenciaslogicas;
import java.util.Scanner;

/**
 *
 * @author mejia
 */
public class Tema4SentenciasLogicas {

    public static void main(String[] args) {
        if (true){
        System.out.println("Esta linea se ejecuto correctamente");
    }
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor de x ");
        int x=sc.nextInt();
        System.out.println("Ingresa el valor de y");
        int y=sc.nextInt();
        
if(x>y) {
    System.out.println("X es mayor que Y");
}
else if (y>x) {
    System.out.println("Y es mayor que x");
}
else{
    System.out.println("X,Y tienen el mismo valor");
}

int numero=sc.nextInt();
if(numero>0) {
    System.out.println("el numero" + numero+"es positivo");
}
else if (numero<0){
    System.out.println("el numero" + numero +"es negativo");
}else{
    System.out.println("El numero es cero");
}
//IF- ELSE- IF UTLIZANDO STRINGS//
String curso="Matematicas";
if(curso.equals("Biologia")){
    System.out.println("Tu registro es al curso de biologia");
}else if(curso.equals("Algebra")){
    System.out.println("Es registro es al curso de algebra");
}
else if(curso.equals("Teatro")){
        System.out.println("Es registro es al curso de teatro");
        }
else{
    System.out.println("Curso no encontrado");
}
    


        System.out.println("Codigo creado por mejia");
    
    }}





            

    

        

