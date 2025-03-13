/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.Observer;
import model.*;
import model.Equipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafa
 */

public class EquipoController {
    
    private static EquipoController instancia;
    private List<Observer> observadores = new ArrayList<>();
    private List<Equipo> equipos;
    
    public EquipoController() {  
        equipos = new ArrayList<>();
    }
    
    public static EquipoController getInstancia() {  
        if (instancia == null) {  
            instancia = new EquipoController();
        }
        return instancia;
    }
    /**public EquipoController() {
        equipos = new ArrayList<>();
        equipos.add(new Equipo("juan","lol","funcionando"));
        //equipos.add(new EquipoCardio("syid","lol","funcionando",2.2,3.2,"led")); 
          
    }**/
    
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }
    
    private void notificarObservadores() {
        for (Observer o : observadores) {
            o.actualizar();
            }
    }
    
    public void insertarEquipo(Equipo equipo) {
        equipos.add(equipo);
        System.out.println("Equipo agregado: " + equipo.getNombre() + " - Tipo: " + equipo.getClass().getSimpleName());
        notificarObservadores();
    }
    
    
    /**public void insertarEquipoCardio(String nombre, String marca, String estado, double velocidadMaxima, double nivelResistencia, String tipoPantalla) {
        EquipoCardio nuevoEquipo = new EquipoCardio(nombre, marca, estado, velocidadMaxima, nivelResistencia, tipoPantalla);
        System.out.println("Agregando equipo: " + nuevoEquipo.getNombre() + " - Tipo: " + nuevoEquipo.getClass().getSimpleName());
        equipos.add(nuevoEquipo);
        notificarObservadores();
    }**/
    public void insertarEquipoCardio(String nombre, String marca, String estado, double velocidadMaxima, double nivelResistencia, String tipoPantalla) {
        EquipoCardio nuevoEquipo = new EquipoCardio(nombre, marca, estado, velocidadMaxima, nivelResistencia, tipoPantalla);
        System.out.println("Agregando equipo: " + nuevoEquipo.getNombre() + " - Tipo: " + nuevoEquipo.getClass().getSimpleName());
        equipos.add(nuevoEquipo);
        notificarObservadores();
    }
    
    
    public void insertarEquipoFuerza(String nombre, String marca, String estado, String tipoEjercicio, double pesoMaximo, String material) {
        EquipoFuerza nuevoEquipo = new EquipoFuerza(nombre, marca, estado, tipoEjercicio, pesoMaximo, material);
        System.out.println("Agregando equipo: " + nuevoEquipo.getNombre() + " - Tipo: " + nuevoEquipo.getClass().getSimpleName());
        equipos.add(nuevoEquipo);
        notificarObservadores();
    }

        
    public void insertarEquipoRutina(String nombre, String marca, String estado, String tipoEjercicio, double pesoMaximo, String material, String nombreRutina, int series, int repeticiones) {
        RutinaFuerza nuevaRutina = new RutinaFuerza(nombre, marca, estado, tipoEjercicio, pesoMaximo, material, nombreRutina, series, repeticiones);
        System.out.println("Agregando equipo: " + nuevaRutina.getNombre() + " - Tipo: " + nuevaRutina.getClass().getSimpleName());
        equipos.add(nuevaRutina);
        notificarObservadores();
    }
    
    

    /**public List<Equipo> listarEquipos() {
        if (equipos == null) {
            equipos = new ArrayList<>();
        }
        return equipos;
    }**/
    
    public List<Equipo> listarEquipos() { 
        System.out.println("Listando todos los equipos:");
        for (Equipo e : equipos) {
            System.out.println(e.getNombre() + " - " + e.getClass().getSimpleName());
        }
        return equipos;
    }
    
    public Equipo consultarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.nombre.equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null;
    }
    
    public Equipo consultarToString(String toString) {
        for (Equipo equipo : equipos) {
            if (equipo.toString().equals(toString)) {
                return equipo;
            }
        }
        return null;
    }
    
    public Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) { 
            if (equipo.getNombre().equalsIgnoreCase(nombre)) {
                return equipo;
            }
        }
        return null; 
    }

     public boolean eliminarEquipo(String nombre) {
        boolean eliminado = equipos.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            System.out.println("Equipo eliminado: " + nombre);
            notificarObservadores();
        } else {
            System.out.println("No se encontró el equipo con nombre: " + nombre);
        }
        return eliminado;
    }   
    
}
