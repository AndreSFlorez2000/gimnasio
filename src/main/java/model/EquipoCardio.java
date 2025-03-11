/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controlador.IAplicable;

/**
 *
 * @author juana
 */
public class EquipoCardio extends EquipoGimnasio implements IAplicable {
    private double velocidadMaxima;
    private double nivelResistencia;
    private String tipoPantalla;

    public EquipoCardio(String nombre, String marca, String estado, double velocidadMaxima, double nivelResistencia, String tipoPantalla) {
        super(nombre, marca, estado);
        this.velocidadMaxima = velocidadMaxima;
        this.nivelResistencia = nivelResistencia;
        this.tipoPantalla = tipoPantalla;
    }

    @Override
    public String toString() {
        return"Nombre: " + nombre + ", Marca: " + marca + ", Estado: " + estado+ "EquipoCardio{" + "velocidadMaxima=" + velocidadMaxima + ", nivelResistencia=" + nivelResistencia + ", tipoPantalla=" + tipoPantalla + '}';
    }
    
    

    @Override
    public void aplicarMantenimiento() {
        System.out.println("Realizando mantenimiento en " + nombre);
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getNivelResistencia() {
        return nivelResistencia;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNivelResistencia(double nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
    
    
}
