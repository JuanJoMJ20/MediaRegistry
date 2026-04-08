import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- REGISTRO DE LIBRO ---");
        System.out.print("Título: "); String tLibro = sc.nextLine();
        System.out.print("Precio: "); double pLibro = sc.nextDouble();
        System.out.print("Páginas: "); int paginas = sc.nextInt();
        System.out.print("Año: "); int anio = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        Libro miLibro = new Libro(paginas, anio, tLibro, pLibro);

        System.out.println("\n--- REGISTRO DE DISCO ---");
        System.out.print("Título: "); String tDisco = sc.nextLine();
        System.out.print("Precio: "); double pDisco = sc.nextDouble();
        System.out.print("Duración (min): "); float durMin = sc.nextFloat();
        sc.nextLine(); // Limpiar buffer

        Disco miDisco = new Disco(durMin, tDisco, pDisco);

        System.out.println("\n--- REGISTRO DE VIDEO ---");
        System.out.print("Título: "); String tVideo = sc.nextLine();
        System.out.print("Precio: "); double pVideo = sc.nextDouble();
        System.out.print("Duración (horas): "); double durHrs = sc.nextDouble();
        System.out.println("Seleccione Idioma (1. ESPAÑOL, 2. INGLES, 3. PORTUGUES): ");
        int opc = sc.nextInt();
        Idioma id = (opc == 2) ? Idioma.INGLES : (opc == 3) ? Idioma.PORTUGUES : Idioma.ESPANOL;

        Video miVideo = new Video(id, durHrs, tVideo, pVideo);

        // Visualización de datos
        System.out.println("\n===============================");
        System.out.println("DATOS INGRESADOS:");
        System.out.println(miLibro.toString());
        System.out.println(miDisco.toString());
        System.out.println(miVideo.toString());
        System.out.println("===============================");
        
        sc.close();
    }
}