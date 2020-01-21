package com.whh;

import java.util.HashMap;

/**
 * @author whh
 * @date 2020/1/19 - 17:37
 */
public class DebugTest {

    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            System.out.println(i);
        }


        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Qinghua");
        map.put("major","computer");


       String age =  map.get("age");
       System.out.println("age = " + age);

       map.remove("major");
       System.out.println(map);
    }



}
