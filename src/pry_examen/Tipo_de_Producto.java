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
public class Tipo_de_Producto{
    String tipo;

    public Tipo_de_Producto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        Scanner x= new Scanner(System.in);
        int a;
        
        System.out.println("1.Lacteo");
        System.out.println("2.Cereal");
        System.out.println("3.Verdura");
        System.out.println("Escoja la opcion del producto: ");a=x.nextInt();
        switch(a){
            case 1:{
                tipo="Lacteo";
                return tipo;
            }
            case 2:{
                tipo="cereal";
                return tipo;
            }
            case 3:{
                tipo="verdura";
                return tipo;
            }
        }
        return null;
}}
