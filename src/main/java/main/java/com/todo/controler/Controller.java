
package main.java.com.todo.controler;

import java.util.HashMap;
import java.util.Scanner;
import main.java.com.todo.model.Model;


public class Controller {
    Scanner sc = new Scanner(System.in);
    public HashMap<String, String> mapTareas = new HashMap<String, String>();
    public HashMap<String, Boolean> todo = new HashMap<String, Boolean>();
    public Controller(){
        
    }
    public HashMap<String, String> getMapTareas(String nombreTarea, String contenido , boolean bol) {
        return mapTareas;
    }
    public void addTask(String nombreTarea, String tarea, boolean bol){
        mapTareas.put(nombreTarea, tarea);
        todo.put(nombreTarea, bol);
    }
    public void borrarTask(String nombreTarea){
        mapTareas.remove(nombreTarea);
        todo.remove(nombreTarea);
    }
    public void updateTask(String nombreString, String tarea , boolean estado){
        if(estado == true){
       String res = mapTareas.get(nombreString)+ " DONE ";
            System.out.println(res);
    }
        else if (estado == false){ 
            mapTareas.put(nombreString, sc.nextLine());
            String res = mapTareas.get(nombreString)+ " TO-Do";
            System.out.println(res);
        }
    }
    public void listTarea(String nombre,String descripcion , boolean  bol){
        Model mod = new Model(nombre, descripcion, bol);
        mod.list(nombre);
    }

}
