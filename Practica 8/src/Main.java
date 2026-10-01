import personajes.Arquero;
import personajes.Druida;
import personajes.Guerrero;
import personajes.Nigromante;
import personajes.Personaje;


public class Main {
    public static void main(String[] args) throws Exception {
        GestionGremio gremio = new GestionGremio();
        gremio.agregarMiembro(new Druida("Sylva", 10, 300, 100));
        gremio.agregarMiembro(new Nigromante("Malachar", 8, 250, 120));
        gremio.agregarMiembro(new Arquero("Legolas", 6, 150, "Arco", 20, 95));
        gremio.agregarMiembro(new Guerrero("Thorin", 9, 400, "Hacha", 80));
        gremio.mostrarRoster();

        gremio.eliminarMiembro("Malachar");
        gremio.mostrarRoster();

        Personaje encontrado = gremio.buscarPorNombre("Legolas");
        if (encontrado != null)
            System.out.println("Encontrado: " + encontrado.getNombre());

        gremio.encolarSolicitante("Gandalf");
        gremio.encolarSolicitante("Aragorn");
        gremio.encolarSolicitante("Gimli");
        gremio.mostrarCola();

        gremio.atenderSiguiente();   // atiende a Gandalf (FIFO)
        gremio.mostrarCola();

        gremio.agregarItem("Poción de vida", 5);
        gremio.agregarItem("Flecha élfica", 30);
        gremio.agregarItem("Poción de vida", 3);  // suma → 8

        gremio.mostrarInventario();

        gremio.usarItem("Poción de vida");
        gremio.usarItem("Pergamino de fuego");    // no existe
        gremio.mostrarInventario();

        gremio.registrarHabilidad("Curación");
        gremio.registrarHabilidad("Magia oscura");
        gremio.registrarHabilidad("Curación");    // duplicado — no se agrega

        gremio.mostrarHabilidades();

        System.out.println("¿Tiene flecha? " + gremio.tieneHabilidad("Tiro con arco"));
        System.out.println("¿Tiene curación? " + gremio.tieneHabilidad("Curación"));

        gremio.mostrarRoster();
        gremio.mostrarCola();
        gremio.mostrarInventario();
        gremio.mostrarHabilidades();
    }
}
