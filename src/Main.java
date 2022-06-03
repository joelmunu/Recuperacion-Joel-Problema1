import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Impresora miImpresora = new Impresora();
        DocumentoOfimatico miDocumento = new DocumentoOfimatico("", "");
        // Este arraylist es para crear los documentos y pasarlos al arraylist de la cola de impresion
        ArrayList<DocumentoOfimatico> documentos = new ArrayList<DocumentoOfimatico>();

        while (salir == false) {
            System.out.println("1. Encender impresora");
            System.out.println("2. Apagar impresora");
            System.out.println("3. Añadir trabajo");
            System.out.println("4. Ver lista de trabajos");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    miImpresora.encender();
                    System.out.println("Se ha encendido la impresora");
                    break;

                case 2:
                    miImpresora.apagar();
                    System.out.println("Se ha apagado la impresora");
                    break;

                case 3:
                    if (miImpresora.isEncendido() == true) {
                        System.out.print("Introduce el nombre del documento: ");
                        miDocumento.setNombre(sc.nextLine());
                        System.out.print("Introduce el tamaño del documento: ");
                        miDocumento.setTamanyo(sc.nextLine());
                        documentos.add(miDocumento);
                        miImpresora.anadirTrabajo(documentos.remove(0));
                        break;
                    } else {
                        System.out.println("La impresora está apagada");
                    }

                case 4:
                    if (miImpresora.isEncendido() == true) {
                        miImpresora.verListaDeTrabajos();
                    } else {
                        System.out.println("La impresora está apagada");
                    }
                    break;

                case 5:
                    if (miImpresora.isEncendido() == true) {
                        System.out.println(miImpresora.imprimir());
                    } else {
                        System.out.println("La impresora está apagada");
                    }
                    break;

                case 6:
                    salir = true;
                    break;
            }
        }

        sc.close();
    }
}