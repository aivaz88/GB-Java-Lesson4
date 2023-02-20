import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class task2 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        String com = new String("");
        while(!com.equals("stop")){
            for (int i = 0; i < myList.size(); i++) {
                System.out.print(myList.get(i) + ", ");
            }
            System.out.print("\n1 - помещает элемент в конец очереди; \n2 - возвращает первый элемент из очереди и удаляет его; \n3 - возвращаяет первый элемент из очереди, не удаляя.\nВыберите команду: ");
            com = scan.nextLine();
            if (com.equals("1")){
                myList = enqueue(myList);
            }
            if (com.equals("2")){
                myList = dequeue(myList);
            }
            if (com.equals("3")){
                first(myList);
            }
        }
    }

    public static LinkedList enqueue(LinkedList<String> lilist){
        System.out.print("Введите, что нужно добавить: ");
        String str = scan.nextLine();
        lilist.add(str);
        return lilist;
    }

    public static LinkedList dequeue(LinkedList<String> lilist){
        System.out.println("Первый в очереди: " + lilist.pop());
        return lilist;
    }

    public static void first(LinkedList<String> lilist){
        System.out.println("Первый в очереди: " + lilist.get(0));
    }
}
