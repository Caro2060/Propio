import java.util.Scanner;
public class Suma {
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        Suma obj = new Suma();  
        System.out.println("Resultado de la suma: " + obj.sumar(num1, num2)); 
        System.out.println("CarolinaCristinoTapia"); 
        scanner.close();
    }
}
