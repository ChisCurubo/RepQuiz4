package main.java.com.todo.view;

import java.util.Scanner;
import main.java.com.todo.controler.Controller;
import main.java.com.todo.model.Model;

public class View {
    
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
            System.out.println("4. Listar tareas");
            
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("Ingrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                    mod.addTask(tarea,descripcion, bol);
                    break;
                case 2:
                    System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    mod.borrarTask(tarea);
                    break;
                case 3:
                    System.out.println("- Ingrese una opción");
                    System.out.println("1. editar");
                    System.out.println("2. estado lista ");
                    switch (sc.nextInt()) {
                    
                        case 1:
                            System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("Ingrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                        mod.updateTask(tarea,descripcion, bol);
                            break;
                        case 2:
                    System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("Ingrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                        mod.updateTask(tarea,descripcion, bol);
                            break;
                    }
                    break;
                case 4:
                     System.out.println("Ingrese nombre de la tarea : ");
                    tarea = sc.nextLine();
                    System.out.println("Ingrese descripcion de la tarea : ");
                    descripcion = sc.nextLine();
                    System.out.println("Ingrese boolean de estado de la tarea : ");
                    bol = sc.nextBoolean();
                    mod.listTarea(tarea,descripcion, bol);
                default:
                    throw new AssertionError();
            }
        }
    }
}
