package personajes;

public class Druida extends Personaje{
    private int mana;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public int calcularDanio() {
        return 8 + mana * 2; 
    }

    @Override
    public void atacar(){
        if (mana > 0) {
            System.out.println("[" + getNombre() + "] ataca con su forma animal. Daño: " + calcularDanio());
            mana--;
        } else {
            System.out.println("[" + getNombre() + "] no tiene suficiente mana para atacar.");
        }
    }

}
