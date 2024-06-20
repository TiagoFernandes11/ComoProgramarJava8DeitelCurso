package livro.cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try {
                System.out.println("Entre um numerador inteiro: ");
                int numerator =  sc.nextInt();
                System.out.println("Entre um denominador inteiro: ");
                int denominator = sc.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.err.printf("%nException: %s%n", inputMismatchException);
                sc.nextLine();
                System.out.println("Você deve entrar com valores inteiros. Por favor tente novamente");
            }
            catch (ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                sc.nextLine();
                System.out.println("Zero é um denominador invalido. Por favor tente novamente");
            }
        } while(continueLoop);
    }
}
