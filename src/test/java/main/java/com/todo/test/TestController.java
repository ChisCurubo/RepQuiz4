/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.todo.test;
import main.java.com.todo.controler.Controller;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class TestController {
    
    private Controller controller = new Controller();
    
            
    @Test
    void testaddTask() {
        controller.addTask("Prueba", "Prueba JUnit",true);
        assertEquals(true, controller.searchTask("Prueba"));
    }
    
    @Test
    void testReadTask() {
        controller.addTask("Prueba", "Prueba JUnit",true);
        assertEquals(false, controller.readTask("Prueba"));
    }
    
    @Test
    void testUpdateTask() {
        controller.addTask("Prueba", "Prueba JUnit",true);
        controller.updateTask("Prueba","Prueba JUnit",true);
        assertEquals(true, controller.readTask("Prueba"));
    }
    
    @Test
    void testDeleteTask() {
        taskController.createTask("Prueba", "Prueba JUnit");
        taskController.deleteTask("Prueba");
        assertEquals(false, controller.searchTask("Prueba"));
    }
}

    
}
