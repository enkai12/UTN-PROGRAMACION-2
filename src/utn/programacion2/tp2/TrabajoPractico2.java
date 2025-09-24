package utn.programacion2.tp2;

import java.util.Scanner;

/**
 * Esta clase contiene las soluciones a todos los ejercicios del Trabajo Práctico 2
 * de la materia Programación II.
 * El programa principal actúa como un menú interactivo para ejecutar cada
 * ejercicio por separado.
 * * @author Sotelo Agustín
 */
public class TrabajoPractico2 {

    /**
     * Ejercicio 1: Verificación de Año Bisiesto.
     * Le pido al usuario un año y determino si es bisiesto.
     * La lógica es: divisible por 4, pero no por 100, a menos que sea divisible por 400.
     */
    public static void verificarAnioBisiesto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 1: Verificación de Año Bisiesto ---");
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Utilizo una estructura condicional (if-else) con operadores lógicos
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    /**
     * Ejercicio 2: Determinar el Mayor de Tres Números.
     * Pido tres números y comparo para encontrar el mayor.
     */
    public static void determinarMayor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 2: Determinar el Mayor de Tres Números ---");
        System.out.print("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int tercerNumero = scanner.nextInt();

        int numeroMayor = primerNumero; // Asumo que el primer número es el mayor
        if (segundoNumero > numeroMayor) {
            numeroMayor = segundoNumero; // Si el segundo es mayor, lo actualizo
        }
        if (tercerNumero > numeroMayor) {
            numeroMayor = tercerNumero; // Si el tercero es mayor, lo actualizo
        }

        System.out.println("El mayor es: " + numeroMayor);
    }

    /**
     * Ejercicio 3: Clasificación de Edad.
     * Le pido al usuario su edad y la clasifico usando múltiples condiciones.
     */
    public static void clasificarEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 3: Clasificación de Edad ---");
        System.out.print("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt();

        // Utilizo una estructura if-else if-else para manejar múltiples rangos
        if (edadUsuario < 12) {
            System.out.println("Eres un Niño.");
        } else if (edadUsuario >= 12 && edadUsuario <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edadUsuario >= 18 && edadUsuario <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }

    /**
     * Ejercicio 4: Calculadora de Descuento.
     * Calculo un descuento basado en la categoría de un producto usando un switch.
     */
    public static void calcularDescuento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 4: Calculadora de Descuento ---");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoriaProducto = scanner.next().charAt(0);

        double porcentajeDescuento = 0.0;
        // Uso switch para manejar la categoría de forma eficiente
        switch (Character.toUpperCase(categoriaProducto)) {
            case 'A':
                porcentajeDescuento = 0.10;
                break;
            case 'B':
                porcentajeDescuento = 0.15;
                break;
            case 'C':
                porcentajeDescuento = 0.20;
                break;
            default:
                System.out.println("Categoria invalida.");
                return; // Salgo del método si la categoría no es válida
        }

        double precioFinal = precioProducto - (precioProducto * porcentajeDescuento);
        System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    /**
     * Ejercicio 5: Suma de Números Pares (while).
     * Sumo números ingresados por el usuario hasta que se ingrese un 0.
     * Solo sumo los números pares.
     */
    public static void sumaNumerosPares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 5: Suma de Números Pares (while) ---");
        int numeroIngresado;
        int sumaPares = 0;
        System.out.println("Ingrese un número (0 para terminar): ");

        // Uso un bucle while para seguir pidiendo números hasta que se cumpla la condición de salida (numero == 0)
        while ((numeroIngresado = scanner.nextInt()) != 0) {
            if (numeroIngresado % 2 == 0) {
                sumaPares += numeroIngresado;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }

    /**
     * Ejercicio 6: Contador de Positivos, Negativos y Ceros (for).
     * Cuento la cantidad de números positivos, negativos y ceros en una serie de 10.
     */
    public static void contarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 6: Contador de Positivos, Negativos y Ceros (for) ---");
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // Uso un bucle for para pedir exactamente 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);
    }

    /**
     * Ejercicio 7: Validación de Nota entre 0 y 10 (do-while).
     * Pido una nota y valido que esté en un rango válido usando un bucle do-while.
     */
    public static void validarNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Ejercicio 7: Validación de Nota entre 0 y 10 (do-while) ---");
        int notaIngresada;
        // Uso un bucle do-while para garantizar que el código se ejecute al menos una vez
        do {
            System.out.print("Ingrese una nota (0-10): ");
            notaIngresada = scanner.nextInt();
            if (notaIngresada < 0 || notaIngresada > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (notaIngresada < 0 || notaIngresada > 10);

        System.out.println("Nota guardada correctamente.");
    }

    /**
     * Ejercicio 8: Cálculo del Precio Final con impuesto y descuento.
     * Es un método modular que calcula el precio final.
     *
     * @param precioBase El precio inicial del producto.
     * @param impuesto   El porcentaje de impuesto a aplicar (ej. 0.10 para 10%).
     * @param descuento  El porcentaje de descuento a aplicar (ej. 0.05 para 5%).
     * @return El precio final del producto.
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    /**
     * Ejercicio 9a: Cálculo del Costo de Envío.
     * Calcula el costo de envío basándose en el peso y la zona.
     *
     * @param peso El peso del paquete en kilogramos.
     * @param zona La zona de envío (Nacional o Internacional).
     * @return El costo de envío.
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    /**
     * Ejercicio 9b: Cálculo del Total de la Compra.
     * Suma el precio del producto y el costo de envío.
     *
     * @param precioProducto El precio del producto.
     * @param costoEnvio     El costo de envío.
     * @return El total a pagar.
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /**
     * Ejercicio 10: Actualización de stock.
     * Calcula el nuevo stock de un producto después de una venta y recepción.
     *
     * @param stockActual      El stock actual.
     * @param cantidadVendida  La cantidad de productos vendidos.
     * @param cantidadRecibida La cantidad de productos recibidos.
     * @return El nuevo stock calculado.
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    /**
     * Ejercicio 11: Cálculo de descuento especial usando una constante de clase.
     * Es una constante de clase, una alternativa a la "variable global" pedida.
     */
    public static final double DESCUENTO_ESPECIAL = 0.10;

    /**
     * Calcula el descuento especial del 10% y muestra el precio final.
     * @param precio El precio inicial del producto.
     */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    /**
     * Ejercicio 12: Modificación de un array y visualización.
     * Declaro un array, lo recorro para mostrar los valores originales, modifico uno,
     * y lo vuelvo a recorrer para mostrar los valores modificados.
     */
    public static void modificarArray() {
        System.out.println("\n--- Ejercicio 12: Modificación de un array y visualización ---");
        double[] listaPrecios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double precio : listaPrecios) {
            System.out.println("Precio: $" + precio);
        }

        // Modifico el precio de un producto específico (índice 2)
        listaPrecios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double precio : listaPrecios) {
            System.out.println("Precio: $" + precio);
        }
    }

