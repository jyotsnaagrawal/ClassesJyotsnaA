class Employee(
    //employee entity with private properties
    private var employeeName: String?,
    private var employeeNumber: String?,
    private var employeeShift: Int
) {
    // Constructor
    init {
        // Ensuring that the employeeShift is within the valid range (1 to 3)
        require(employeeShift in 1..3) { "Shift must be 1, 2, or 3" }
    }

    // Display method to print employee info
    fun displayEmployeeInfo() {
        println("Employee Information:")
        println("Name: $employeeName")
        println("Employee Number: $employeeNumber")
        println("Shift: $employeeShift")
    }
}
