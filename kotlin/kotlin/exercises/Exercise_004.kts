fun mathOn2Numbers() {
    print("Enter a: ")
    val a = readln().trim().toIntOrNull()
    print("Enter b: ")
    val b = readln().trim().toIntOrNull()

    if (a !is Int || b !is Int) {
        print("The input is not valid!")
        return
    }

    if (b == 0) {
        print("b must be different from 0")
        return
    }

    val difference = a - b
    val product = a * b
    val quotient = a / b

    print("Difference = $difference, Product = $product, Quotient = $quotient")
}

mathOn2Numbers()