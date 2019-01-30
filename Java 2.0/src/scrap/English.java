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
		places.add(0);
		int len4 = word2.length();
		findWord(word);
		String result="";
		int ignore=0;
		int len3 = places.size();
		for(int j=0;j<len2;j++) {
			if(ignore<1) {
			for(int i=0;i<len3;i++) {
				if(places.get(i)==j) {
					for(int k=0;k<len4;k++) {
						result += word2.charAt(k);
						
						
					}
					ignore=len;
				}
			else {
					result += sentence.charAt(j);
					
				}
			}
			
			}else {
				ignore-=1;
			}
		
		
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
