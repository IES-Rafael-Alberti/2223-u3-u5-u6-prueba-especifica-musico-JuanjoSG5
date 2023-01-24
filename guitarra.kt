class Guitarra:Instrumento() {
    override fun play() {
        i("Guitarra.play","Tocando Guitarra")
        println("===>  TOCANDO GUITARRA")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("donn ")
                Nota.RE -> print("renn ")
                Nota.MI -> print("minn ")
                Nota.FA -> print("fann ")
                Nota.SOL -> print("sonn ")
                Nota.LA -> print("lann ")
                Nota.SI -> print("sinn ")
            }
        }
        println("")
    }
}