public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {}

    public Disco(float duracion, String titulo, double precio) {
        super(titulo, precio);
        this.duracionMinutos = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + " [Disco] Duración: " + duracionMinutos + " min";
    }
}