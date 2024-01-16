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

    //---- Explorar , check y Moverse ----

    /* Comantario para no estar cambiando entre paginas :
    Explorar: Explorador revisará las “casillas”
    adyacentes (la de arriba, la de abajo, la de la
    izquierda y la de la derecha). Y devolverá el
    número de casillas con trampas. Por lo tanto,
    devolverá un número entre 0 y 4.
    Cada vez que se mueva el explorador, se deberá
    revisar la posición nueva, para discernir si ha
    caído en una trampa o a encontrado el tesoro.*/

    public int explorar(Mapa mapa) {
        int trampasEncontradas = 0;

        // Obtener la posición actual del explorador
        int filaActual = mapa.posTesoro.getCoordenadaFila();
        int columnaActual = mapa.posTesoro.getCoordenadaFila();

        // Verificar la casilla superior
        if (filaActual > 0) {
            trampasEncontradas += mapa.po(filaActual - 1, columnaActual) ? 1 : 0;
        }

        // Verificar la casilla inferior
        if (filaActual < mapa.posTesoro.getCoordenadaCol() - 1) {
            trampasEncontradas += mapa.trampa(filaActual + 1, columnaActual) ? 1 : 0;
        }

        // Verificar la casilla izquierda
        if (columnaActual > 0) {
            trampasEncontradas += mapa.trampa(filaActual, columnaActual - 1) ? 1 : 0;
        }

        // Verificar la casilla derecha
        if (columnaActual < mapa.posTesoro.getCoordenadaCol() - 1) {
            trampasEncontradas += mapa.trampa(filaActual, columnaActual + 1) ? 1 : 0;
        }

        // Limitar el resultado a estar entre 0 y 4
        return Math.min(4, trampasEncontradas);
    }



    /* Comentario para no estar cambiando entre páginas:
    checkPosicion: Se revisará la posición actual del explorador.
    Se está en una trampa (por lo tanto muere y se acaba el juego)
    devuelve un 1, si está en el tesoro (gana y se acaba el juego) devuelve
    un 2. En otro caso devuelve un 0.*/

    public int checkPosicion(Mapa mapa) {
        return this.posicionActual;
    }

    public int revisarPosicionActual(int posicionActual) {
        Mapa Mapa = null;
        if (posicionActual == 0) {
            return 0; // No pasa nada
        } else if (posicionActual == this.checkPosicion(Mapa)) {
            return 1; // El jugador pierde
        } else {
            return 2; // El jugador gana
        }
    }

    /* Comentario para no estar cambiando entre páginas:
    Moverse: Se modificará la posición actual del explorador. El parámetro de entrada
    será un valor entero entre 1 y 4 (fijarse en las constantes de la clase). */

    public void moverse() {
        // Declaración e inicialización de la variable direccion
        int direccion = 0;

        // Cambiar el valor de direccion a un número aleatorio entre 1 y 4
        Random random = new Random();
        int nuevoValor = random.nextInt(4) + 1;
        direccion = nuevoValor;
    }

}
