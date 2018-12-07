package com.hashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;


class MyInt{
	
	private Integer i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		//System.out.println("inside hashCode() of MyInt");
		return i.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return false; // to allow duplicates
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInt other = (MyInt) obj;
		if (i != other.i)
			return false;
		return true;*/
	}

	public MyInt(int i) {
		super();
		this.i = i;
	}

	@Override
	public String toString() {
		return i.toString();
	}
	
	
	
}

public class DemoHashMap {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		//ht.put(null, "null");
		//ht.put("null", null);
		
		//System.out.println("hashtable: " + ht);
		
		HashMap<MyInt,String> hm = new HashMap<MyInt,String>();
		
		hm.put(new MyInt(1), "one");
		hm.put(new MyInt(2), "two");
		hm.put(new MyInt(3), "three");
		hm.put(new MyInt(1), "four");
		
		System.out.println(hm);
		
		int x = 0;
		x= x+1;
		x++;
		
		System.out.println(x +" x");
		
		for(Entry<MyInt, String> entry: hm.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	
		
	}
		

}
