package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * String reverse using string buffer or string builder class
 * 
 * @author surendarg97
 *
 */
public class ReverseString {
	
	public static void main(String arg[]) {

		System.out.println("Gitstuff edited code");
		
		System.out.println("Gitdemo edited code");
		System.out.println("Gitdemo edited code");
		System.out.println("Gitdemo edited code");

		
		System.out.println("Gitdemo branch edited code");
		//using StringBuilder
		
		StringBuilder str=new StringBuilder("Agni");
		
		str.reverse();
		
		System.out.println("using string builder "+str);
		
		//using StringBuffer
		
		StringBuffer str1=new StringBuffer("Agni");
		
		str1.reverse();
		
		System.out.println("using string buffer "+str1);
		
		//using String
		
		String given="Agni";
		
		char[] characterArray=given.toCharArray();
		
		String reveresedString = "";
		
		for(int i=characterArray.length-1;i>=0;i--) {
			
			reveresedString=reveresedString+characterArray[i];
			
		}
		
		System.out.println("using string logic "+reveresedString);
		
		//using collections
		
		String one="Agni";
		
		char[] charary=one.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for (Character character : charary) {
			
			list.add(character);
			
		}
		
		System.out.println(list.toString());
		
		Collections.reverse(list);
		
		Iterator<Character> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.print(iterator.next());
		}
		
		
		
		
	}

}
