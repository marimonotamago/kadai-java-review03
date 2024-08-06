package javaapis.collection.list;

import java.util.ArrayList;

public class NoGenericArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        Integer ig = 123;
        
        list.add(ig);
        list.add(new String("abc"));
        
        // iの値を0から 間、1ずつカウントアップして繰り返す
        for (int i = 0; i < list.size(); i ++) {
            Integer data = (Integer)list.get(i); //i番目のデータを取得する
            System.out.println(i);
        }

    }

}
