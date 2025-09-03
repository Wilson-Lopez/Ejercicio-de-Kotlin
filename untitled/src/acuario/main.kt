package acuario

fun construirAcuario(){
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    //altura y largo por defecto
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    // ancho por defecto
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()
    // tofo personalizado
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 25)
    acuario8.imprimirTamano()

    val torre = Tanquetorre(diametro = 25, alto = 40)
    torre.imprimirTamano()

}
fun main(){
    construirAcuario()


}