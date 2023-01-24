
//Un piano es un instrumento que interpreta las notas con un timbre muy característico
class Piano: Instrumento(){
    override fun play() {
        i("Piano.play","Tocando piano")
        println("===>  TOCANDO PIANO")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miiii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
            }
        }
        println("")

    }
}
