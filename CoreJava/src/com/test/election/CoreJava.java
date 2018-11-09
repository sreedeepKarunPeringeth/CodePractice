package com.test.election;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;

public class CoreJava {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		String str2 = new String("String1");
		String str1 = "String1";
		
		//String str2 = "String";
		
		
		/*if(str1.equals(str2)){
			System.out.println("Equals");
		}
		if(str1 == str2){
			System.out.println(" == ");
		}
		
		System.out.println("str1 addr: " + str1.hashCode() + "\nstr2 addr: " + str2.hashCode() );*/

//		Vector vt = new Vector<>();
//		
//		
//		vt.listIterator();
//		
//		vt.elements();
//		
//		Stack st = new Stack<>();
//		st.listIterator();
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		
//		st.elements();
//		
//		System.out.println(st);
//		System.out.println(st.search(6));
		/*LinkedList list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.remove("3");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add(null);
		list.add(1);
		
		System.out.println("2nd index = "+list.get(2));
		list.add(2, "new one");
		
		TreeSet ts = new TreeSet<>();
		
		ts.add("a");
		ts.add(1);
		
		List Alist = new  ArrayList(ts);
		
		
		Iterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("size = " + list.size());*/
		
//		Set set= new HashSet<>();
//		List list = new LinkedList<>();
//		
//		set.add(null);
//		set.add("a");
//		set.add(null);
//		
//		System.out.println("set = " + set);
//		
//		list.listIterator();
//		set.iterator();
//		
//		
//		Set hm = new LinkedHashSet<>();
//		hm.add("b");
//		hm.add("a");
//		hm.add(null);
//		System.out.println(hm.add("a"));
//		System.out.println(hm);
		
		
	//	TreeSet t1 = new TreeSet();
		//t1.add(new StringBuffer("A"));
		//t1.add(new StringBuffer("a"));
		
//		System.out.println("A".compareTo("A"));
//		
//		System.out.println(t1);
//		
//		System.out.println("return = "+ check());
		
		
//		HashMap hm =  new HashMap<>();
//		hm.put("A",1);
//		hm.put("C",1);
//		hm.put("B",1);
//		System.out.println(hm);
//		System.out.println(hm.put("A",5));
//		System.out.println(hm);
//		System.out.println("===================");
//		
//
//		LinkedHashMap lhm =  new LinkedHashMap<>();
//		lhm.put("A",1);
//		lhm.put("C",1);
//		lhm.put("B",1);
//		System.out.println(lhm);
//		System.out.println(lhm.put("A",5));
//		System.out.println(lhm);
//		System.out.println("===================");
//
//		
//		Hashtable ht = new Hashtable();
//		ht.put("A",1);
//		ht.put("C",1);
//		ht.put("B",1);
//		System.out.println(ht);
//		System.out.println(ht.put("A",5));
//		System.out.println(ht);
		
		
//		Integer i1 = new Integer(5);
//		Integer i2 = new Integer(5);
//		
//		HashMap hm = new HashMap<>();
//		hm.put(new Integer(5), "sreedeep");
//		hm.put(new Integer(5), "karun");
//		
//		IdentityHashMap ihm = new IdentityHashMap();
//		ihm.put(new Integer(5), "sreedeep");
//		ihm.put(new Integer(5), "karun");
//		
//		System.out.println("hm = " + hm);
//		System.out.println("ihm = " + ihm);
		
//		temp t1 = new temp();
//		
//		HashMap hm = new HashMap();
//		hm.put(null, t1);
//		t1 = null;
//		System.gc();
//		Thread.sleep(5000);
//		System.out.println(hm);
		
//		temp t2 = new temp(3);
//		WeakHashMap whm = new WeakHashMap();
//		whm.put(t2,"sree");
//		//t2 = null;
//		System.gc();
//		//Thread.sleep(10000);
//		whm.put(1, 80);
//		System.out.println(whm);
//		System.out.println(t2);
//		System.out.println(t2.hashCode());
//		
//		TreeMap tm = new TreeMap();
//		tm.put(5, 5);
//		tm.put(1, null);
//		//tm.put("s", 6);
//		
//		System.out.println(tm);
		
//		TreeSet ts = new TreeSet<>();
//		
//		ts.add("a");
//		ts.add("1");
//		
//		System.out.println(ts.comparator());
		
		/*HashSet hs = new HashSet();
		hs.add(new Integer(5));
		hs.add(new Integer(2));
		hs.add(new Integer(6));
		hs.add(new Integer(15));
		hs.add(new Integer(23));
		hs.add(new Integer(16));
		hs.add(new Integer(31));
		hs.add(null);
		System.out.println(hs);
		
		HashMap hm = new HashMap();
		hm.put(new Integer(5), 'A');
		hm.put(new Integer(2), 'B');
		hm.put(new Integer(6), 'C');
		hm.put(new Integer(15), 'D');
		hm.put(new Integer(23), 'E');
		hm.put(new Integer(16), 'F');
		hm.put(new Integer(31), 'G');
		hm.put(null, 'I');
		System.out.println(hm);
		
		Hashtable ht = new Hashtable();
		ht.put(new Integer(5), 'A');
		ht.put(new Integer(2), 'B');
		ht.put(new Integer(6), 'C');
		ht.put(new Integer(15), 'D');
		ht.put(new Integer(23), 'E');
		ht.put(new Integer(16), 'F');
		ht.put(new Integer(31), 'G');
		//ht.put(null, 'I');
		System.out.println(ht);
		
		
		TreeSet ts = new TreeSet<>();
		ts.add(5);
		ts.add(1);
		//ts.add(null);
		System.out.println(ts);
		
		TreeMap tm = new TreeMap<>();
		//tm.put(null, 1);
		tm.put(6, 6);
		tm.put(1, "sree");
		System.out.println(tm);*/
		
		/*
		 * Properties impl
		 * 
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("pro.properties");
		p.load(fis);
		System.out.println("properties after reading = "+ p);
		p.setProperty("pswd", "sree12345");
		FileOutputStream fos = new FileOutputStream("pro.properties");
		p.store(fos, "Updated by Sreedeep");
		System.out.println(p);*/
		
		
//		Queue q = new PriorityQueue();
//		System.out.println(q.peek());
//		//System.out.println(q.element());
//		System.out.println(q.poll());
//		//System.out.println(q.remove());
//		
//		for(int i=0 ; i <= 10; i++){
//			q.offer(i);
//		}
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);
		
		
//		Integer[] arr= new Integer[]{10,9,5,2,8,1};
//		List l = new ArrayList();
//		for(int i = 0;i< arr.length;i++)
//			l.add(arr[i]);
//		Collections.sort(l, new myComparator());
////		for(int i=0; i< arr.length;i++)
////			System.out.print(arr[i] + " ");
//		System.out.println(l);
//		l.toArray();
//		
//		Arrays.asList(arr);
		
		
		String[] str= {"A","B","C"};
		
		List l = Arrays.asList(str);
		
		for(String s: str)
			System.out.print(s + " ");
		System.out.println();
		System.out.println(l);
		
		l.set(0,1);
		for(String s: str)
			System.out.print(s + " ");
		System.out.println();
		System.out.println(l);
	}

	
	static int check(){
		
		return - -1;
	}
	
}

class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2)
			return -1;
		else if(o1 < o2)
			return 1;
		else
			return 0;
	}
	
}

class temp{
	
	int i;
	temp(int i){
		i = i;
	}
	
	@Override
	public String toString(){
		return "temp = " + i;
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize method()");
	}
}

