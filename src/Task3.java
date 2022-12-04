import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        //В калькулятор добавьте возможность отменить последнюю операцию.
        boolean exit= false;
        while (exit == false) {
            System.out.println("Выберите действие + - * /, !=exit");
            char ch = (char) System.in.read();
            if (ch == '+') {
                System.out.println(plus());
            }
            else if (ch == '-') {
                System.out.println(minus());
            }
            else if (ch == '*') {
                System.out.println(multiply());
            }
            else if (ch == '/') {
                System.out.println(divide());
            }
            else if (ch == '!') {
                exit = true;
            }
        }
    }
    public static int plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифры через enter");
        int firstValue = scan.nextInt(), secondValue = scan.nextInt();
        int result = firstValue + secondValue;
        return result;
    }
    public static int minus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифры через enter");
        int firstValue = scan.nextInt(), secondValue = scan.nextInt();
        int result = firstValue - secondValue;
        return result;
    }
    public static int multiply(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифры через enter");
        int firstValue = scan.nextInt(), secondValue = scan.nextInt();
        int result = firstValue * secondValue;
        return result;
    }
    public static int divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифры через enter");
        int firstValue = scan.nextInt(), secondValue = scan.nextInt();
        int result = firstValue / secondValue;
        return result;
    }
}
