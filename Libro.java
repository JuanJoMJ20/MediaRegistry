public class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {}

    public Libro(int numPag, int anio, String titulo, double precio) {
        super(titulo, precio);
        this.numeroPaginas = numPag;
        this.anioPublicacion = anio;
    }

    @Override
    public String toString() {
        return super.toString() + " [Libro] Páginas: " + numeroPaginas + ", Año: " + anioPublicacion;
    }
}