    /**
     * Ejercicio 13: Impresión recursiva de arrays.
     * Un método recursivo para recorrer el array en lugar de un bucle.
     *
     * @param array El array de doubles a imprimir.
     * @param indice El índice actual para la recursión.
     */
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        // La condición de parada es cuando el índice es igual o mayor a la longitud del array
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            // Llamada recursiva con el siguiente índice
            imprimirArrayRecursivo(array, indice + 1);
        }
    }

    /**
     * El método main, actúa como un menú interactivo para el usuario.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada;

        do {
            System.out.println("\n--- Menú de Ejercicios del TP2 ---");
            System.out.println("1. Verificación de Año Bisiesto");
            System.out.println("2. Determinar el Mayor de Tres Números");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento");
            System.out.println("5. Suma de Números Pares (while)");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for)");
            System.out.println("7. Validación de Nota (do-while)");
            System.out.println("8. Cálculo del Precio Final (Función)");
            System.out.println("9. Cálculo de Costo de Envío y Total (Composición de funciones)");
            System.out.println("10. Actualización de Stock (Función)");
            System.out.println("11. Cálculo de Descuento Especial (Variable Global)");
            System.out.println("12. Modificación de un array y visualización");
            System.out.println("13. Impresión recursiva de arrays");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    verificarAnioBisiesto();
                    break;
                case 2:
                    determinarMayor();
                    break;
                case 3:
                    clasificarEdad();
                    break;
                case 4:
                    calcularDescuento();
                    break;
                case 5:
                    sumaNumerosPares();
                    break;
                case 6:
                    contarNumeros();
                    break;
                case 7:
                    validarNota();
                    break;
                case 8:
                    System.out.println("\n--- Ejercicio 8: Cálculo del Precio Final ---");
                    System.out.print("Ingrese el precio base del producto: ");
                    double precioBase = scanner.nextDouble();
                    System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
                    double impuesto = scanner.nextDouble() / 100.0;
                    System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
                    double descuento = scanner.nextDouble() / 100.0;
                    double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
                    System.out.println("El precio final del producto es: " + precioFinal);
                    break;
                case 9:
                    System.out.println("\n--- Ejercicio 9: Composición de funciones ---");
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProducto = scanner.nextDouble();
                    System.out.print("Ingrese el peso del paquete en kg: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
                    String zonaEnvio = scanner.next();
                    double costoEnvio = calcularCostoEnvio(peso, zonaEnvio);
                    double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
                    System.out.println("El costo de envio es: " + costoEnvio);
                    System.out.println("El total a pagar es: " + totalCompra);
                    break;
                case 10:
                    System.out.println("\n--- Ejercicio 10: Actualización de stock ---");
                    System.out.print("Ingrese el stock actual del producto: ");
                    int stockActual = scanner.nextInt();
                    System.out.print("Ingrese la cantidad vendida: ");
                    int cantidadVendida = scanner.nextInt();
                    System.out.print("Ingrese la cantidad recibida: ");
                    int cantidadRecibida = scanner.nextInt();
                    int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
                    System.out.println("El nuevo stock del producto es: " + nuevoStock);
                    break;
                case 11:
                    System.out.println("\n--- Ejercicio 11: Cálculo de descuento especial ---");
                    System.out.print("Ingrese el precio del producto: ");
                    double precioProductoDesc = scanner.nextDouble();
                    calcularDescuentoEspecial(precioProductoDesc);
                    break;
                case 12:
                    modificarArray();
                    break;
                case 13:
                    System.out.println("\n--- Ejercicio 13: Impresión recursiva de arrays ---");
                    double[] listaPrecios = {199.99, 299.5, 149.75, 399.0, 89.99};

                    System.out.println("Precios originales:");
                    imprimirArrayRecursivo(listaPrecios, 0);

                    // Modifico un valor en el array para demostrar el cambio
                    listaPrecios[2] = 129.99;

                    System.out.println("\nPrecios modificados:");
                    imprimirArrayRecursivo(listaPrecios, 0);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
            }
        } while (opcionSeleccionada != 0);

        scanner.close();
    }
}
