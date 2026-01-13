public class Main {
  public static void main(String[] args) {
    // Ejercicio 1 canción:
    Cancion cancion1 = new Cancion();
    Cancion cancion2 = new Cancion();
    cancion1.setTitulo("Wonderwall");
    cancion1.setArtista("Oasis");
    cancion1.setDuracion(4 * 60 + 38);
    cancion2.setTitulo("Master of puppets");
    cancion2.setArtista("Metalica");
    cancion2.setDuracion(450);
    System.out.printf("Output ejercicio 1: \n");
    System.out.printf("\n%s de %s con una duración de %,d segundos", cancion1.getTitulo(), cancion1.getArtista(),
        cancion1.getDuracion());
    System.out.printf("\n%s de %s con una duración de %,d segundos", cancion2.getTitulo(), cancion2.getArtista(),
        cancion2.getDuracion());
    System.out.printf("\nDuración de %s incorrecta, corrigiendo error....", cancion2.getTitulo());
    cancion2.setDuracion(8 * 60 + 36);
    System.out.printf("\nError corregido, duración nueva: %,d", cancion2.getDuracion());
    System.out.printf("\n%s de %s con una duración de %,d segundos", cancion2.getTitulo(), cancion2.getArtista(),
        cancion2.getDuracion());
    if (cancion1.getDuracion() > cancion2.getDuracion()) {
      System.out.printf("\nLa canción más larga es: %s", cancion1.getTitulo());
    } else if (cancion1.getDuracion() == cancion2.getDuracion()) {
      System.out.printf("\nAmbas canciones son igual de largas");
    } else {
      System.out.printf("\nLa cancion más larga es: %s", cancion2.getTitulo());
    }
    // Fin ejercicio 1

    // Ejercicio 2 película:
    Pelicula pelicula = new Pelicula();
    pelicula.setTitulo("Hot Fuzz");
    pelicula.setDirector("Edgar Wright");
    pelicula.setDuracion(121);
    pelicula.setEstreno(2007);
    System.out.printf("\n\nOutput ejercicio 2: \n");
    System.out.printf("\nTítulo: %s\nDirector: %s\nAño de estreno: %,d\nDuración: %,d", pelicula.getTitulo(),
        pelicula.getDirector(), pelicula.getEstreno(), pelicula.getDuracion());
    // modificamos el director para que este en mayúsculas
    pelicula.setDirector(pelicula.getDirector().toUpperCase());
    System.out.printf("\nDirector en mayúsculas: %s", pelicula.getDirector());
    // Fin ejercicio 2

    // Ejercicio 3 Youtube:
    Youtuber youtuber1 = new Youtuber();
    Youtuber youtuber2 = new Youtuber();
    Youtuber youtuber3 = new Youtuber();
    youtuber1.setCanal("Cooking with babish");
    youtuber1.setCategoria("Cocina");
    youtuber1.setSubscriptores(1000000);
    youtuber2.setCanal("Pianta");
    youtuber2.setCategoria("Gaming");
    youtuber2.setSubscriptores(900000);
    youtuber3.setCanal("Abroad in japan");
    youtuber3.setCategoria("Vloggin");
    youtuber3.setSubscriptores(1900000);
    System.out.printf("\n\nOutput ejercicio 3: \n");
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber1.getCanal(),
        youtuber1.getCategoria(), youtuber1.getSubscriptores());
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber2.getCanal(),
        youtuber2.getCategoria(), youtuber2.getSubscriptores());
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber3.getCanal(),
        youtuber3.getCategoria(), youtuber3.getSubscriptores());
    youtuber1.setSubscriptores(youtuber1.getSubscriptores() + 500000);
    youtuber2.setSubscriptores(youtuber2.getSubscriptores() + 500000);
    youtuber3.setSubscriptores(youtuber3.getSubscriptores() + 500000);
    System.out.printf("\nConsiguieron nuevos subscriptores!!!\n");
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber1.getCanal(),
        youtuber1.getCategoria(), youtuber1.getSubscriptores());
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber2.getCanal(),
        youtuber2.getCategoria(), youtuber2.getSubscriptores());
    System.out.printf("\nCanal: %s\nCategoría: %s\nSubscriptores: %,d\n", youtuber3.getCanal(),
        youtuber3.getCategoria(), youtuber3.getSubscriptores());
    // Fin ejercicio 3
  }
}
