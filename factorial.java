import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int fact = 1;

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    for(int i = 1; i <= num; i++){
        fact = fact * i;
    }
    System.out.println("factorial of the number " + num + " is: " + fact);
    // hello guys
    System.out.println("hello guys factorial is printed.");
}
}