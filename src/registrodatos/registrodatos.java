package registrodatos;

import java.util.Scanner;

public class registrodatos {
    // Variables globales para almacenar los datos del usuario
    private static String nombreUsuario = "";
    private static String correoUsuario = "";
    private static String contraseñaUsuario = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Función para registrar al usuario
    private static void registrarUsuario(Scanner scanner) {
        System.out.println("----- Registro de Usuario -----");
        System.out.print("Ingrese su nombre: ");
        nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su correo electrónico: ");
        correoUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contraseñaUsuario = scanner.nextLine();
        System.out.println("Registro exitoso.");
    }

    // Función para iniciar sesión
    private static void iniciarSesion(Scanner scanner) {
        System.out.println("----- Inicio de Sesión -----");
        System.out.print("Ingrese su correo electrónico: ");
        String correoIngresado = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        // Verificar si los datos coinciden
        if (correoIngresado.equals(correoUsuario) && contrasenaIngresada.equals(contraseñaUsuario)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + nombreUsuario + "!");
            mostrarMenuUsuario(scanner);
        } else {
            System.out.println("Correo electrónico o contraseña incorrectos.");
        }
    }

    // Función para mostrar un menú de usuario después de iniciar sesión
    private static void mostrarMenuUsuario(Scanner scanner) {
        boolean salir = false;

        while (!salir) {
            System.out.println("----- Menú del Usuario -----");
            System.out.println("1. Ver información del perfil");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    mostrarInformacionPerfil();
                    break;
                case 2:
                    cambiarContrasena(scanner);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Sesión cerrada.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Función para mostrar la información del perfil
    private static void mostrarInformacionPerfil() {
        System.out.println("----- Información del Perfil -----");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Correo electrónico: " + correoUsuario);
    }

    // Función para cambiar la contraseña
    private static void cambiarContrasena(Scanner scanner) {
        System.out.println("----- Cambiar Contraseña -----");
        System.out.print("Ingrese la nueva contraseña: ");
        contraseñaUsuario = scanner.nextLine();
        System.out.println("Contraseña cambiada exitosamente.");
    }
}
