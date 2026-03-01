// https://www.bumbii.tech/bai-tap-lap-trinh/600-bai-tap-tong-hop#basic-inputoutput--math
fun printInt() {
    print("Please enter a number: ")
    val input = readln()
    val intNumber = input.trim().toIntOrNull()
    if (intNumber != null) {
        print("You entered: $intNumber")
    } else {
        print("\"$input\" is not a number")
    }
}

printInt()