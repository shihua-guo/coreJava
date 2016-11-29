package com.briup.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryCatch {
    public static void main(String[] args){
        TryCatch c = new TryCatch();
        c.method();
        int[]a = {1,2};
        int length = a.length;
        String str = "aaa";
        int length2 = str.length();
        List list = new ArrayList();
        list.size();
        int a2 = 1;
        a2--;
        System.out.println();
        System.out.println();
        System.out.println();
        combine();
    }
    public void method(){
        try{
            System.out.print("A");
            int i = 10 / 0;
            System.out.print("B");
        }catch(Exception e){
            System.out.print("C");
        }finally{
            System.out.print("D");
        }
    }
    public static void combine(){
    	List<String> name = new ArrayList<String>();
    	name.add("tom");
    	name.add("mike");
    	name.add("alice");
    	name.add("mike");
    	List<String> phone = new ArrayList<>();
    	phone.add("1370000001");
    	phone.add("1380000002");
    	phone.add("1380000003");
    	phone.add("1500000004");
    	Map<String,String> map = new HashMap<String,String>();
    	String key  = null;
    	for(int i=0;i<name.size();i++){
    		key = name.get(i);
    		if(map.containsKey(key)){//判断是否存在
    			map.put(key, map.get(key)+"|"+phone.get(i));//合并
    		}else{
    			map.put(key, phone.get(i));
    		}
    	}
    	for(Object key1:map.keySet()){
    		System.out.println(key1+"-------"+map.get(key1));
    	}
    }
}