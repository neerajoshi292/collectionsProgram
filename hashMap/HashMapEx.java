package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx 
{
	public void addElement()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "Java");
		hm.put(2, "React");
		hm.put(3, "Phython");
		hm.put(4, "Php");
		
//		System.out.println("Element's in the map : "+hm);
	
		System.out.println("Element's in the map : ");

//		for(String i : hm.values())
//		{
//			System.out.println("values: "+i);
//		}
		
//		for(int i : hm.keySet())
//		{
//			String value= hm.get(i);
//			System.out.println("key :  "+i+"=  value :  "+value);
//		}
		
//		Iterator<Map.Entry<Integer, String>> itr= hm.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry<Integer, String> entry= itr.next();
//			
//			int key =  entry.getKey();
//			String value= entry.getValue();
//			
//			System.out.println(key+"   -    "+value);
//		}
		
		for(Map.Entry<Integer, String> entry: hm.entrySet())
		{	
			System.out.println(entry.getKey()+"  -   "+entry.getValue());
		}
		
		System.out.println("\nSize of Hash_Map : "+hm.size());
		
	}
	
	public void copyOneMapToAnother()
	{
		HashMap<String, Integer> hm= new HashMap<>();
		
		hm.put("three", 3);
		hm.put("one", 1);
		hm.put("seven", 7);
		hm.put("five", 5);
		
		HashMap<String, Integer> hm1= new HashMap<>();

		hm1.put("two", 2);
		hm1.put("six", 6);
		hm1.put("four", 4);
		hm1.put("eight", 8);
		
		hm1.putAll(hm);
		
		System.out.println("Copy all the element fro one to another list: \n"+hm1);
		
		hm1.clear();
		
		System.out.println("After remove all the elelemt: "+hm1);
	}
	
	public void removeAllElement()
	{
		HashMap<String, Integer> hm= new HashMap<>();
		
		hm.put("three", 3);
		hm.put("one", 1);
		hm.put("seven", 7);
		hm.put("five", 5);
		
		for(Map.Entry<String, Integer> i: hm.entrySet())
		{
			System.out.println(i.getKey()+"  -  "+i.getValue());
		}
	}
	
	public void checkMapEmptyOrNot()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");
		
		System.out.println("Original Map_List: "+hm);
	
		boolean empty = hm.isEmpty();
		
		System.out.println("is h_map empty:  "+empty);
		
		hm.clear();
		
		boolean empty1 = hm.isEmpty();
		
		System.out.println("is h_map empty:  "+empty1);
		System.out.println("removing after Map_List: "+hm);
	}
	
	public void shallowCopyOfMap()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");
		
		HashMap<Integer, String> hm1= (HashMap<Integer, String>) hm.clone();
		
		System.out.println("copy element of hash_map: ");
		for(Map.Entry<Integer, String> e : hm1.entrySet())
		{
			System.out.println(e.getKey()+"  -  "+e.getValue());
		}
	}
	
	public void searchElementUsingKey()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");
		
		System.out.println("Original_Map: "+hm);
		
		if(hm.containsKey(3))
		{
			System.out.println("element exits in map "+hm.get(3));
		}else {
			System.out.println("element does not exits in map ");
		}
	
		if(hm.containsKey(6))
		{
			System.out.println("element exits in map "+hm.get(1));
		}else {
			System.out.println("element does not exits in map ");
		}
	}
	
	public void searchElementUsingValue()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");
		
		System.out.println("Original_Map: "+hm);
		
		if(hm.containsValue("white"))
		{
			System.out.println("value exits in map ");
		}else {
			System.out.println("value does not exits in map ");
		}
	
		if(hm.containsValue("black"))
		{
			System.out.println("value exits in map ");
		}else {
			System.out.println("value does not exits in map ");
		}
	}

	public void setView()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");
		
		Set st=  hm.entrySet();
		System.out.println("Set_ Values: "+st);
	}
	
	public void getValueFromKey()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");

		String val= hm.get(2);
		
		System.out.println("value of key is : "+val);
	}
	
	public void showKeyContained()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");

		Set k= hm.keySet();
		
		System.out.println("Key set values are : "+k);
	}
	
	public void showValueContained()
	{
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "red");
		hm.put(2, "white");
		hm.put(3, "brown");
		hm.put(4, "yellow");

		System.out.println("collection of the values are: "+hm.values());
	}
	
	
	public void display()
	{
//		addElement();
//		copyOneMapToAnother();
//		removeAllElement();
//		checkMapEmptyOrNot();
//		shallowCopyOfMap();
//		searchElementUsingKey();
//		searchElementUsingValue();
//		setView();
//		getValueFromKey();
//		showKeyContained();
		showValueContained();
		
	}
	
	public static void main(String[] args) {
		
		HashMapEx hmx= new HashMapEx();
		
		hmx.display();
	}
}
