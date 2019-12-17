
fun main(arg: Array<String>){
    //Je pensais plus pertinent de créer une classe Animaux pour éviter la répition de la création de classe qui prennent de la place pour rien
    //Pour créer un animal vous avez juste à créer une variable avec la classe Animaux dont en paramètre il y a le type(type) et le son de l'animal(sound)
    var an = Animaux("chien","ouaf!")
    var an2 = Animaux("chat", "miaou")
    var an3 = Animaux("perroquet", "cuak")
    an.parler()
    an.quiSuisJe()
    var animalerie = Animalerie()
    animalerie.add(an)
    animalerie.add(an2)
    animalerie.add(an3)
    animalerie.quiSuisJe()



}