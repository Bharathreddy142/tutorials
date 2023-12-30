// Below is a Java program to create
// a KeyValue tuple from Constructor

import java.util.*;
import org.javatuples.KeyValue;

class GfG {
	public static void main(String[] args)
	{
		KeyValue<Integer, String> kv
			= new KeyValue<Integer, String>(Integer.valueOf(1), "GeeksforGeeks");

		System.out.println(kv);
	}
}
