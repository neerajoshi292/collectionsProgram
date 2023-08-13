package com.hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx 
{	
	public void addElement()
	{
		HashSet<Integer> hset= new HashSet<>();
		
		hset.add(6);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		hset.add(7);
		
//		System.out.println("Element's of HashSet are: "+hset);

		System.out.println("Element's of HashSet are: ");

//		hset.forEach(e->System.out.print(e+" "));
		
		Iterator<Integer> itr= hset.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nSize of Hash_set : "+hset.size());
	}
	
	public void removeElementFromSet()
	{
		HashSet<Integer> hset= new HashSet<>();
		
		hset.add(6);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		hset.add(7);
		
		System.out.println("Element's of HashSet are: "+hset);
		
		hset.removeAll(hset);
//		hset.clear();
		System.out.println("Element's of HashSet after remove are: "+hset);

	}
	
	public void emptySetOrNot()
	{
		HashSet<Integer> hset= new HashSet<>(); 
		
		hset.add(6);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		hset.add(7);
		
		System.out.println("Element's of HashSet are: "+hset);

		System.out.println("is Empty: "+hset.isEmpty());
		
//		hset.clear();
		hset.removeAll(hset);

		System.out.println("is EMPTY: "+hset.isEmpty());
		
		System.out.println("Element's of HashSet after remove are: "+hset);
	}
	
	public void cloneOfSet()
	{
		HashSet<Integer> hset= new HashSet<>();
		
		hset.add(6);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		hset.add(7);
		
		System.out.println("Original List: "+hset);
		
		@SuppressWarnings("unchecked")
		HashSet<Integer> hset1= (HashSet<Integer>) hset.clone();
		System.out.println("Clone of HashSet : "+hset1);
	}
	
	public HashSet<Integer> convertHashSetIntoArray()
	{
		HashSet<Integer> hset= new HashSet<>();
		
		hset.add(8);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		hset.add(7);		
		
		System.out.println("Original List: "+hset);
		
		ArrayList<Integer> alist= new ArrayList<>(hset);
		System.out.println("Covert to Array_List: "+alist);
		
		return hset;
	}
	
	public void convertHashSetIntoTreeSet()
	{
		HashSet<Integer> hset = convertHashSetIntoArray();
		
		TreeSet<Integer> tset= new TreeSet<>(hset);
		System.out.println("Convert into Tree_set: "+tset);
		
	}

	public void findNumberLessThan7()
	{
		HashSet<Integer> hset = convertHashSetIntoArray();
		
		Iterator<Integer> itr= hset.iterator();
		
		while(itr.hasNext())
		{
			Integer next = itr.next();
			if(next<=7)
			{
				System.out.println(next);
			}
		}
	}
	
	public void compareTwoSet()
	{
		HashSet<Character> hset= new HashSet<>();
		
		hset.add('C');
		hset.add('L');
		hset.add('A');
		hset.add('X');
		hset.add('J');
		
		System.out.println("List_1 "+hset);
		
		HashSet<Character> hset1= new HashSet<>();
		
		hset1.add('L');
		hset1.add('A');
		hset1.add('J');
		hset1.add('D');
		hset1.add('X');
		
		System.out.println("List_2 "+hset1);
		
		for(char e : hset)
		{
			System.out.println((hset1.contains(e) ? "true" : "false"));
		
		}
	}
	
	public void retainSameElement()
	{
	HashSet<Character> hset= new HashSet<>();
		
		hset.add('C');
		hset.add('L');
		hset.add('A');
		hset.add('X');
		hset.add('J');
		
		System.out.println("List_1 "+hset);
		
		HashSet<Character> hset1= new HashSet<>();
		
		hset1.add('L');
		hset1.add('Z');
		hset1.add('J');
		hset1.add('D');
		hset1.add('X');
		
		System.out.println("List_2 "+hset1);
		
		hset.retainAll(hset1);
		
		System.out.println("Retain all element those are Same from both the list: "+hset);
	}
	
	public void removeAllElementFromSet()
	{
		HashSet<String> hset= new HashSet<>();
		
		hset.add("red");
		hset.add("White");
		hset.add("yellow");
		hset.add("cyan");
		
		hset.clear();
		
		System.out.println("removed all element from the list: "+hset);
	}
	
	public void display()
	{
//		addElement();
//		removeElementFromSet();
//		emptySetOrNot();
//		cloneOfSet();
//		convertHashSetIntoArray();
//		convertHashSetIntoTreeSet();
//		findNumberLessThan7();
//		compareTwoSet();
//		retainSameElement();
		removeAllElementFromSet();
	}
	
	public static void main(String[] args) {
		
		HashSetEx hex= new HashSetEx();
		hex.display();
	}
}
