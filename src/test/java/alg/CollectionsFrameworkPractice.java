package alg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsFrameworkPractice {
    public static void main(String[] args) {
        List<String> fruitsArrayLst = new ArrayList<>(); // interface  and its realisation
        // list is an interface, array list is a resizable array,  cannt  set  the  size  of  the  array list
        //  set  the size of the array list
//        fruitsArrayLst.ensureCapacity(5);//  cannt  do  this because  array  list  is  not  an  array
        fruitsArrayLst.add("Apple");
        fruitsArrayLst.add("Apple");
        fruitsArrayLst.add("Orange");
        fruitsArrayLst.add("Banana");
        fruitsArrayLst.add("Mango");
        fruitsArrayLst.add("Grapes");
        // add in the 2nd position
        fruitsArrayLst.add(1, "Watermelon"); // array copy
        System.out.println("ArrayList: " + fruitsArrayLst);

        List<String> fruitsLinkedList = new LinkedList<>(); // interface  and its realisation less usable than array list
        //  interconnection  between  elements,  cheap  paste in the  middle,  costly  to  add
        fruitsLinkedList.add("Apple"); // allow  duplicates
        fruitsLinkedList.add("Apple");
        fruitsLinkedList.add("Orange");
        fruitsLinkedList.add("Banana");
        fruitsLinkedList.add("Mango");
        fruitsLinkedList.add("Grapes");
        fruitsLinkedList.add(1, "Watermelon");
        System.out.println("LinkedList: " + fruitsLinkedList);
    }

    // set -  not allow  duplicates, not  allow  null,  not  allow  to  set  the  size,  not  allow  to  add  in  the  middle
    //


}
