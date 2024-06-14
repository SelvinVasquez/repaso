import java.util.Scanner;

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        // Creación de cuenta usando constructor vacío
        CuentaBancaria cuenta = new CuentaBancaria();

        // Solicitar al usuario que ingrese el titular de la cuenta
        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();

        // Solicitar al usuario que ingrese el saldo inicial de la cuenta
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldoInicial = scanner.nextDouble();

        // Creación de cuenta usando constructor con titular y saldo inicial
        CuentaBancaria cuentaPersonalizada = new CuentaBancaria(titular, saldoInicial);

        // Mostrar información de las cuentas creadas
        System.out.println("\nInformación de la cuenta creada con valores predeterminados:");
        cuenta.mostrarInformacion();

        System.out.println("\nInformación de la cuenta personalizada:");
        cuentaPersonalizada.mostrarInformacion();

        // Ejemplo de operaciones con la cuenta personalizada
        cuentaPersonalizada.depositar(500.0);
        cuentaPersonalizada.retirar(200.0);
        cuentaPersonalizada.mostrarInformacion();

        // Cerrar scanner al finalizar
        scanner.close();
    }
    ClaveVehiculo clave1 = new ClaveVehiculo();
        clave1.mostrarInformacion();  // Mostrará el tipo y código por defecto

    ClaveVehiculo clave2 = new ClaveVehiculo("Llave");
        clave2.mostrarInformacion();  // Mostrará el tipo y código por defecto

    ClaveVehiculo clave3 = new ClaveVehiculo("Control remoto", "A1B2");
        clave3.mostrarInformacion();  // Mostrará el tipo y código personalizado

    // Cambiar el código de una clave existente
        clave1.setCodigo("CDEF");
        clave1.mostrarInformacion();  // Mostrará el tipo con el nuevo código
    }*/
                Scanner scanner = new Scanner(System.in);

                // Solicitar al usuario que ingrese la marca del vehiculo
                System.out.print("Ingrese la marca del vehiculo:");
                String marca = scanner.nextLine();

                // Solicitar al usuario que ingrese el modelo del vehículo
                System.out.print("Ingrese el modelo del vehículo: ");
                String modelo = scanner.nextLine();

                // Solicitar al usuario que ingrese el precio del vehículo
                System.out.print("Ingrese el precio del vehículo: ");
                double precio = scanner.nextDouble();

                // Crear un objeto vehículo usando el constructor con modelo y precio ingresados
                Vehiculo vehiculo = new Vehiculo(marca, modelo, precio);

                // Mostrar información del vehículo creado
                System.out.println("\nInformación del vehículo:");
                vehiculo.mostrarInformacion();

                // Cerrar scanner al finalizar
                scanner.close();
            }


