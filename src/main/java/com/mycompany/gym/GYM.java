/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gym;


import controlador.EquipoController;
import vistas.GUIPrincipal;

/**
 *
 * @author Rafa
 */
public class GYM {

    public static void main(String[] args) {
    EquipoController equipoController = new EquipoController(); // Creamos el controlador
    GUIPrincipal gUIPrincipal = new GUIPrincipal(equipoController); // Lo pasamos como parámetro
    gUIPrincipal.setLocationRelativeTo(null);
    gUIPrincipal.setVisible(true);
    }
}
