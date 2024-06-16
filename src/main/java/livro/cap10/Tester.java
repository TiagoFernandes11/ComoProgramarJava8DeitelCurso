package livro.cap10;

import livro.cap10.classes.*;
import livro.cap10.interfaces.Invoice;
import livro.cap10.interfaces.Payable;

public class Tester {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        ComissionEmployee commissionEmployee = new ComissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
        BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        Payable[] payables = new Payable[6];

        payables[0] = salariedEmployee;
        payables[1] = hourlyEmployee;
        payables[2] = commissionEmployee;
        payables[3] = basePlusCommisionEmployee;
        payables[4] = new Invoice("01234", "seat", 2, 375.00);
        payables[5] = new Invoice("56789", "tire", 4, 79.95);

        for(Payable currentPayable: payables){
            System.out.println(currentPayable);
            System.out.println("Earnings: " + currentPayable.getPaymentAmount() + "\n");
        }
    }
}
