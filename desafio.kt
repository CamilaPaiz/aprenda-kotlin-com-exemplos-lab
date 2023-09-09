// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}

fun main() {
    val usuario1 = Usuario("Joao")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Francisco")
    val usuario4 = Usuario("Francisca")

    val conteudo1 = ConteudoEducacional("abstracao", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("logica", 120, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("javascript", 190, Nivel.AVANCADO)

    val formacao1 = Formacao("Formacao em ADS", listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Formacao em TI", listOf(conteudo1, conteudo2, conteudo3))

    formacao1.matricular(usuario1)
    formacao2.matricular(usuario2, usuario3, usuario4)

    println("Inscritos na Formacao 1:")
    for (usuario in formacao1.inscritos) {
        println(usuario.nome)
    }

    println("Inscritos na Formacao 2:")
    for (usuario in formacao2.inscritos) {
        println(usuario.nome)
    }
}


