class Violinista(private var instrumento: Instrumento, unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)):Musico() {
    private var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Violinista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Violinista.init", "Inicializado el Violinista")

    }

    override fun interpretar() {
        i("Violinista.intepretar","Interpretando una partitura")
        println("")
        println("####### - SOY VIOLINISTA")
        instrumento.play()

    }
}