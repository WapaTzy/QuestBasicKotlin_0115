// Conditional expressions
    val check = true 
    if (check) { d = 1 } else { d = 2 }
    val obj = "Hello" 
    val result = when (obj) { 
        "1" -> "One" 
        "Hello" -> "Greeting" 
        else -> "Unknown" 
    }
    println(result) 

    // Loops & Ranges
    for (number in 1..5) { print(number) }
    println())