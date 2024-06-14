import java.util.Scanner;

public class DatosCamion {
    public static String matricula;
    public String capacidad;
    public String consumoGas;
    public String cargaActual;
    public String identificador;
    public String origen;
    public String destino;
    public String pesocarga;
    public String numerocamion;

    Scanner sc = new Scanner(System.in);

    public String getMatricula() {
        System.out.println("Ingrese la matricula del camion: ");
        matricula = sc.nextLine();
        return matricula;
    }
    public String getCapacidad() {
        System.out.println("Ingrese la capacidad del camion: ");
        capacidad = sc.nextLine();
        return capacidad;
    }
    public String getConsumoGas() {
        System.out.println("Ingrese el consumo de gasolina del camion: ");
        consumoGas = sc.nextLine();
        return consumoGas;
    }
    public String getCargaActual() {
        System.out.println("Ingrese la carga actual del camion: ");
        cargaActual = sc.nextLine();
        return cargaActual;
    }
    public String getIdentificador() {
        System.out.println("Ingrese el identificador del camion: ");
        identificador = sc.nextLine();
        return identificador;
    }
    public String getOrigen() {
        System.out.println("Ingrese el origen del camion: ");
        origen = sc.nextLine();
        return origen;
    }
    public String getDestino() {
        System.out.println("Ingrese el destino del camion: ");
        destino = sc.nextLine();
        return destino;
    }
    public String getPesocarga() {
        System.out.println("Ingrese el peso de la carga del camion: ");
        pesocarga = sc.nextLine();
        return pesocarga;
    }
    public String getNumerocamion() {
        System.out.println("Ingrese el numero del camion: ");
        numerocamion = sc.nextLine();
        return numerocamion;
    }
}
