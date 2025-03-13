/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rafa
 */
public class RutinaFuerza extends EquipoFuerza{
    private String nombreRutina;
    private int series;
    private int repeticiones;

    public RutinaFuerza(String nombre, String marca, String estado, String tipoDeEjercicio, double pesoMaximo, String material, String nombreRutina, int series, int repeticiones) {
        super(nombre, marca, estado, tipoDeEjercicio, pesoMaximo, material);
        this.nombreRutina = nombreRutina;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setNombreRutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    
    
    
}
