package sucesionaritmetica;
import java.util.Scanner;

public class SucesionAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los dos primeros elementos de la sucesion:");
        int elemento1 = scanner.nextInt();
        int elemento2 = scanner.nextInt();

        System.out.println("Ingrese la posicion que ocupan los dos primeros elementos:");
        int posicion1 = scanner.nextInt();
        int posicion2 = scanner.nextInt();

        System.out.println("La sucesión aritmetica es:");
        generarSucesion(elemento1, elemento2, posicion1, posicion2, 0);

        scanner.close();
    }

    public static void generarSucesion(int elemento1, int elemento2, int posicion1, int posicion2, int contador) {
        if (contador < 20) {
            if (contador == 0 || contador == 1) {
                System.out.println(elemento1);
                System.out.println(elemento2);
            } else {
                int siguienteElemento = elemento2 + (elemento2 - elemento1);
                System.out.println(siguienteElemento);
                elemento1 = elemento2;
                elemento2 = siguienteElemento;
            }
            contador++;
            generarSucesion(elemento1, elemento2, posicion1, posicion2, contador);
        }
    }
}
