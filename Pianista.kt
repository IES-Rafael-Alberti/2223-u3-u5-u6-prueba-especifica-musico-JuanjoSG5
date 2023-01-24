
class Pianista(private val instrumento:Instrumento, unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico(){
    /**
     *
     */

    private var partitura = unaPartitura
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Pianista.init", "Inicializado el Pianista")
    }

    override fun interpretar() {
        i("Pianista.intepretar","Interpretando una partitura")
        println("")
        println("####### - SOY PIANISTA")
        instrumento.play()
    }
}