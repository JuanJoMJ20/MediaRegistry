public class Video extends Publicacion {
    private Idioma idioma;
    private double duracionHoras;

    public Video() {}

    public Video(Idioma idioma, double duracionHoras, String titulo, double precio) {
        super(titulo, precio);
        this.idioma = idioma;
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return super.toString() + " [Video] Idioma: " + idioma + ", Duración: " + duracionHoras + " horas";
    }
}