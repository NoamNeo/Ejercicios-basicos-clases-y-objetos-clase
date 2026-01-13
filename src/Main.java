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
    System.out.printf("%s de %s con una duración de %,d segundos", cancion1.getTitulo(), cancion1.getArtista(),
        cancion1.getDuracion());
    System.out.printf("\n%s de %s con una duración de %,d segundos", cancion2.getTitulo(), cancion2.getArtista(),
        cancion2.getDuracion());
    System.out.printf("\nDuración de %s incorrecta, corrigiendo error....", cancion2.getTitulo());
    cancion2.setDuracion(8 * 60 + 36);
    System.out.printf("\nError corregido, duración nueva: %,d", cancion2.getDuracion());
    System.out.printf("\n%s de %s con una duración de %,d segundos", cancion2.getTitulo(), cancion2.getArtista(),
        cancion2.getDuracion());
    // Fin ejercicio 1
  }
}
