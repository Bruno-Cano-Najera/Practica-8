package personajes;


public class Nigromante extends Personaje {
    
    private int nivelOscuridad;

    public Nigromante(String nombre, int nivel, int puntosVida, int nivelOscuridad) {
        super(nombre, nivel, puntosVida);
        this.nivelOscuridad = nivelOscuridad;
    }

    public int getNivelOscuridad() {
        return nivelOscuridad;
    }

    @Override 
    public void atacar() {
        System.out.println("[" + getNombre() + "] ataca con magia negra arcana. Daño: " + calcularDanio());
    }

    public int calcularDanio() {
        return 12 + nivelOscuridad * 3; 
    }
}
