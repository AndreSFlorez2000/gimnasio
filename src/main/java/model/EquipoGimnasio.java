/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author juana
 */
public class EquipoGimnasio {
    public String nombre;
    public String marca;
    public String estado;

    public EquipoGimnasio(String nombre, String marca, String estado) {
        this.nombre = nombre;
        this.marca = marca;
        this.estado = estado;
    }

    public double calcularCostoMantenimiento() {
        return 100.0; // Valor base
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + ", Marca: " + marca + ", Estado: " + estado);

    }

    public String getNombre() {
    return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

}

