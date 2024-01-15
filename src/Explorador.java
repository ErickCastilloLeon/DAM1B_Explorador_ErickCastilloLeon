import java.util.Random;

public class Explorador {

    public String nombre;

    public int posicionActual;


    //---- Explorador y Nombre ----

    public Explorador(String nombre) {
        this.nombre = nombre;
        this.posicionActual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    //---- get y set de PosicionActual ----

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    //---- Explorador check y Moverse ----

        /* Comantario para no estar cambiando entre paginas :
        checkPosicion: Se revisará la posición actual del explorador.
        Se está en una trampa (por lo tanto muere y se acaba el juego)
        devuelve un 1, si está en el tesoro (gana y se acaba el juego) devuelve
        un 2. En otro caso devuelve un 0.
 */

    public int checkPosicion(Mapa mapa) {
        return this.posicionActual;
    }

    public int revisarPosicion(int posicionActual) {
        Mapa Mapa = null; //No se si estará bien poner esto.
        if (posicionActual == 0) {
            System.out.println("Estás en una posición segura. No pasa nada.");
            return 0; // No pasa nada
        } else if (posicionActual == this.checkPosicion(Mapa)) {
            System.out.println("¡Caíste en una trampa! ¡Perdiste!");
            return 1; // El jugador pierde
        } else {
            System.out.println("¡Te salvaste de una trampa!¡Felicidades!");
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
