
open class Animaux(var type : String,var sound: String): Animal{
    override fun parler(){
        println(sound)
    }
    override fun quiSuisJe(){
        println("c'est un "+type+" et son bruit c'est "+sound)
    }
}
