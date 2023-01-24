/**
 * Un grupo de Instrumentos, que tiene los siguientes metodos:
 *
 *  > Fun incorporaNota: recibe [nota]
 *  > Fun play: la cual esta vacia para que sobreescribirla (En principio la idea era que fuera abstracta y que
 *      play fuera un metodo abstracto, pero no podria mantanerse la estructura de la main
 *
 *  > Fun reset: la cual vacia la melodia que toca el Instrumento
 *
 * @sample
 *
 *
 */
open class Instrumento{



    protected var melodia = mutableListOf<Nota>()
    open fun play() {}


    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    fun reset() = melodia.clear()
}