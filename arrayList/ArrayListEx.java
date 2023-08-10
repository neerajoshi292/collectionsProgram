package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx 
{
	public void addElement()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
//		System.out.println("After Adding Element: "+alist);
		
		Iterator<Integer> itr= alist.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}	
	}
	
	public void insertELementFirstAndLastPosition()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);

		System.out.println("Original List: "+alist);
		
		alist.add(0, 90);
		alist.add(alist.size(), 101);
		
		System.out.println("\nAfter add first & last postion element using index : ");
		alist.forEach(e-> System.out.print(e+" "));
		
		int getValueByIndex= alist.get(2);
		System.out.println("\n\nRetrive the element by Index position : "+getValueByIndex);
		
		alist.set(alist.size()-1, 22);
		System.out.println("\nUpdate the element using index position: ");
		System.out.println(alist);
		
		alist.remove(4);
		System.out.println("\nRemove the 4th element from the List: ");
		System.out.println(alist);
		
	}
	
	public void searchElementFromList()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);

		String status = alist.contains(24) ? "element found" : "element not found";
		System.out.println(status);
	}
	
	public void sortArrayList()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);

		Collections.sort(alist);
		System.out.println("Sorted Array: "+alist);
	}
	
	public void copyArrayList()
	{
		ArrayList<Integer> originalList= new ArrayList<>();
		
		originalList.add(26); originalList.add(22); originalList.add(24); originalList.add(12); originalList.add(21);
		
		ArrayList<Integer> copyList= new ArrayList<>();
		
		copyList.add(78); copyList.add(62); copyList.add(96); copyList.add(52); copyList.add(32);
		
		Collections.copy(originalList, copyList);
		System.out.println("After copy element from one list to another:  "+originalList);
	}
	
	public void shuffleList()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
		Collections.shuffle(alist);
		System.out.println("Shuffle ArrayList element: "+alist);
	}
	
	public void reverseList()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
		Collections.reverse(alist);
		System.out.println("Reverse ArrayList element: "+alist);
	}

	public void extractPortionList()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
		List<Integer> subList = alist.subList(1, alist.size()-1);
		System.out.println("List of extract portion : "+subList);
	}

	public void swapElement()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
		Collections.swap(alist, 1, 3);
		System.out.println("After swapping list: "+alist);
	}
	
	public void joinTwoArray()
	{
		ArrayList<Integer> alist= new ArrayList<>();
		alist.add(26); alist.add(22); alist.add(24); alist.add(12); alist.add(21);
		
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white"); 
		
		ArrayList<Object> joinList= new ArrayList<>();
		
		joinList.add(alist);  	joinList.add(alist1);	
		
		System.out.println(joinList);
	}
	
	public void cloneList()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white"); 
		
		ArrayList<String> alist= (ArrayList<String>) alist1.clone();
		System.out.println(alist);
	}
	
	public void emptyListOrNot()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white"); 
		
		System.out.println("Original List: "+alist1);
		
		System.out.println("status of List empty or not: "+alist1.isEmpty());
		
		alist1.clear();
		System.out.println("After removing all the element: "+alist1);
		System.out.println("status of List empty or not: "+alist1.isEmpty());
	}
	
	public void capacityOfList()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white"); 
		
		System.out.println("Original List: "+alist1);
		
		alist1.trimToSize();
		
		System.out.println("Trim size List: "+alist1);
	}
	
	public void increaseListSize()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white");

		System.out.println("Original List: "+alist1);
		
		alist1.ensureCapacity(7);
		
		alist1.add("yellow");
		alist1.add("cyan");
		
		System.out.println("New List: "+alist1);
	}
	
	public void replaceSecondElement()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white");
		
		alist1.set(2, "element");
		System.out.println("Replace Second element: "+alist1);
	}
	
	public void printElemnentWithIndexPosition()
	{
		ArrayList<String> alist1= new ArrayList<>();
		alist1.add("red"); alist1.add("green"); alist1.add("black"); alist1.add("brown"); alist1.add("white");
		
		System.out.println("Element of the list with index position: ");
		for(int i=0;i<alist1.size();i++)
		{
			System.out.println(i+"  -   "+alist1.get(i));
		}	
	}
	
	
	public void display()
	{
//		addElement();
//		insertELementFirstAndLastPosition();
//		searchElementFromList();
//		sortArrayList();
//		copyArrayList();
//		shuffleList();
//		reverseList();
//		extractPortionList();
//		swapElement();
//		joinTwoArray();
//		cloneList();
//		emptyListOrNot();
//		capacityOfList();
//		increaseListSize();
//		replaceSecondElement();
		printElemnentWithIndexPosition();
		
	}
	
	public static void main(String[] args) {
	
		ArrayListEx alistx= new ArrayListEx();
		alistx.display();
	}
}
