class EstudianteMusica(private val instrumento:Instrumento, unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)):Interprete {
    private var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Estudiante.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Estudiante Musica.init", "Inicializado al Estudiante de Musica ")
    }

    override fun interpretar() {
        i("Estudiante.intepretar","Interpretando una partitura")
        println("")
        println("####### - SOY UN ESTUDIANTE DE MUSICA ")
        instrumento.play()
    }
}