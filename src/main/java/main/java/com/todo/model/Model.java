
package main.java.com.todo.model;

import java.util.HashMap;
import main.java.com.todo.controler.Controller;


public class Model {
    public String titulo;
    public String descripcion;
    public boolean estado;
    public Model(String tituloE, String descripcion, boolean estadoE){
        this.titulo = tituloE;
        this.descripcion =descripcion;
        this.estado = estadoE;
    }

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
    public void list (String nombre){
    Controller map = new Controller();
    for(int i = 0; i< map.todo.size(); i++){
        if (nombre.equals(map.todo))
        System.out.println( nombre + map.mapTareas.get(nombre));
    }
}
}
    

