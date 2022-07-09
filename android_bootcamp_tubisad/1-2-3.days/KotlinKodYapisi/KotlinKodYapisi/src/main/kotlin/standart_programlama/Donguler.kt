package standart_programlama

fun main() {
    //1,2,3
    for (i in 1..4){ // for each yapısına benzer sekilde kullannılır
        println("i:  $i")
    }

    // 10 ile 20 arasında 5er artsın
    for (a in 10..20 step 5){
        println("step 5: $a")
    }

    //20 ile 10 arası 5er azalsın
    for (b in 20 downTo 10 step 5){
        println("geriye 5: $b")
    }


    // WHİLE
    var sayac = 1

    while (sayac < 6){
        println("while dongu: $sayac")
        sayac +=1
        // sayac ++
    }

    for(i in 1..5){
        if(i == 3){
            break
        }
        println("break li dongu:  $i")
    }

    for(i in 1..5){
        if(i == 3){
            continue
        }
        println("continue lu dongu:  $i")
    }
}