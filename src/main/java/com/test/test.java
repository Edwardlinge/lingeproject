package com.test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {
        //lin();
       // te();
        Date date1 = new Date();
        System.out.println(date1.getTime());
        //System.out.println(DateUtil.getToday().toString());
       // System.out.println(DateUtil.getTomorrow().toString());
        Integer date = Integer.valueOf(String.valueOf(new Date().getTime()).substring(0, 10));
        System.out.println(DateUtil.defaultFormat(new Date()).substring(11,16).toString());
        System.out.println(DateUtil.defaultFormat(new Date()).substring(0,11).toString());
        System.out.println(DateUtil.defaultFormat(new Date()).substring(16,19).toString());
        System.out.println(DateUtil.defaultFormat(new Date()).toString());
        long longTime = new Date().getTime();

        System.out.println(date);


    }

    public static void te() {
        String a = "jjjdj,,,444";
        String[] split = a.split(",");
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s+"2");
        }
    }

    public static void lin() {
        String a = "jjj,jjj,jjj,ddd";
        String[] split = a.split(",");
        ArrayList<Object> ll = new ArrayList<>();
        for (String s : split) {
            ll.add(s);
        }
        List<Object> unique = ll.stream().distinct().collect(Collectors.toList());
        System.out.println(String.valueOf(unique).toString());
    }
}
