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
public class Producto {
    private String codigo;
    private String nombre;
    Tipo_de_Producto x1;
    private float precio;

    public Producto(String codigo, String nombre, Tipo_de_Producto x1, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.x1 = x1;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_de_Producto getX1() {
        return x1;
    }

    public void setX1(Tipo_de_Producto x1) {
        this.x1 = x1;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
