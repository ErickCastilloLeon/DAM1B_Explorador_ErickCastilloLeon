import java.util.Random;

public class Explorador {

    public String nombre;

    public int posicionActual;


    //---- Explorador y Nombre ----

    public Explorador (String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    //---- get y set de PosicionActual ----

    public int getPosicionActual() {
        int Posicion = 0;
        return posicionActual = Posicion ;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    //---- Explorar, check y Moverse ----

    public int Explorar(Mapa mapa) {

        /* int p = mapa.obtenerElementosExplorados();
        return elementosExplorados; */
        return 0;
    }

    public JuegoCheckpoint(Mapa mapa) {
        this.Mapa = mapa;
    }

    public void checkPosicion() {
        Mapa.osicionTrampa(3);
    }

    public int revisarPosicion(int posicionActual) {
        if (posicionActual == 0) {
            System.out.println("Estás en una posición segura. No pasa nada.");
            return 0; // No pasa nada
        } else if (posicionActual == this.checkPosicion()) {
            System.out.println("¡Caíste en una trampa! ¡Perdiste!");
            return 1; // El jugador pierde
        } else {
            System.out.println("¡Felicidades! ¡Salvaste la trampa! ¡Ganaste!");
            return 2; // El jugador gana
        }
    }

    /* Comantario para no estar cambiando entre paginas :
    Moverse: Se modificará la posición actual del explorador. El parámetro de entrada
    será un valor entero entre 1 y 4 (fijarse en las constantes de la clase). */

    public void moserse() {
        // Declaración e inicialización de la variable posicion
        int direccion = 0;

        // Imprimir el valor actual de posicion
        System.out.println("Valor actual de posicion: " + direccion);

        // Cambiar el valor de posicion a un número aleatorio entre 1 y 100
        Random random = new Random();
        int nuevoValor = random.nextInt(4) + 1;
        direccion = nuevoValor;

        // Imprimir el nuevo valor de posicion
        System.out.println("Nuevo valor de posicion: " + direccion);
    }
}
