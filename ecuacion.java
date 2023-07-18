import java.util.Scanner;

class ecuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de ax²+bx+c=0");

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

        if (a == 0){
            double sol5 = -c / b;
            System.out.println("\nLa solución es: " + sol5);

        } else{
            System.out.println("\nDiscriminante: " + discriminate);

            if (discriminate >= 0){
                double sol1 = ((b * (-1)) + Math.sqrt(discriminate)) / (2 * a);
                double sol2 = ((b * (-1)) - Math.sqrt(discriminate)) / (2 * a );
    
                if (sol1 == sol2){
                    System.out.println("\nLa solución es doble: " + sol1);

                } else {
                    System.out.println("\nLas solucines son: " + sol1 + " y " + sol2);
                }
    
            } else { // Operaciones complejas
                double sol3 = ((b * (-1)) + Math.sqrt(absdis)) / (2 * a);
                double sol4 = ((b * (-1)) - Math.sqrt(absdis)) / (2 * a);
    
                if (sol3 == sol4) {
                    System.out.println("\nLas solucinón es doble: " + sol3 + "i");
                    System.out.println("\nSiendo i = √-1");

                } else {
                    System.out.println("\nLas solucines son: " + sol3 + "i y " + sol4 + "i");
                    System.out.println("\nSiendo i = √-1");
                }
            }
        }
    }
}

//TLT
