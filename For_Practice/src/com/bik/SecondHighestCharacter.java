package com.bik;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class SecondHighestCharacter {
	
	public static void main(String[] args) {
		String string = "asdgjdssssseee";
		List<Character> occurences = new ArrayList<>();
		int maxOccur = 0;
		Map<Character, Integer> map = new ConcurrentHashMap<>();
        char[]  charArray = string.toCharArray();
        for(char c : charArray){
            if(map.containsKey(c)){
                map.put(c, (map.get(c)+1));
            }else{
                map.put(c,1);
            }
            if(map.get(c)>maxOccur){
            	maxOccur = map.get(c);
            }
            
        }
        char d = 0;
        for(Entry<Character, Integer> entry : map.entrySet()){
         if(entry.getValue() == maxOccur){
        	 
        	 occurences.add(entry.getKey());
        	 map.remove(entry);
         }  
         
        }
        
        
        for(Character c: occurences){
        	System.out.println(c);
        }
        
     
	
	}

}
