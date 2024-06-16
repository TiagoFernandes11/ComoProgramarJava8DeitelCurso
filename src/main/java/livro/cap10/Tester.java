package livro.cap10;

import livro.cap10.classes.*;

public class Tester {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        ComissionEmployee commissionEmployee = new ComissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommisionEmployee;

        for(Employee currentEmployee: employees){
            System.out.println(currentEmployee);
            System.out.println("Earnings: " + currentEmployee.earnings() + "\n");
        }
    }
}
