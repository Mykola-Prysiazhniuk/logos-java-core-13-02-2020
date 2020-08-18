package lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class literatorApp {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Monday");
        stringArrayList.add("Tuesday");
        stringArrayList.add("Wednesday");
        stringArrayList.add("Thursday");
        stringArrayList.add("Friday");
        stringArrayList.add("Saturday");
        stringArrayList.add("Sunday");

//        Iterator<String> iterator = stringArrayList.iterator();
//
//       while(iterator.hasNext()){
//           System.out.println(iterator.next());
//       }

        ListIterator<String> listIterator = stringArrayList.listIterator();

       while (listIterator.hasNext()){
           String day = listIterator.next();
           if (day.equalsIgnoreCase("Tuesday")){
               listIterator.previous();
           }
           System.out.println(day);
       }

        System.out.println();
       while (listIterator.hasPrevious()){
           System.out.println(listIterator.previous());
       }

    }
}
