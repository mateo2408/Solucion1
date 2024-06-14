public class Peso extends DatosCamion{
    private static double capacidadCarga; // Maximum load capacity
    private static double cargaActual; // Current load

    // Constructor to initialize the variables
    public Peso(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0.0;
    }

    public static void cargar(double peso) {
        if (cargaActual + peso <= capacidadCarga) {
            cargaActual += peso;
            System.out.println("Se ha cargado " + peso + " kg al camión " + matricula);
        } else {
            System.out.println("Error: La carga supera la capacidad del camión " + matricula);
        }
    }

    public static void descargar(double peso) {
        if (cargaActual >= peso) {
            cargaActual -= peso;
            System.out.println("Se ha descargado " + peso + " kg del camión " + matricula);
        } else {
            System.out.println("Error: La cantidad a descargar supera la carga actual del camión " + matricula);
        }
    }
}
