/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_examen;

import java.util.Scanner;

/**
 *
 * @author UGT-03
 */
public class Pry_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Nombre_Producto z;
        z= new Nombre_Producto();
        String nombre,codigo,tipo = null;
        float precio;
        
        int a;
        System.out.println("Ingrese la cantidad de productos a registrar: ");a=x.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println("Ingrese el codigo del Producto: ");codigo=x.nextLine();
            System.out.println("Ingrese el nombre del Producto: ");nombre=x.nextLine();
            System.out.println("Ingrese el precio del Producto: ");precio=x.nextFloat();
            Tipo_de_Producto s=new Tipo_de_Producto(tipo);
            System.out.println(s.toString());
            Producto ba= new Producto(codigo, nombre, s, precio);
            
        }
        int op;
        do{
        System.out.println("\nMENU");
        System.out.println("1. Imprimir Productos");
        System.out.println("2. Buscar Productod");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Modificar Producto");
        System.out.println("5. Salir");
        op=x.nextInt();
        switch (op){
            case 1:{
                z.imprimirProducto();
            }
            case 2:{
                z.buscarProducto();
            }
            case 3:{
                z.eliminarProducto();
            }
            case 4:{
                z.modificarProducto();
            } 
        }
        }while(op!=5);
    }
    
}
