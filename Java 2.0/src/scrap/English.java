package scrap;

import java.util.ArrayList;

public class English {
	private int len2;
	private String sentence;
	private ArrayList<Integer> places = new ArrayList<Integer>();
	public English(String string) {
		 len2 = string.length();
		 sentence=string;
	}
	
	public static void print1(String words) {
		
		
		String[] output = words.split(" ");
		
		
		int len = output.length;
		
		
		for(int i=len - 1;i>=0;i=i-1) {
			System.out.println(output[i]);
		}
	}
	
	public void findWordAndReplace(String word,String word2) {
		int len=word.length();
		places.clear();
		
		
		findWord(word);
		String result = "";
		int ignore = 0;
		boolean first =true;
		boolean pass=false;
		int len3 = places.size();
		
		for (int j = 0; j < len2; j++) {
			
			if (!(ignore==0)||first) {
				for(int i=0; i<len3;i++) {
					if(places.get(i)==j) {
						ignore = len;
						//System.out.println(ignore);
						result += word2;
						pass=true;
						
					}
				}
				if(!pass) {
					result += sentence.charAt(j);
					ignore -= 1;
					
					//System.out.println(ignore);
				}

			} else {
				
				//result += sentence.charAt(j);
				ignore -= 1;
				//System.out.println(ignore);
			}
		first =false;
		}
		System.out.println(result);
	}
	
	
	
	public void findWord(String word) {
		int len=word.length();
		int c=0;
		int count =0;
		while(c<len2) {
		if(check(word,c)) {
			count+=1;
			places.add(c);
			c+=len;
			
		}
		else {
			c+=1;
		}
		}
		System.out.println("There are " + count + " " + word + " in "+ sentence);
	}
	public boolean check(String word,int place) {
		int len=word.length();
		
		
		for(int i=0;i<len;i++) {
			if(word.charAt(i)==sentence.charAt(i+place)) {
			continue;	
			}
			else {
				place+=1;
				return false;
			}
			
		}return true;
		
	}
}
