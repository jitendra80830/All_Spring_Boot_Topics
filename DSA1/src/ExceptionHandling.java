import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println("division : " + c);
            System.out.println("Termiited");
        }catch (ArithmeticException e){
            System.out.println("B can't be 0");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Error all");
            System.out.println(e.getMessage());
        }
    }
}
