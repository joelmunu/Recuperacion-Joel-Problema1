import java.util.ArrayList;

public class Impresora {
    private boolean encendido = false;
    ArrayList<DocumentoOfimatico> colaDeImpresion = new ArrayList<DocumentoOfimatico>();

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void anadirTrabajo(DocumentoOfimatico element) {
        colaDeImpresion.add(element);
    }

    public void verListaDeTrabajos() {
        if (colaDeImpresion.size() == 0) {
            System.out.println("No hay trabajos pendientes");
        } else {
            System.out.println("Lista de trabajos:");
            for (int i = 0; i < colaDeImpresion.size(); i++) {
                System.out.println(colaDeImpresion.get(i));
            }
        }
    }

    public DocumentoOfimatico imprimir() {
        if (colaDeImpresion.size() == 0) {
            System.out.println("No hay trabajos pendientes");
        } else {
            return colaDeImpresion.remove(0);
        }
        return null;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
