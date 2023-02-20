import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
 * который вернет “перевернутый” список.
 */
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.add(7);
        System.out.println(linkList);
        LinkedList<Integer> list2 = rev(linkList);
        System.out.println(list2);
    }
    public static LinkedList rev(LinkedList<Integer> lilist){
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < lilist.size(); i++) {
            list1.add(0, lilist.get(i));
        }
        return list1;
    }   
}