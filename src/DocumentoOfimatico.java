public class DocumentoOfimatico {
    private String nombre;
    private String tamanyo;

    public DocumentoOfimatico(String nombre, String tamanyo) {
        this.nombre = nombre;
        this.tamanyo = tamanyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Tamaño: " + tamanyo;
    }
}
