import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> liLi = new LinkedList<>();
        LinkedList<String> liLi2 = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        boolean confirmation = false;
        while(confirmation == false){
            System.out.print("введиет значения. Введите команду 'stop' для завершения ");
            String entValue = scan.nextLine();
            liLi.add(entValue);
            if(entValue.equals("stop") || entValue.equals("STOP")){
                int maxSizeValue = liLi.size() - 1;
                liLi.remove(maxSizeValue);
                System.out.println(liLi);
                for (int i = 0; i < liLi.size(); i++) {
                    liLi2.add(liLi.get(maxSizeValue - 1));
                    maxSizeValue--;
                }
                System.out.println(liLi2);
                confirmation = true;
            }
            else {

            }
        }
    }
}
