package examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Admin on 28.08.14.
 */
public class MyLinkedList {
    public static void main(String[] args) {
        //создаем связанный список А и добавляем в него 4 элемента
        List<String> a = new LinkedList<String>();
        a.add("First");
        a.add("Second");
        a.add("Third");
        a.add("Fourth");

        //создаем связной список Б и добавляем в него 3 элемента
        List<String> b = new LinkedList<String>();
        b.add("B-1");
        b.add("B-2");
        b.add("B-3");

        //создаем итераторы для А и Б списков
        ListIterator aIter = a.listIterator();
        Iterator bIter = b.iterator();

        System.out.println(a);
        System.out.println(b);

        //добавляем элементы списка Б в список А через один
        while (aIter.hasNext()){
            if (bIter.hasNext()) {
                aIter.next();
                aIter.add(bIter.next());
            } else {break;}
        }

        System.out.println(a);
        System.out.println(b);

        bIter = b.iterator();

        //удаляем из списка Б каждый втрой элемент
        while (bIter.hasNext()){
            bIter.next();
            if (bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);
        //групповая операция удаления всех слов Б из А
        a.removeAll(b);
        System.out.println(a);
    }

}
