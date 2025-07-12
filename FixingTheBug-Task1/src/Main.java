import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
//        TASK 1: Fix the Bug
        //using foreach if we modify the list like removing the element then
        //it will throw ConcurrentModificationException
//        for (Integer num : numbers) {
//            if (num % 2 != 0) {
//                numbers.remove(num);
//            }
//        }
//        System.out.println(numbers);


        //use iterator to remove the numbers from list
//        Iterator<Integer> it = numbers.iterator();

//        while(it.hasNext()){
//            Integer value = it.next();
//            if(value % 2 == 0)
//                it.remove();
//        }

        //or use removeIf

        numbers.removeIf(num -> num%2 == 0);
        System.out.println(numbers);
    }
}