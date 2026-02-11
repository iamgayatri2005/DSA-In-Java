import java.util.Scanner;
public class AddingOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int result = number + 1;

        System.out.println("Result after adding 1:" 
            + result);

        scanner.close();    
    }
}
