import java.util.Scanner;

class ecuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de ax2+bx+c");

        System.out.print("Introduce el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = sc.nextInt();
        System.out.print("Introduce el valor de c: ");
        int c = sc.nextInt();
        sc.close();

        //Calcular discriminate
        double discriminate = Math.pow(b,2) - (4 * a * c);
        // Valor absoluto discriminate
        double absdis = Math.abs(discriminate);

        System.out.println("\nDiscriminante: " + discriminate);

        if (discriminate >= 0){
            double sol1 = ((b * (-1)) + Math.sqrt(discriminate)) / (2 * a);
            double sol2 = ((b * (-1)) - Math.sqrt(discriminate)) / (2 * a );

            System.out.println("\nLas solucines son: " + sol1 + " y " + sol2);

        } else { // Operaciones complejas
            double sol3 = ((b * (-1)) + Math.sqrt(absdis)) / (2 * a);
            double sol4 = ((b * (-1)) - Math.sqrt(absdis)) / (2 * a);

            System.out.println("\nLas solucines son: " + sol3 + "i y " + sol4 + "i");
            System.out.println("\nSiendo i = √-1");
        }
    }
}