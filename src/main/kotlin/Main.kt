// Main function to demonstrate the usage of the Employee class
fun main() {
    // Creating instances of the Employee class with example data
    val employee1 = Employee("John Doe", "E001", 1)
    val employee2 = Employee("Jane Smith", "E002", 2)

    // Displaying information for the first employee
    employee1.displayEmployeeInfo()

    // Adding a newline for better readability in the console
    println("\n")

    // Displaying information for the second employee
    employee2.displayEmployeeInfo()
}
