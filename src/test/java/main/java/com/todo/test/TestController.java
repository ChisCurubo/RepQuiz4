
package main.java.com.todo.test;
import main.java.com.todo.controler.Controller;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class TestController {
    private Controller controller;
    @BeforeEach
    
    
    void setUp(){
     controller = new Controller();
    
    }    
    @Test
    void testaddTask() {
        controller.crearTarea("Prueba", "Prueba JUnit",true);
        Assertions.assertEquals(true, controller.buscarTarea("Prueba"));
    }
    
    @Test
    void testReadTask() {
        controller.crearTarea("Prueba", "Prueba JUnit",true);
        Assertions.assertEquals(true, controller.leerTarea("Prueba", "Prueba JUnit",true));
    }
    
    @Test
    void testUpdateTask() {
        controller.crearTarea("Prueba", "Prueba JUnit",true);
        controller.updateTask("Prueba","Prueba JUnit",true);
        Assertions.assertEquals(true, controller.leerTarea("Prueba", "Prueba JUnit",true));
    }
    
    @Test
    void testDeleteTask() {
        controller.crearTarea("Prueba", "Prueba JUnit",true);
        controller.borrarTarea("Prueba");
        Assertions.assertEquals(false, controller.buscarTarea("Prueba"));
    }
}

