package main.java.com.todo.model;

import java.util.HashMap;
import java.util.Scanner;
import main.java.com.todo.controler.Controller;

public class Model {

    public String titulo;
    public String descripcion;
    public boolean estado;
    Scanner sc = new Scanner(System.in);
    public HashMap<String, String> mapTareas = new HashMap<String, String>();
    public HashMap<String, Boolean> todo = new HashMap<String, Boolean>();

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public HashMap<String, String> getMapTareas(String nombreTarea, String contenido, boolean bol) {
        return mapTareas;
    }

    public void addTask(String nombreTarea, String tarea, boolean bol) {
        mapTareas.put(nombreTarea, tarea);
        todo.put(nombreTarea, bol);
    }

    public void borrarTask(String nombreTarea) {
        mapTareas.remove(nombreTarea);
        todo.remove(nombreTarea);
    }

    public void updateTask(String nombreString, String tarea, boolean estado) {
        if (estado == true) {
            String res = mapTareas.get(nombreString) + " DONE ";
            System.out.println(res);
        } else if (estado == false) {
            mapTareas.put(nombreString, sc.nextLine());
            String res = mapTareas.get(nombreString) + " TO-Do";
            System.out.println(res);
        }
    }
    
    public void list(String nombre) {
        for (int i = 0; i < todo.size(); i++) {
            if (nombre.equals(todo.keySet())) {
                System.out.println(nombre + mapTareas.get(nombre));
            }
        }
    }
    public String leerTarea(String nombreString, String tarea, boolean estado){
        if(buscarTarea(nombreString)){
            return nombreString + mapTareas.get(nombreString)+ todo.get(nombreString);
        }
        return null;
    }

    public boolean buscarTarea(String tarea) {

        return mapTareas.containsKey(tarea);
    }
}
