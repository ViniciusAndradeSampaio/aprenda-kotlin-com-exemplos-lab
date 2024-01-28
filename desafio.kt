// [Template no Kotlin Playground](https://pl.kotl.in/pwkg24HVb)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val id: Int, val nome: String)
	
data class ConteudoEducacional(var nome: String, var duracao: Int, var nivel: Nivel) {
    init {
        duracao /= 60
    }
}	
data class Formacao(val nome: String) {
    private val inscritos = mutableListOf<Usuario>()
    private val conteudos = mutableListOf<ConteudoEducacional>()
    
    fun addConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }
    fun listarConteudos() {
        println("Formação de $nome contém: ")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} - Carga Horária: ${conteudo.duracao} horas - Nível: ${conteudo.nivel}")
        }
    }
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("-> O aluno ${usuario.nome} de Identificação ${usuario.id} foi matriculado na formação $nome.")
    }
    fun listarInscritos() {
        println("Nome dos alunos na formação $nome:")
        for (inscrito in inscritos) {
            println("- ${inscrito.nome}")
        }
    }
}

fun main() {
    //adicionar usuarios-------------
    val usuario1 = Usuario(1, "Robo#01")
    val usuario2 = Usuario(2, "Robo#02")
    //adicionar conteudo--------------
    var conteudo1 = ConteudoEducacional("TESTE-DUR.120-NV.BASICO", 120, Nivel.BASICO)
    var conteudo2 = ConteudoEducacional("TESTE-DUR.240-NV.INTERMEDIARIO", 240, Nivel.INTERMEDIARIO)
    var conteudo3 = ConteudoEducacional("TESTE-DUR.480-NV.AVANCADO", 480, Nivel.AVANCADO)
    //adicionar formação--------------
    val formacao = Formacao("Desenvolvimetno Back-end Kotlin")

    //exibir usuarios matriculados---------------
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    println("\n")
    //exibir inscritos-----------
    formacao.listarInscritos()
    println("\n")
    //exibir conteudo-----------
    formacao.addConteudo(conteudo1)
    formacao.addConteudo(conteudo2)
    formacao.addConteudo(conteudo3)
    formacao.listarConteudos()
    println("\n")
}







//************************       CODIGO ORIGINARIO DO DESAFIO DAQUI PARA BAIXO        ******************************
//enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
//class Usuario
//data class ConteudoEducacional(var nome: String, val duracao: Int = 60)
//data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
//    val inscritos = mutableListOf<Usuario>()
//    fun matricular(usuario: Usuario) {
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
//    }
//}
//fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
//}
