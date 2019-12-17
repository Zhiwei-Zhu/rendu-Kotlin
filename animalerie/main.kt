
fun main(arg: Array<String>){
    var an = Animaux    ("chien","ouaf!")
    var an2 = Animaux("chat", "miaou")
    var an3 = Animaux("perroquet", "cuak")
    an.parler()
    an.quiSuisJe()
    var animalerie = Animalerie()
    animalerie.add(an.type,an.sound)
    animalerie.add(an2.type,an2.sound)
    animalerie.add(an3.type,an3.sound)
    animalerie.quiSuisJe()
}