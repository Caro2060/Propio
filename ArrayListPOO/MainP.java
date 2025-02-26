package ArrayListPOO;

import java.util.ArrayList;
import java.util.Scanner;
public class MainP {
            public static void main(String[] args) {
            ArrayList<Persona> personas = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int idCounter = 1;
            boolean continuar = true;
    
            while (continuar) {
                Persona p = new Persona();  
                p.id = idCounter++;
    
                System.out.print("Nombre: ");
                p.nombre = sc.next();
                System.out.print("Edad: ");
                p.edad = sc.nextInt();
                System.out.print("Profesión: ");
                p.profesion = sc.next();
    
                personas.add(p);
    
                System.out.print("¿Agregar otra persona? (s/n): ");
                continuar = sc.next().equalsIgnoreCase("s");
            }   
            
            for (Persona p : personas) {
                System.out.println("ID: " + p.id + " | Nombre: " + p.nombre + " | Edad: " + p.edad + " | Profesión: " + p.profesion);
            }
    
            sc.close();
        }
    }