fun main() {
   var x = true
   var y = false
    println(x&&y)
    println(x.and(y))
    var a = 2
    var b = 2
    println(++a)
    println(--a)
    println(b++)
    println(b--)
    println("-------------------------")
    
    var str: String? = null
    var str2: String? = "May be declare nullable string"
    var len1: Int = str ?.length ?: -1
    var len2: Int = str2 ?.length ?: -1
    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
    
    println("-------------------------")
    
    var choice=2
    var result=when(choice){
        1 -> {
            println("hello")
        }
        2 -> {
            println("hiii")
        }
        else ->"no need"
    }
    println(result)
    
    //loop
    println("-------------------------")
    for(i in 1..5){
        println(i)
    }
    println("-------------------------")
    for (item in 5 downTo 1 step 2) {
        println(item)
    }
    println("-------------------------")
    
    }
