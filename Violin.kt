class Violin:Instrumento() {
    override fun play() {
        i("Violin.play", "Tocando Violin")
        println("===>  TOCANDO VIOLIN ")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dogg ")
                Nota.RE -> print("regg ")
                Nota.MI -> print("migg ")
                Nota.FA -> print("fagg ")
                Nota.SOL -> print("solgg ")
                Nota.LA -> print("lagg ")
                Nota.SI -> print("sigg ")
            }
        }
        println("")
    }
}