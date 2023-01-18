
class Pianista(unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)) {

    private val piano = Piano()
    var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Pianista.init", "Inicializado el Pianista")
    }

    fun interpretar() {
        i("Pianista.intepretar","Interpretando una partitura")
        piano.play()
    }
}