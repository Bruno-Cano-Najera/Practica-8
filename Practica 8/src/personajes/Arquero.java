package personajes;

public class Arquero extends Personaje {
    private int alcance;
    private String tipoFlecha;
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoFlecha, int alcance, int precision) {
        super(nombre, nivel, puntosVida);
        this.alcance = alcance;
        this.tipoFlecha = tipoFlecha;
        this.precision = precision;
    }

    public int getAlcance() {
        return alcance;
    }

    public String getTipoFlecha() {
        return tipoFlecha;
    }

    public int getPrecision() {
        return precision;
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " esquiva el ataque con agilidad.");
    }

    @Override
    public String toString() {
        return super.toString() + "| Alcance: " + alcance + "| Tipo de Flecha: " + tipoFlecha;
    }

}
