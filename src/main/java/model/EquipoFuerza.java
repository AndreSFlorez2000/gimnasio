/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juana
 */
public class EquipoFuerza extends Equipo {
    private String tipoDeEjercicio;
    private double pesoMaximo;
    private String material;

    public EquipoFuerza(String nombre, String marca, String estado, String tipoDeEjercicio, double pesoMaximo, String material) {
        super(nombre, marca, estado);
        this.tipoDeEjercicio = tipoDeEjercicio;
        this.pesoMaximo = pesoMaximo;
        this.material = material;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return pesoMaximo * 0.5;
    }

    public String getTipoDeEjercicio() {
        return tipoDeEjercicio;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public String getMaterial() {
        return material;
    }

    public void setTipoDeEjercicio(String tipoDeEjercicio) {
        this.tipoDeEjercicio = tipoDeEjercicio;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}

