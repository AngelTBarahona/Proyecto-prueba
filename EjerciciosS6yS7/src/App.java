import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        EjerciciosS6yS7 PoliRetoS6yS7 = new EjerciciosS6yS7();
        System.out.println("Ingrese el valor");
        int valorIngresado;
        valorIngresado = scanner.nextInt();
        PoliRetoS6yS7.BarahonaAngelS6For(valorIngresado);
        PoliRetoS6yS7.BarahonaAngelS6While(valorIngresado);
        PoliRetoS6yS7.BarahonaAngelS6DoWhile(valorIngresado);
        PoliRetoS6yS7.BarahonaAngelS7For(valorIngresado);
        PoliRetoS6yS7.BarahonaAngelS7While(valorIngresado);
        PoliRetoS6yS7.BarahonaAngelS7DoWhile(valorIngresado);
    }
}