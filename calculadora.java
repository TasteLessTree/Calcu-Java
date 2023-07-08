import java.util.Scanner;

class calculadora {

    static void linea() {
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // Números operados
        Scanner num1 = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double x = num1.nextDouble();
        Scanner num2 = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double y = num2.nextDouble();

        // Caractéres especiales
        double z = 1.0 / y;
        double resultado = 0.0;
        boolean salir = false; // Salir de la aplicación

        linea();
        System.out.println("\n\n");

        while(!salir) {
            System.out.println("\n");
            linea();
            // Operaciones aritméticas
            System.out.println("Elige una opción:");
            System.out.println("1 → cambiar números");
            System.out.println("+ → sumar " + x + " + " + y);
            System.out.println("- → restar " + x + " - " + y);
            System.out.println("* → multiplicar " + x + " * " + y);
            System.out.println("/ → dividir " + x + " / " + y);
            System.out.println("% → resto división " + x + " / " + y);
            System.out.println("** → " + x + " elevado a " + y);
            System.out.println("rz → raíz de " + x + " con índice " + y);
            System.out.println("log → logaritmo de " + x + " en base " + y);
            System.out.println("X → cerrar");

            linea();

            // Operación elegida
            System.out.print("Tu opción → ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    num1 = new Scanner(System.in);
                    System.out.print("Introduce un número: ");
                    x = num1.nextDouble();
                    num2 = new Scanner(System.in);
                    System.out.print("Introduce un número: ");
                    y = num2.nextDouble();

                    // Caractéres especiales
                    z = 1.0 / y;
                    resultado = 0.0;
                    break;
                
                case "+": // Suma
                    resultado = x + y;
                    break;

                case "-": // Resta
                    resultado = x - y;
                    break;

                case "*": // Multiplicación
                    resultado = x * y;
                    break;

                case "/": // División
                    // Dividir entre 0
                    if (y == 0) {
                        System.out.println("No se puede divir entre 0");
                        break;

                    } else { // División
                        resultado = x / y;
                        break;
                    }

                case "%": // Módulo
                    // Dividir entre 0
                    if (y == 0) {
                        System.out.println("No se puede divir entre 0");
                        break;

                    } else { // Módulo
                        resultado = x % y;
                    }
                    break;

                case "**": // Potencia
                    resultado = (double) Math.pow(x, y);
                    break;

                case "rz": // Raíz
                    // Números complejos
                    if (x == -1 && y == 2) {
                        System.out.println("i"); // Unidad imaginaria 
                        break;   
                    
                    } else if (x < 0 && y%2 == 0) { // Resultado con números complejos
                        resultado = Math.pow(Math.abs(x), z);
                        break;

                    } else if (x < 0 && y%2 != 0) { // Radicando negativo pero índice impar
                        resultado = -Math.pow(Math.abs(x), z);
                        break;

                    } else { // Raíces con solucines reales
                        resultado = Math.pow(x, z);
                        break;
                    }

                case "log": // Logaritmo
                     // Excepciones
                    if (x <= 0 || y <= 0) {
                        System.out.println("Ni el argumento ni la base pueden ser negativas");
                        num1 = new Scanner(System.in);
                        System.out.print("Introduce un número: ");
                        x = num1.nextDouble();
                        num2 = new Scanner(System.in);
                        System.out.print("Introduce un número: ");
                        y = num2.nextDouble();
                    
                        // Caractéres especiales
                        z = 1.0 / y;
                        resultado = 0.0;
                        break;

                    } else if (y == 1) { // Logaritmo de base 1
                        resultado = 0.0;
                        break;

                    } else { // Logaritmo de X en base Y
                        resultado = Math.log(x) / Math.log(y);
                        break;
                    }

                case "pc": // Porcentaje
                    resultado = (x * y) / 100;
                    break;

                case "x":
                case "X": // Cerrar aplicación
                    System.out.println("Aplicación cerrada.\n");
                    salir = true; // Abandonar la aplicación
                    break;
                
                default: // Ninguna de las anteriores
                    System.out.print("Opción incorrecta, por favor introduce otra → ");
                    break;
            }
            if (!salir) { // Solo imprime el resultado si X no ha sido seleccionada
                if (resultado == Math.pow(Math.abs(x), z)) {
                   System.out.println(x + " " + input + " " + y + " = " + resultado + "i");
                } else {
                    System.out.println(x + " " + input + " " + y + " = " + resultado);
                }
            }
        }
    }
}