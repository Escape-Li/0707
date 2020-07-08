import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @author Escape
 * @date 2020/7/8 - 13:36
 *
 *
 */
//class Student{
//    int a;
//    void print(){
//        System.out.println();
//
//    }
//    void abc(Object a){
//        if (a == null) {
//
//        }
//    }
//
//}

public class dsa {

    public static void main(String[] args) {
        System.out.println();
        String[] arr =  new String[] {"a","b","c"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Integer integer : list) {
            System.out.println(integer);
        }




    }
}


