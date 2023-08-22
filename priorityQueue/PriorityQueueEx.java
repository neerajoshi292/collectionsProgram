package com.priorityQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx 
{
	public void addElement()
	{
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Dark");
		pq.add("Brown");
		pq.add("White");
		pq.add("Cyan");
		
		
//		System.out.println("Element of P_Queue: "+pq);
		
		System.out.println("Element of P_Queue: ");
		
//		pq.forEach(e->System.out.print(e+", "));
		
		Iterator<String> itr= pq.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
	
	public void addQueueOneFromAnother()
	{
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Dark");
		pq.add("Brown");
		pq.add("White");
		pq.add("Cyan");
		
		PriorityQueue<String> pq1= new PriorityQueue<>();
		
		pq1.add("red");
		pq1.add("black");
		pq1.add("skyblue");
		pq1.add("magenta");
		
		pq.addAll(pq1);
		
		System.out.println("Add element fro one queue to another: "+pq);	
	}
	
	public void addElementInQueue()
	{
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Dark");
		pq.add("Brown");
		pq.add("White");
		pq.add("Cyan");
		
		System.out.println("Original_List: "+pq);			
		System.out.println("Original_List size: "+pq.size());			
			
		pq.offer("Colors");
		
		System.out.println("After adding P_List: "+pq);			
		
		pq.clear();
		
		System.out.println("Removing all the element from the queue: "+pq);
	}
	
	public void compareTwoQueue()
	{
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(4);
		
		PriorityQueue<Integer> pq1= new PriorityQueue<>();
		pq1.add(9);
		pq1.add(3);
		pq1.add(8);
		pq1.add(1);
		
		for(int i : pq)
		{
			System.out.println(pq1.contains(i)? "true" : "false");
		}
	}
	
	public void retriveFirstElement()
	{
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(4);
		
		System.out.println("Original Element: "+pq);
		
		Integer firstElement= pq.peek();
//		Integer firstElement= pq.poll();
		
		System.out.println("Retrive First Element: "+firstElement);	
		
		System.out.println("Retrive after Element: "+pq);
	}
	
	public void priorityQueueToArray()
	{
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(4);
		
		System.out.println("Original List: "+pq);
		
		ArrayList<Integer> alist= new ArrayList<>(pq);
		
		System.out.println("After convert P_Queue to Array List element: "+alist);	
	}
	
	public void queueConvertString()
	{
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Dark");
		pq.add("Brown");
		pq.add("White");
		pq.add("Cyan");
		
		System.out.println("Original List: "+pq);
		
		String element= pq.toString();
		
		System.out.println("String representation of p_queue: "+element);
	}
	
	public void maximumPriorityQueue()
	{
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Dark");
		pq.add("Brown");
		pq.add("White");
		pq.add("Cyan");
		
		System.out.println("Original List: "+pq);
		
		String mx= null;
		
		while((mx = pq.poll())!= null)
		{
			System.out.print(mx+" ");
		}
		System.out.println("\n");
	}
	
	public void display()
	{
//		addElement();
//		addQueueOneFromAnother();
//		addElementInQueue();
//		compareTwoQueue();
//		retriveFirstElement();
//		priorityQueueToArray();
//		queueConvertString();
		maximumPriorityQueue();
		
	}
	public static void main(String[] args) {
		
		PriorityQueueEx pqx= new PriorityQueueEx();
		pqx.display();
		
	}
}
