package livro.cap10.classes;

import livro.cap10.interfaces.Payable;
import lombok.Data;

@Data
public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
