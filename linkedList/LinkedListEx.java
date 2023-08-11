package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public void addElement()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(21);
		llist.add(23);
		llist.add(32);
		
//		System.out.println("Linked_List element: "+llist);
		
		System.out.println("Linked_List element: ");
		
//		llist.forEach(e-> System.out.print(e+" "));
		
		Iterator<Integer> itr= llist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void startSpecifiedPosition()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(23);
		llist.add(21);
		llist.add(32);
		
		Iterator<Integer> itr = llist.listIterator(1);
		
		System.out.println("Linked_List element using Specified Index position: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void reverseOrderIterator()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(23);
		llist.add(21);
		llist.add(32);
		
		Iterator<Integer> itr= llist.descendingIterator();
		System.out.println("Linked_List element in reverseOrder : ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void insertElementSpecifiedPosition()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(23);
		llist.add(21);
		llist.add(32);
		
		System.out.println("Original List: "+llist);
		
		llist.add(0, 98);
		llist.add(llist.size(), 56);
		llist.add(llist.size()-1, 76);
		
		llist.addFirst(42);
		llist.addLast(47);
		
		llist.offerFirst(82);
		llist.offerLast(88);
		llist.offer(85);
		
		System.out.println("Linked_List element insertElement at specified position : ");
		llist.forEach(e->System.out.println(e));
	}
	
	public void insertElementSpecifiedPositionLinkedList()
	{
		LinkedList<String> slist= new LinkedList<>();
		
		slist.add("red");
		slist.add("white");
		slist.add("black");
		slist.add("cyan");
		
		System.out.println("Original List: "+slist);
		
		LinkedList<String> slist1= new LinkedList<>();

		slist1.add("magenta");
		slist1.add("green");
		
		slist.addAll(2, slist1);
		
		System.out.println("adding after position: "+slist);
	}
	
	public void getFirstLastOccurrenceOfElement()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(23);
		llist.add(21);
		llist.add(32);

		System.out.println("Original_List: "+llist);

		Integer first = llist.getFirst();
		System.out.println("Get First Element: "+first);
		
		Integer last = llist.getLast();
		System.out.println("Get Last_Element: "+last);	
	}
	
	public void displayElementWithPosition()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(23);
		llist.add(21);
		llist.add(32);

		
		for(int i=0;i<llist.size();i++)
		{
			System.out.println("index : "+i+"    Element : "+llist.get(i));
		}
	}
	
	public void removeSpecifiedElement()
	{
		LinkedList<Character> clist= new LinkedList<>();
		
		clist.add('A');
		clist.add('X');
		clist.add('Q');
		clist.add('S');
		
		System.out.println("Original List: "+clist);
		
		clist.remove(1);
		System.out.println("After removing Element: "+clist);
	}

	public void removeFirstLastElement()
	{
		LinkedList<Character> clist= new LinkedList<>();
		
		clist.add('A');
		clist.add('X');
		clist.add('Q');
		clist.add('S');
	
		System.out.println("Original List : "+clist);
		
		clist.removeFirst();
		clist.removeLast();
		
		System.out.println("After remove first and last element from the list: "+clist);
		
//		clist.removeAll(clist);
		clist.clear();
		
		System.out.println("After removing all the element from the list : "+clist);
	}
	
	public void swapTwoElement()
	{
		LinkedList<Character> clist= new LinkedList<>();
		
		clist.add('A');
		clist.add('X');
		clist.add('Q');
		clist.add('S');
	
		Collections.swap(clist, 1, clist.size()-1);
		
		System.out.println("After swaping two element: "+clist);

		Collections.shuffle(clist);
	
		System.out.println("After swaping two element: "+clist);
	}
	
	public void joinTwoList()
	{
		LinkedList<Integer> llist= new LinkedList<>();
		
		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);

		LinkedList<Integer> llist1= new LinkedList<>();
		
		llist1.add(24);
		llist1.add(21);
		llist1.add(29);
		llist1.add(27);

		LinkedList<Integer> llist2= new LinkedList<>();
		
		llist2.addAll(llist);
		llist2.addAll(llist1);
		
		System.out.println("Join two Linked List:  "+llist2);
	}
	
	public void copyListToAnotherList()
	{
		LinkedList<Integer> llist= new LinkedList<>();

		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);
		
		LinkedList<Integer> llist1= (LinkedList<Integer>) llist.clone();		
		System.out.println("Copy Array List: "+llist1);
	}
	
	public void removeAndReturnFirstElement()
	{
		LinkedList<Integer> llist= new LinkedList<>();

		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);
	
		System.out.println("Original List: "+llist);
		
		System.out.println("Remove element from list: "+llist.pop());
	
		System.out.println("linked list after pop operation: "+llist);
	}
	
	public void retriveButNotRemove()
	{
		LinkedList<Character> llist= new LinkedList<>();
		
		llist.add('W');
		llist.add('D');
		llist.add('U');
		llist.add('M');
		
		System.out.println("Original List: "+llist);
		
		Character peekFirst = llist.peekFirst();
		System.out.println("First Element of the List: "+peekFirst);
		
		System.out.println(llist);
		
		Character peekLast = llist.peekLast();
		System.out.println("Last Element of the List: "+peekLast);
		
		System.out.println(llist);
	}
	
	public void searchElement()
	{
		LinkedList<Character> llist= new LinkedList<>();
		
		llist.add('W');
		llist.add('D');
		llist.add('U');
		llist.add('M');
 
		int count=0;

		System.out.println("======================1======================");
		if(llist.contains('D'))
		{
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found!");
		}
		
		System.out.println("======================2======================");
		if(llist.contains('T'))
		{
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found!");
		}
		
	}
	
	public void convertLinkedListIntoArrayList()
	{
		LinkedList<Character> llist= new LinkedList<>();
		
		llist.add('W');
		llist.add('D');
		llist.add('U');
		llist.add('M');

		System.out.println("Linked_List: "+llist);	
		
		ArrayList<Character> alist= new ArrayList<>(llist);
		
		System.out.println("Array_List: "+alist);	
	}
	
	public void compareTwoList()
	{
		LinkedList<Integer> llist= new LinkedList<>();

		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);

		LinkedList<Integer> llist1= new LinkedList<>();

		llist1.add(12);
		llist1.add(19);
		llist1.add(5);
		llist1.add(17);
		
		LinkedList<String> llist2= new LinkedList<>();
		
		for(int n : llist)
		{
			llist2.add(llist1.contains(n) ? "true" : "false");
		}
		System.out.println(llist2);
	}
	
	public void emptyListOrNot()
	{
		LinkedList<Integer> llist= new LinkedList<>();

		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);

		System.out.println("Original List: "+llist);
		
		System.out.println("Empty List or not: "+llist.isEmpty());
		
		llist.clear();
		
		System.out.println("Empty List or not_status: "+llist.isEmpty());
		
		System.out.println("Remove after List: "+llist);
	}
	
	public void replaceElement()
	{
		LinkedList<Integer> llist= new LinkedList<>();

		llist.add(12);
		llist.add(19);
		llist.add(15);
		llist.add(17);

		System.out.println("Original List: "+llist);
		
		llist.set(2, 22);
		
		System.out.println("replace element : "+llist);

	}
	
	
	private void display() {
		
//		addElement();
//		startSpecifiedPosition();
//		reverseOrderIterator();
//		insertElementSpecifiedPosition();
//		insertElementSpecifiedPositionLinkedList();
//		getFirstLastOccurrenceOfElement();
//		displayElementWithPosition();
//		removeSpecifiedElement();
//		removeFirstLastElement();
//		swapTwoElement();
//		joinTwoList();
//		copyListToAnotherList();
//		removeAndReturnFirstElement();
//		retriveButNotRemove();
//		searchElement();
//		convertLinkedListIntoArrayList();
		compareTwoList();
//		emptyListOrNot();
//		replaceElement();
		
	}
	public static void main(String[] args) {
		
		LinkedListEx ll= new LinkedListEx();
		ll.display();
	}
}
