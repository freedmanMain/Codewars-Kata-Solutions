import solutions.kuy7.CircularList;

public class Program {
    public static void main(String[] args) {
        CircularList<Integer> myList = new CircularList<>(1,2,3);

        System.out.println(myList.next());
        System.out.println(myList.next());
        System.out.println(myList.next());
        System.out.println(myList.next());
    }
}
