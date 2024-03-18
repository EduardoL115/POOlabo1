import java.util.*;

public class Main{
public static void main(String[] args) {
    int op = 0, num1 = 0, num2 = 0;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Ingrese una opcion");
        System.out.println("    1. Sumar");
        System.out.println("    2. Restar");
        System.out.println("    3. multiplicar");
        System.out.println("    4. dividir");
        System.out.println("    5. salir");

        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese su primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese su segundo numero");
                num2 = sc.nextInt();

                System.out.println("La suma de ambos numero es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Ingrese su primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese su segundo numero");
                num2 = sc.nextInt();

                System.out.println("La resta de ambos numeros es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Ingrese su primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese su segundo numero");
                num2 = sc.nextInt();
                System.out.println("La multiplicacion de ambos numeros es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Ingrese su primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese su segundo numero");
                num2 = sc.nextInt();
                System.out.println("La division de ambos numeros es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("bye bye");
                break;
            default:
                System.out.println("OP invalida");
                break;
        }
    } while (op != 5);
};
}



