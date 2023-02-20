import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class task3 {
    public static void main(String[] args) {
        Stack<Double> list = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double rez = in.nextInt();
        while (true){
            Scanner sin = new Scanner(System.in);
            System.out.print("Введите операнд (+, -, *, /): ");
            String op = sin.nextLine();
            if (op.equals("cancel")){
                list.pop();
                rez = list.get(list.size()-1);
                System.out.println("Ответ: " + rez);
                continue;
            }
            System.out.print("Введите второе число: ");
            double y = in.nextInt();
            if (op.equals("+")) {
                rez = rez + y;
            } 
            if (op.equals("-")) {
                rez = rez - y;
            }
            if (op.equals("*")) {
                rez = rez * y;
            } 
            if (op.equals("/")) {
                rez = rez / y;
            }
            System.out.println("Ответ: " + rez);
            list.push(rez);
        }
    }
}
