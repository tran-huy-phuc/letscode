fun sum(a: Int, b: Int) = a + b

fun enterAndSum() {
    print("Enter first number: ")
    val a = readln()

    print("Enter second number: ")
    val b = readln()

    // Trim the spaces around the inputs and convert to Int (if possible).
    val aInt = a.trim().toIntOrNull()
    val bInt = b.trim().toIntOrNull()
    if (aInt is Int && bInt is Int) {
        print("Sum of $aInt and $bInt = ${sum(aInt, bInt)}")
    } else {
        print("The input is not valid!")
    }
}

enterAndSum()
