/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author UGT-03
 */
public class Nombre_Producto {
    Scanner x= new Scanner(System.in);
    ArrayList<Producto>lista= new ArrayList<>();
    public void ingresarProducto(Producto miproducto){
        lista.add(miproducto);        
    }
    public void imprimirProducto(){
       Iterator miiterator=lista.iterator();
        while(miiterator.hasNext()){
            Producto elemento=(Producto)miiterator.next();
            System.out.println(elemento.toString());
        }
    }
        public void buscarProducto(){
        boolean op=false;
        Iterator miiterator=lista.iterator();
        while(miiterator.hasNext()){
            System.out.println("Ingrese el producto a Buscar: ");
            String micodigo=x.nextLine();
            Producto elemento=(Producto)miiterator.next();
            if(elemento.getCodigo().equals(micodigo)){
            System.out.println("Codigo : "+elemento.getNombre());
            System.out.println("Producto: "+elemento.getNombre());
            System.out.println("Tipo: "+elemento.getX1());
            System.out.println("Precio: "+elemento.getPrecio());
            op=true;               
            }
        }
        if(op==false){
            System.out.println("No se encontro el producto a Buscar");
        }
            }     

        public void eliminarProducto(){
        boolean op=false;
        Iterator miiterator=lista.iterator();
        while(miiterator.hasNext()){
            System.out.println("Ingrese el producto a eliminar: ");
            String micodigo=x.nextLine();
            Producto elemento=(Producto)miiterator.next();
            if(elemento.getCodigo().equals(micodigo)){
            System.out.println("Codigo : "+elemento.getNombre());
            System.out.println("Producto: "+elemento.getNombre());
            System.out.println("Tipo: "+elemento.getX1());
            System.out.println("Precio: "+elemento.getPrecio());
            lista.remove(micodigo);
            op=true;               
            }
        }
        if(op==false){
            System.out.println("No se encontro el producto a Buscar");
        }
        }
        public void modificarProducto(){
            
        }
}

