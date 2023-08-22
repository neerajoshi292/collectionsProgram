package com.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx 
{
	public void addElement()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		System.out.println("Elements in the Map are: ");
		
//		System.out.println(tm);
//		System.out.println(tm.entrySet());

		for(Map.Entry<Integer, String> e : tm.entrySet())
		{
			System.out.println(e.getKey()+"  =>  "+e.getValue());
		}
	}
	
	public void copyMapToAnotherMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		TreeMap<Integer, String> tm1= new TreeMap<>();
		
		tm1.put(5, "News");
		tm1.put(3, "Paper");
		tm1.put(7, "Media");
		tm1.put(4, "Alok");
		
		tm.putAll(tm1);
		
		System.out.println("copy element form one map to another map: "+tm);	
	}
	
	public void searchKeyInMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		if(tm.containsKey(3))
		{
			System.out.println("the key is found in map");
		}else {
			System.out.println("key is not found in the map");
		}

		System.out.println("=========================================================");
		
		if(tm.containsKey(1))
		{
			System.out.println("the key is found in map");
		}else {
			System.out.println("key is not found in the map");
		}
	}
	
	public void searchValueInMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		if(tm.containsValue("News"))
		{
			System.out.println("the key is found in map");
		}else {
			System.out.println("key is not found in the map");
		}

		System.out.println("=========================================================");
		
		if(tm.containsValue("house"))
		{
			System.out.println("the key is found in map");
		}else {
			System.out.println("key is not found in the map");
		}
	}
	
	public void getAllKeysFromMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		Set keys= tm.keySet();
		
		System.out.println("Available keys from map are: ");
		for(Object x : keys)
		{
			System.out.println(x);
		}
	}
	
	public void deleteElementsFromMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		System.out.println("Original Map elements : "+tm);

		tm.clear();
		
		System.out.println("After removing Map elements : "+tm);
	}
	
	public void compareTwoMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		TreeMap<Integer, String> tm1= new TreeMap<>();
		
		tm1.put(5, "News");
		tm1.put(3, "Paper");
		tm1.put(7, "Media");
		tm1.put(4, "Alok");
	
		boolean areEqual = compareMap(tm, tm1);
		
		if(areEqual)
		{
			System.out.println("all elements are equal");
		}
		else
		{
			System.out.println("all elements are not equal");	
		}
		
	}
	
	public boolean compareMap(TreeMap<Integer, String> tm, TreeMap<Integer, String> tm1)
	{
		if(tm.size() != tm1.size())
		{
			return false;
		}
		else {
			Iterator<Map.Entry<Integer, String>> itr= tm.entrySet().iterator();
			Iterator<Map.Entry<Integer, String>> itr1= tm1.entrySet().iterator();
		
			while(itr.hasNext() && itr1.hasNext())
			{
				Map.Entry<Integer, String> e1 = itr.next(); 
				Map.Entry<Integer, String> e2 = itr1.next();
				
				if(!e1.getKey().equals(e2.getKey()) || !e1.getValue().equals(e2.getValue()))
				{
					return false;
				}
			}
		return true;
		}
	}
	
	public void greatestAndLeastKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		System.out.println("Original map_List: "+tm);
		System.out.println("First Key: "+tm.firstKey());
		System.out.println("Last Key: "+tm.lastKey());
		
		System.out.println("First Key1: "+tm.firstEntry());
		System.out.println("Last Key1: "+tm.lastEntry());	
	}
	
	public void printReverseOrderOfMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		System.out.println("Original Map elements: "+tm);
		
		System.out.println("Map elements_key Only: "+tm.descendingKeySet());
		
		System.out.println("containing key nd value : "+tm.descendingMap());
	}
	
	public void greatestLessOrEqual()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
	
		System.out.println("Original map : "+tm);
		
		System.out.println("Checking the entry for 3: ");
		System.out.println("Value is: " + tm.floorEntry(3));
		System.out.println("Checking the entry for 4: ");
		System.out.println("Value is: " + tm.floorEntry(4));
		System.out.println("Checking the entry for 6: ");
		System.out.println("Value is: " + tm.floorEntry(6));
		
		System.out.println("========================KeyValue============================");
		
		System.out.println("Checking the entry for 3: ");
		System.out.println("Value is: " + tm.floorKey(3));
		System.out.println("Checking the entry for 4: ");
		System.out.println("Value is: " + tm.floorKey(4));
		System.out.println("Checking the entry for 6: ");
		System.out.println("Value is: " + tm.floorKey(6));
		
	}
	
	public void lessThanGivenKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original TreeMap content : "+tm);
		
		System.out.println("Checking entry for 3_(keys) : "+tm.headMap(3));
		System.out.println("Checking entry for 7_(keys) : "+tm.headMap(7));
		System.out.println("Checking entry for 10_(keys) : "+tm.headMap(10));	
	}
	
	public void lessEqualInclusive()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original TreeMap content : "+tm);
		
		System.out.println("Checking entry for 5: "+tm.headMap(5, true));
		System.out.println("Checking entry for 5: "+tm.headMap(4, true));
		System.out.println("Checking entry for 5: "+tm.headMap(9, true));
	}
	
	public void stricklyGreaterThanKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original map : "+tm);
		
		System.out.println("checking the entry for 5 "+tm.higherEntry(5));
		System.out.println("checking the entry for 3 "+tm.higherEntry(3));
		System.out.println("checking the entry for 9 "+tm.higherEntry(9));
	}
	
	public void stricklyLessThanKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original map : "+tm);
		
		System.out.println("checking the entry for 5 "+tm.lowerEntry(5));
		System.out.println("checking the entry for 3 "+tm.lowerEntry(3));
		System.out.println("checking the entry for 9 "+tm.lowerEntry(9));
	}
	
	public void navigableSet()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");

		System.out.println("Original map : "+tm);
		
		System.out.println("Original map(show_key) : "+tm.navigableKeySet());	
	}
	
	public void leastKeyInMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");

		System.out.println("Value before poll: " + tm);
	    System.out.println("Value returned: " + tm.pollFirstEntry());
		System.out.println("Value after poll: " + tm);

	}
	
	public void removeAndGetAKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");

		System.out.println("Value before poll: " + tm);
	    System.out.println("Value returned: " + tm.pollLastEntry());
		System.out.println("Value after poll: " + tm);
	}

	public void getAPortionOfMap()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		SortedMap<Integer, String> sm= new TreeMap<Integer, String>();
		
		System.out.println("Original map: "+tm);
		
		sm= tm.subMap(4, 7);
		System.out.println("sub-Map key value : "+sm);
	}
	
	public void getAPortionOfMap1()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		SortedMap<Integer, String> sm= new TreeMap<Integer, String>();
		
		System.out.println("Original map: "+tm);
		
		sm= tm.subMap(4, true, 7, true);
		System.out.println("sub-Map key value : "+sm);
	}
	
	public void greaterOrEqualThan()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original map: "+tm);
		
		System.out.println("key are greater than or equal to : "+tm.tailMap(5));	
	}
	
	public void greaterThanAKey()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
	
		System.out.println("Original map: "+tm);
		
		System.out.println("key are greater than or equal to : "+tm.tailMap(5, false));	
	}
	
	public void leastKeyGreaterThanOrEqual()
	{
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(5, "News");
		tm.put(3, "Paper");
		tm.put(7, "Media");
		tm.put(4, "Alok");
		tm.put(9, "vinod");
		
		System.out.println("Original map: "+tm);
		
		System.out.println("==========================ceilingEntry=========================");
		
		System.out.println("keys greater than equal to 4: "+tm.ceilingEntry(4));
		System.out.println("keys greater than equal to 7: "+tm.ceilingEntry(7));
		System.out.println("keys greater than equal to 9: "+tm.ceilingEntry(9));	
		
		System.out.println("==========================ceilingKey=========================");
		
		System.out.println("keys greater than equal to 4: "+tm.ceilingKey(4));
		System.out.println("keys greater than equal to 7: "+tm.ceilingKey(7));
		System.out.println("keys greater than equal to 9: "+tm.ceilingKey(9));	
		
	}
	
	
	public void display()
	{
//		addElement();
//		copyMapToAnotherMap();
//		searchKeyInMap();
//		searchValueInMap();
//		getAllKeysFromMap();
//		deleteElementsFromMap();
//		compareTwoMap();
//		greatestAndLeastKey();
//		printReverseOrderOfMap();
//		greatestLessOrEqual();
//		lessThanGivenKey();
//		lessEqualInclusive();
//		stricklyGreaterThanKey();
//		stricklyLessThanKey();
//		navigableSet();
//		leastKeyInMap();
//		removeAndGetAKey();
//		getAPortionOfMap();
//		greaterOrEqualThan();
//		greaterThanAKey();
		leastKeyGreaterThanOrEqual();
		
	}
	
	public static void main(String[] args) {
		
		TreeMapEx tmx = new TreeMapEx();
		tmx.display();
	}
}
