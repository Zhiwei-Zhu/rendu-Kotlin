fun main (args: Array<String>){
    println("Entrer un nombre entre 1 et 20: ")
    var mdp = readLine()
    var i =1
    plusoumoins(mdp,i)
}

fun plusoumoins(arg1: String?, arg2: Int) {
    var i = arg2
    print("Deviner la valeur entrée entre 1 et 20: ")
    var rep =readLine()
    var rep2 = rep.toString()
    if (rep != null) {
            if(rep2 < arg1.toString()){
                i += 1;
                println("la valeur entrée est inférieur")
                println("nombre d'essai: "+arg2)
                plusoumoins(arg1,i);

            }else if(rep2 > arg1.toString()){
                i += 1;
                println("la valeur entrée est supérieur")
                println("nombre d'essai: "+arg2)
                plusoumoins(arg1,i)

            }else if(rep2 == arg1.toString()) {
                println("Vous avez gagné")
            }
    }else{
            println("erreur")
        }
}