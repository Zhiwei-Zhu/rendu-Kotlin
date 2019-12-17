class Animalerie():Animal {
    val listt = mutableListOf<String>()
    val lists = mutableListOf<String>()
    fun add(type:String, sound:String) {
        listt.add(type)
        lists.add(sound)
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
