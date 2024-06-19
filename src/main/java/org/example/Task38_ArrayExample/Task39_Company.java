package org.example.Task38_ArrayExample;

public class Task39_Company {
    public static void main(String[] args) {
        Task39_Employee[] employees = new Task39_Employee[20];
        employees[0] = new Task39_Employee("Adrian", "Karkowski", 11900);
        employees[1] = new Task39_Employee("Piotr", "Żełobowski", 6900);
        employees[2] = new Task39_Employee("Paweł", "Bartkowiak", 6900);

        int employeeIndex = 0;
        if (employeeIndex >= 0 && employeeIndex < employees.length) {
            //employees.lenght - Odwołuje nas do realnego rozmiaru tablicy
            System.out.println(employees[employeeIndex].getFirstName() + " " + employees[employeeIndex].getLastName()
                    + " " + employees[employeeIndex].getSalary() + ",-");
        }
        System.out.println("Realny zakres tablicy:" + employees.length);
    }
}
