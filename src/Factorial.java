import java.util.Scanner;

public class Factorial {

    static int factorial(int num)  // fuction num = 5
    {
        if(num == 1)
        {
            return 1;
        }
        else
        {
            return (num * (factorial(num-1))); //Recursion
        }
    }
             public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);
                 int n = scanner.nextInt();
                 int result = factorial(n);
                 System.out.println(result);
                 scanner.close();

             }
}