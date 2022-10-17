package com.collection.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class CollectionProgram {
	public static void main(String args[]) {
	
		doListDemo();
		System.out.println("**************************");
		doStackDemo();
		System.out.println("**************************");
		doQueueDemo();
		System.out.println("**************************");
		doMapDemo();
		System.out.println("**************************");
		doSetDemo();
	}
	private static void doListDemo() {
		List<String> list = new LinkedList<String>();
		list.add("Anupama");
		list.add("Aryan");
		list.add("Sharan");
		list.add("Adarsh");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
		
	private static void doStackDemo() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(56);
		stack.push(66);
		stack.push(34);
		stack.push(69);
		stack.pop();
		stack.pop();
		Iterator iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("peek element is " +stack.peek());
	}
	
	private static void doQueueDemo() {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Anu");
		queue.add("Arya");
		queue.add("Ansh");
		queue.add("Arnav");
		queue.poll();
		System.out.println(queue.contains("Arya"));
		Iterator iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	private static void doMapDemo() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Anshika");
		map.put(2, "Ayush");
		map.put(3, "Amith");
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}
	
	private static void doSetDemo() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(22);
		set.add(44);
		set.add(55);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	}
}
