import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido al sistema de gestión de camiones");
        System.out.println("1. Agregar camión");
        System.out.println("2. Eliminar camión");
        System.out.println("3. Cargar camión");
        System.out.println("4. Descargar para dejar");
        System.out.println("5. Mostrar camiones");
        System.out.println("6. Salir");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        DatosCamion camion = new DatosCamion();
        GestionCamiones gestion = new GestionCamiones();

        switch (opcion) {
            case 1:
                GestionCamiones.agregarCamion(camion);
                break;
            case 2:
                GestionCamiones.eliminarCamion(String.valueOf(camion));
                break;
            case 3:
                System.out.println("Ingrese el peso a cargar: ");
                double peso1 = sc.nextDouble();
                Peso.cargar(peso1);
                break;
            case 4:
                System.out.println("Ingrese el peso a descargar: ");
                double peso2 = sc.nextDouble();
                Peso.descargar(peso2);
                break;
            case 5:
                System.out.println("Camiones registrado: ");
                for (DatosCamion c : GestionCamiones.camiones) {
                    System.out.println(c.getMatricula());
                }
                break;
            case 6:
                System.out.println("Gracias por usar el sistema de gestión de camiones");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}