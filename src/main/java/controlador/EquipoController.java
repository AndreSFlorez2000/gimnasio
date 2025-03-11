/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.Observer;
import model.*;
import model.EquipoGimnasio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafa
 */

public class EquipoController {
    
    private List<Observer> observadores = new ArrayList<>();
    
    private List<EquipoGimnasio> equipos;

    public EquipoController() {
        equipos = new ArrayList<>();
        equipos.add(new EquipoGimnasio("juan","lol","funcionando"));
        equipos.add(new EquipoCardio("syid","lol","funcionando",2.2,3.2,"led")); 
          
    }
    
    public void agregarObservador(Observer o) {
    observadores.add(o);
    }
    
    public void insertarEquipo(EquipoGimnasio equipo) {
        equipos.add(equipo);
        notificarObservadores();
    }
    public void insertarEquipoCardio(String nombre, String marca, String estado, double velocidadMaxima, double nivelResistencia, String tipoPantalla) {
        equipos.add(new EquipoCardio(nombre, marca, estado, velocidadMaxima, nivelResistencia, tipoPantalla));
        notificarObservadores();
    }

    public void insertarEquipoFuerza(String nombre, String marca, String estado, String tipoEjercicio, double pesoMaximo, String material) {
        equipos.add(new EquipoFuerza(nombre, marca, estado, tipoEjercicio, pesoMaximo, material));
        notificarObservadores();
        }
/*
    public void insertarEquipoRutina(String nombre, String marca, String estado, String nombreRutina, int series, int repeticiones) {
        equipos.add(new RutinaFuerza(nombre, marca, estado, tipoDeEjercicio, pesoMaximo, material, nombreRutina, series, repeticiones));
        notificarObservadores();
        }
    */

    public List<EquipoGimnasio> listarEquipos() {
        return equipos;
    }

    public EquipoGimnasio consultarEquipo(String nombre) {
        for (EquipoGimnasio equipo : equipos) {
            if (equipo.nombre.equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null;
    }
    
    public EquipoGimnasio consultarToString(String toString) {
        for (EquipoGimnasio equipo : equipos) {
            if (equipo.toString().equals(toString)) {
                return equipo;
            }
        }
        return null;
    }
    
    public EquipoGimnasio buscarEquipo(String nombre) {
        for (EquipoGimnasio equipo : equipos) { 
            if (equipo.getNombre().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null; 
    }

    public boolean eliminarEquipo(String nombre) {
        return equipos.removeIf(e -> e.nombre.equalsIgnoreCase(nombre));
    }
    
    
    private void notificarObservadores() {
    for (Observer o : observadores) {
        o.actualizar();
    }
    }
}
