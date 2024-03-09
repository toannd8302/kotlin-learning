fun main(args: Array<String>) {
//for (i in 1 .. 3) {
//    for (j in 1..2) {
//        println("${i}${j}")
//    }
//}
    var h = 6
    println()
    println()
    for (i in 1..h) {
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")

        for (j in 1..h ){
           if (j ==1 || j == h || i == j)
               print("*")
            print("\t")

        }
        for (j in 1..h ){
            if ((j ==2 && (i in 2..5))
                || (j==3 &&(i==1 || i==6))
                || (j==4 && (i==1 || i==4 || i==6))
                || (j==5 && (i==4 || i==5))
                || (i==6 && (j in 3..4)))
                print("*")
            print("\t")
        }

        for (j in 1..h){
            if (j == 1 || j == h || i==h)

                print("*")
            print("\t")
        }

        for (j in 1..h){
            if ((i==1 &&(j==5 || j==1))
                || (i==2 && (j==2 || j==4))
                || (j==3) && (i in 3..6))

                print("*")
            print("\t")
        }

        for (j in 1..h){
            if (i == 1 || i == 6 || j==1 || i ==3 )

                print("*")
            print("\t")
        }
        print("\t")
        for (j in 1..h ){
            if (j ==1 || j == h || i == j)
                print("*")
            print("\t")

        }



        println()
    }
    println()
    println()
    println()
    println()
    for (k in 1..h){
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        print("\t")
        for (l in 1..h){

                if ((k ==1 && l!=6) || l==3 )
                    print("*")
                print("\t")
        }
        for (l in 1..h){

            if ( l==1 || l ==6 ||  k ==1 || k==6)
                print("*")
            print("\t")
        }
        for (l in 1..h){

            if ( ((k==1 &&(l in 2..5 ))
                        || ((l==1 &&(k in 2..6)) || (l==6 && (k in 2..6)))
                        || k==3
                    ))
                print("*")
            print("\t")
        }
        for (l in 1..h){

            if ( l== 1 || l==6 || l ==k)
                print("*")
            print("\t")
        }

        println()
    }
    println()
}

