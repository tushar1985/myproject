
import java.util.Scanner;
public class firstprogram {

    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        char oper;
        double num1,num2,num3;
        System.out.println("Enter two numbers");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        System.out.println("Enter operator");
        oper= scan.next().charAt(0);
        switch (oper)
        {
            case '+':
                num3=num1+num2;
                System.out.println("The result of addition is " + num3);
                break;
            case '-':
                num3=num1-num2;
                System.out.println("The result of subtraction is " + num3);
                break;
            case '*':
                num3=num1*num2;
                System.out.println("The result of multiplication is " + num3);
                break;
            case '/':
                num3=num1/num2;
                System.out.println("The result of division is " + num3);
                break;
            default:
                System.out.println("Wrong operator given");
                break;

        }

        scan.close();
    }
}
