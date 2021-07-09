package java1;

import java.util.*;
import java.util.Map.Entry;;

public class MapExample {

	public static void main(String[] args) {
		Map samplemap=new HashMap();
		samplemap.put(1, 3);
		samplemap.put(2, 2);
		samplemap.put(3, 5);
		samplemap.put(4, 1);
		//Set<Entry> entries= samplemap.entrySet() ;
		//for(Entry entry:entries) {
		System.out.println(samplemap);
		}
	}


