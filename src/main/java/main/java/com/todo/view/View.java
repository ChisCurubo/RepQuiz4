package main.java.com.todo.view;

import java.util.Scanner;
import main.java.com.todo.controler.Controller;
import main.java.com.todo.model.Model;

public class View {
    //prueba
    public static void main(String[] args) {
        Controller mod = new Controller();
        Scanner sc = new Scanner(System.in);
        String tarea ;
        String descripcion ;
        boolean bol ; 
        while (true) {
            System.out.println("- Ingrese una opción");
            System.out.println("1. Ingresar tarea lista");
            System.out.println("2. Retirar tarea");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Buscar tareas");
            System.out.println("5. Salir");
            
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("\nIngrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("\nIngrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                    mod.crearTarea(tarea,descripcion, bol);
                    
                    System.out.println("se creo la tarea de : ");
                    mod.leerTarea(descripcion, tarea, bol);
                    break;
                case 2:
                    System.out.println("\nIngrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    mod.borrarTarea(tarea);
                    
                    break;
                case 3:
                    System.out.println("- Ingrese una opción");
                    System.out.println("1. editar");
                    System.out.println("2. estado lista ");
                    switch (sc.nextInt()) {
                    
                        case 1:
                            System.out.println("\nIngrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("\nIngrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("\nIngrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                        mod.updateTask(tarea,descripcion, bol);
                        
                        System.out.println("\nse modifico  la tarea de : ");
                    mod.leerTarea(descripcion, tarea, bol);
                            break;
                        case 2:
                    System.out.println("\nIngrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("\nIngrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("\nIngrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                        mod.updateTask(tarea,descripcion, bol);
                        
                        System.out.println("\nse  ve el estado de la tarea la tarea de : ");
                    mod.leerTarea(descripcion, tarea, bol);
                            break;
                    }
                    break;
                case 4:
                     System.out.println("\nIngrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("\nIngrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("\nIngrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                    mod.buscarTarea(tarea);
                    System.out.println("\nse busco  la tarea de : ");
                    mod.leerTarea(tarea, descripcion, bol);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
