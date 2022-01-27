package com.example;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonsCollection4Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(MapUtils.getString(map,"hello","hello"));
        System.out.println(MapUtils.isEmpty(map));

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("3");
        //并集（去重）
        System.out.println(CollectionUtils.union(list1,list2));
    }
}
