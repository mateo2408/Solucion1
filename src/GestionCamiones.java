
import java.util.ArrayList;
import java.util.List;

public class GestionCamiones {
    DatosCamion camion = new DatosCamion();

    public static List<DatosCamion> camiones;

    public GestionCamiones() {
        camiones = new ArrayList<DatosCamion>();
    }

    public static void agregarCamion(DatosCamion camion) {
        camiones.add(camion);
        System.out.println("Se ha agregado el camión " + camion.getMatricula());
    }

    public static void eliminarCamion(String matricula) {
        DatosCamion camion = buscarCamion(matricula);
        if (camion != null) {
            camiones.remove(camion);
            System.out.println("Se ha eliminado el camión " + matricula);
        } else {
            System.out.println("Error: No se encontró el camión con matrícula " + matricula);
        }
    }

    public static DatosCamion buscarCamion(String matricula) {
        for (DatosCamion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                return camion;
            }
        }
        return null;
    }

    public DatosCamion obtener() {
        if (!camiones.isEmpty()) {
            return camiones.get(0);
        }
        return null;
    }
}