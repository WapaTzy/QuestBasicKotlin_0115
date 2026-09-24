// Class
    val contact = Contact(1, "mary@gmail.com") 
    contact.printId() 
    // Data classes
    val user = User("Alex", 1) 
    println(user.copy(id = 3)) 
    // Null safety
    var nullString: String? = null 
    println(nullString?.length ?: 0)