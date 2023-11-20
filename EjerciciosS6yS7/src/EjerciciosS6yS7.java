/**
 * @author AngelTBarahona
 * Ejercicios S6yS7
 */
public class EjerciciosS6yS7{
    /**Serie numerica S6: 1  4   9   16  25  36  49  64 
     * @param valorIngresado: Numero de terminos con el cual se imprimira la serie
     * Método para imprimir la serie de cuadrados perfectos hasta valorIngresado por For
     */
    public void BarahonaAngelS6For (int valorIngresado){
        System.out.println("Secuencia por Ciclo For: ");
        for (int i = 1; i <= valorIngresado; i++) {
            // Calcular el cuadrado de cada termino
            int cuadrado = i * i;
            /*
             *Mientras i sea menor o igual a valorIngresado 
             *El bucle continuara hasta que i sea mayor que valor ingresado
             */
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }
    /**Serie numerica S6: 1  4   9   16  25  36  49  64 
     * @param valorIngresado
     * Método para imprimir la serie de cuadrados perfectos hasta valorIngresado por While
     */
    public void BarahonaAngelS6While (int valorIngresado){
        System.out.println("Secuencia por Ciclo While: ");
        int i=1;
        while (i <= valorIngresado) {
            // Calcular el cuadrado de cada termino
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
            // Incrementar i hasta llegar a ser mayor o igual que valorIngresado
            i++;
        }
        System.out.println();
    }
    /**Serie numerica S6: 1  4   9   16  25  36  49  64
     * @param valorIngresado
     * Método para imprimir la serie de cuadrados perfectos hasta valorIngresado por DoWhile
     */
    public void BarahonaAngelS6DoWhile (int valorIngresado){
        System.out.println("Secuencia por Ciclo DoWhile: ");
        int i=1;
        do {
            // Calcular el cuadrado de cada termino
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
            // Incrementar i hasta llegar a ser mayor o igual que valorIngresado
            i++;
        } while (i <= valorIngresado);
        System.out.println();
    }
    /**Serie numerica S7: 1  4  7  10  13  16  19  22  25
     * @param valorIngresado
     * Método para imprimir la serie de progresión aritmética por For
     */
    public void BarahonaAngelS7For (int valorIngresado){
        System.out.println("Secuencia arítmetica por Ciclo For: ");
        int terminoComun = 1;
        int terminoDiferencia = 3;
        for (int i = 0; i < valorIngresado; i++) {
            // Calcular el término actual e imprimirlo
            int terminoFinal = terminoComun + i * terminoDiferencia;
            System.out.print(terminoFinal + " ");
        }
        System.out.println();
    }
    /**Serie numerica S7: 1  4  7  10  13  16  19  22  25
     * @param valorIngresado
     * Método para imprimir la serie de progresión aritmética por For
     */
    public void BarahonaAngelS7While (int valorIngresado){
        System.out.println("Secuencia arítmetica por Ciclo While: ");
        int terminoComun = 1;
        int terminoDiferencia = 3;
        int i=0;
        while (i < valorIngresado) {
            // Calcular el término actual e imprimirlo
            int terminoActual = terminoComun + i * terminoDiferencia;
            System.out.print(terminoActual + " ");

            // Incrementar la variable conn la cual se sumara hasta llegar a ser mayor al valorIngresado
            i++;
        }
        System.out.println();
    }
    public void BarahonaAngelS7DoWhile (int valorIngresado){
        System.out.println("Secuencia arítmetica por Ciclo DoWhile: ");
        int terminoComun = 1;
        int terminoDiferencia = 3;
        int i=0;
        do {
            // Calcular el término actual e imprimirlo
            int terminoActual = terminoComun + i * terminoDiferencia;
            System.out.print(terminoActual + " ");
            // Incrementar la variable con la cual se sumara hasta llegar a ser mayor al valorIngresado
            i++;
        } while (i < valorIngresado);
    }
}
