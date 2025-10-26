public class App {
    public static void main(String[] args) throws Exception {
        int n1;
        int n2;

        do {
            n1 = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
            n2 = Integer.parseInt(System.console().readLine("Introduzca otro número entero distinto al anterior: "));
            if (n1 == n2) {
                System.out.println("Los número introducidos no son válidos, deben ser distintos.");
            }
        } while (n1 == n2);

        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }

        for (int i = n1; i >= n2; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
