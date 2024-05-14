public class Enemigo {

    private String nombre;
    private int puntosAtaque;
    

    public Enemigo(String nombre, int puntosAtaque) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void calcularFuerzaEnemigo() {
        Random random = new Random();
       this.puntosAtaque = random.nextInt(10) + 1; // Fuerza enemiga entre 1 y 10
        
    }

    public int soltarDinero() {
        Random random = new Random();
        return random.nextInt(5) + 1; // Oro que soltará el enemigo entre 1 y 5
    }

    @Override
    public String toString() {
        return nombre + "(" + puntosAtaque + ")";
    }

}
