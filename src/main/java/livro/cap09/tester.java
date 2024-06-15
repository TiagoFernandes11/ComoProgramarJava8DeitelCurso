package livro.cap09;


import livro.cap09.classes.BasePlusCommissionEmployee;
import livro.cap09.classes.CommissionEmployee;

public class tester {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        System.out.println(commissionEmployee);
        System.out.println(commissionEmployee.earnings());

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06, 1000);
        System.out.println(basePlusCommissionEmployee);
        System.out.println(basePlusCommissionEmployee.earnings());
    }
}
