import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.

        Scanner scan = new Scanner(System.in);
        boolean valueArTurn = false;
        boolean exit = false;
        ArrayList<String> arTunr = new ArrayList<>();
        while (valueArTurn == false){
            System.out.println("Введите элементы, для завершения введите 'stop' ");
            String inTurn = scan.nextLine();
            arTunr.add(inTurn);
            if(inTurn.equals("stop")){
                int maxSizeValue = arTunr.size() - 1;
                arTunr.remove(maxSizeValue);
                System.out.println(arTunr);
                valueArTurn = true;
            }
        }
        while(exit == false) {
            System.out.println("Выберите действие 1-enqueue, 2-dequeue, 3-first");
            String choice = scan.nextLine();
            if(choice.equals("1")||choice.equals("enqueue")){
                System.out.println(enqueue(arTunr));
                exit = true;
            } else if (choice.equals("2")||choice.equals("dequeue")) {
                System.out.println(dequeue((arTunr)));
                exit = true;
            }
            else if(choice.equals("3")||choice.equals("first")){
                System.out.println(first(arTunr));
                exit = true;
            }
        }
    }
    //enqueue() - помещает элемент в конец очереди
    public static ArrayList<String> enqueue(ArrayList<String> plusValue){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дополнительные элементы");
        String inTurn = scan.nextLine();
        plusValue.add(inTurn);
        System.out.printf("Список после добавление выглядит как ");
        return plusValue;
    }
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    public static ArrayList<String> dequeue(ArrayList<String> minusValue){
        System.out.printf("Первый элемент в списке равен: %s\n",minusValue.get(0));
        minusValue.remove(0);
        System.out.printf("Список после удаления выглядит так ",minusValue);
        return minusValue;
    }
    // first() - возвращает первый элемент из очереди, не удаляя.
    public static String first(ArrayList<String> firstValue){
        System.out.println(firstValue.get(0));
        System.out.printf("Первый элемент равен: ");
        return firstValue.get(0);
    }
}
