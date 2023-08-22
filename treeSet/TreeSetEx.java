package com.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx 
{
	public void addElement()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(12);
		tset.add(91);
		tset.add(19);
		
//		System.out.println("Element's of Tree_set are : "+tset);
		
		System.out.println("Elements of set are: ");
		
//		tset.forEach(e->System.out.println(e));
		
		Iterator<Integer> itr= tset.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}	
		
		System.out.println("\nSize of set are: "+tset.size());
	}
	
	public void addOneSetToAnotherSet()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(12);
		tset.add(91);
		tset.add(19);
		
		TreeSet<Integer> tset1= new TreeSet<>();
		
		tset1.add(22);
		tset1.add(11);
		tset1.add(31);
		tset1.add(19);
		
		tset.addAll(tset1);
		
		System.out.println("add all emenents of tset1 into tset: "+tset);
	}
	
	public void printReverseOrderOfSet()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(12);
		tset.add(91);
		tset.add(31);
		tset.add(19);
		
		Iterator<Integer> itr= tset.descendingIterator();
		
		System.out.println("Elements are show in reverse_Order: ");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
	
	public void getFirstLastElement()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(12);
		tset.add(91);
		tset.add(31);
		tset.add(19);
		
		System.out.println("Actual_List: "+tset);
		
//		tset.clear();
		
//		Integer pollFirst = tset.pollFirst();
		Integer pollFirst = tset.first();
		System.out.println("First element from list: "+pollFirst);
		
		System.out.println("after implement pollFirst: "+tset);
		
//		Integer pollLast = tset.pollLast();
		Integer pollLast = tset.last();
		System.out.println("Last element from list: "+pollLast);	
		
		System.out.println("after implement First: "+tset);
	}
	
	public void cloneOfSet()
	{
		TreeSet<Character> tset= new TreeSet<>();
		
		tset.add('p');
		tset.add('d');
		tset.add('l');
		tset.add('a');
		tset.add('g');
		
		TreeSet<Character> tset1= (TreeSet<Character>) tset.clone();
		
		System.out.println("clone of tree_set: "+tset1);
	}
	
	public void compareTwoSet()
	{
		TreeSet<String> tset= new TreeSet<>();
		tset.add("white");
		tset.add("cyan");
		tset.add("magenta");
		tset.add("black");

		TreeSet<String> tset1= new TreeSet<>();
		tset1.add("white");
		tset1.add("skyblue");
		tset1.add("magenta");
		tset1.add("brown");

		for(String e: tset)
		{
			System.out.println(tset1.contains(e) ? "true" : "false");
		}	
	}
	
	public void printElementLessThan7()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(2);
		tset.add(91);
		tset.add(5);
		tset.add(7);
		
//		System.out.println("element are show less than equal to 7: ");
//		for(int i : tset)
//		{
//			if(i <= 7)
//			{
//				System.out.print(i+" ");
//			}
//		}
		
		TreeSet<Integer> element= new TreeSet<>();
		
		element = (TreeSet<Integer>) tset.headSet(7);
		
		Iterator<Integer> itr= element.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}	
	}
	
	public void greaterOrEqualThanElement()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(2);
		tset.add(91);
		tset.add(5);
		tset.add(7);
		
		System.out.println("Greater Than equal to: "+tset.ceiling(2));
		System.out.println("Greater Than equal to: "+tset.ceiling(22));
		System.out.println("Greater Than equal to: "+tset.ceiling(7));	
		
		System.out.println("Strickly greater than taken element: "+tset.higher(2));
		System.out.println("Strickly greater than taken element: "+tset.higher(22));

	}
	
	public void LessOrEqualThanElement()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(2);
		tset.add(91);
		tset.add(5);
		tset.add(7);
		
		System.out.println("Less Than equal to: "+tset.floor(2));
		System.out.println("Less Than equal to: "+tset.floor(22));
		System.out.println("Less Than equal to: "+tset.floor(7));	
		
		System.out.println("Strickly Less than taken element: "+tset.lower(5));
		System.out.println("Strickly less than taken element: "+tset.lower(22));

	}
	
	public void removeLastFirstElement()
	{
		TreeSet<Integer> tset= new TreeSet<>();
		
		tset.add(21);
		tset.add(2);
		tset.add(91);
		tset.add(5);
		tset.add(7);
	
		System.out.println("Original List: "+tset);
		
		System.out.println("Remove the first elelemnt: "+tset.pollFirst());
		
		System.out.println("Remove the last elelemnt: "+tset.pollLast());
		
		System.out.println("After Remove the First nd Last element: "+tset);
		
		tset.clear();
		
		System.out.println("remove all element from the list: "+tset);	
	}
	
	public void display()
	{
//		addElement();
//		addOneSetToAnotherSet();
//		printReverseOrderOfSet();
//		getFirstLastElement();
//		cloneOfSet();
//		compareTwoSet();
//		printElementLessThan7();
//		greaterOrEqualThanElement();
//		LessOrEqualThanElement();
		removeLastFirstElement();
		
	}
	public static void main(String[] args) {
		
		TreeSetEx tsx= new TreeSetEx();	
		tsx.display();
	}
}
