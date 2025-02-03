//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int intOperandA = 4;
        int intOperandB = 17;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandB - intOperandA;
        int intQuotient = intOperandB / intOperandA;
        int intModulo = intOperandB % intOperandA;
        double doubleOperandA = 3.50;
        double doubleOperandB = 9.50;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandB - doubleOperandA;
        double doubleQuotient = doubleOperandB / doubleOperandA;
            System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
            System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
            System.out.println("The difference using ints of " + intOperandB + " " + intOperandA + " is " + intDifference);
            System.out.println("The quotient using ints of " + intOperandB + " " + intOperandA + " is " + intQuotient);
            System.out.println("The modulo using ints of " + intOperandB + " " + intOperandA + " is " + intModulo);
            System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
            System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
            System.out.println("The difference using doubles of " + doubleOperandB + " " + doubleOperandA + " is " + doubleDifference);
            System.out.println("The quotient using doubles of " + doubleOperandB + " " + doubleOperandA + " is " + doubleQuotient);
    }
}