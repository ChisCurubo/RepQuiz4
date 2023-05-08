package main.java.com.todo.controler;

import java.util.HashMap;
import java.util.Scanner;
import main.java.com.todo.model.Model;

public class Controller { 
    public Model model = new Model();
 

    public void crearTarea(String nombreTarea, String tarea, boolean bol) {
        model.addTask(nombreTarea, tarea, bol);
    }

    public boolean buscarTarea(String nombre) {
        return model.buscarTarea(nombre);
    }

    public void borrarTarea(String nombre) {
        model.borrarTask(nombre);
    }

    public void updateTask(String nombreString, String tarea, boolean estado) {
        model.updateTask(nombreString, tarea, estado);
    }
    public boolean  leerTarea(String nombreString, String tarea, boolean estado){
        model.leerTarea( nombreString, tarea,  estado);
        return true;
    }
}
