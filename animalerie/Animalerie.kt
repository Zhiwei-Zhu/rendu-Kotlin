class Animalerie():Animal {
    val listt = mutableListOf<String>()
    val lists = mutableListOf<String>()
    fun add(obj:Animaux) {
        listt.add(obj.type)
        lists.add(obj.sound)
        println(listt)

    }
    override fun quiSuisJe(){
        var i=0
        while(i <listt.size){
            println("c'est un "+listt[i]+" et son bruit c'est "+lists[i])
            i++
        }
    }
}
