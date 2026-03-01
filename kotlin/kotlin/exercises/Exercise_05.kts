// https://www.bumbii.tech/bai-tap-lap-trinh/600-bai-tap-tong-hop#basic-inputoutput--math
fun calculatePerimeter(width: Float, height: Float) = (width + height) * 2

fun calculateArea(width: Float, height: Float) = width * height

fun main() {
    print("Enter width: ")
    val width = readln().trim().toFloatOrNull()
    print("Enter height: ")
    val height = readln().trim().toFloatOrNull()

    if (width is Float && height is Float) {
        println("Perimeter = ${calculatePerimeter(width, height)}")
        println("Area = ${calculateArea(width, height)}")
    } else {
        print("The input is invalid!")
    }
}

main()
