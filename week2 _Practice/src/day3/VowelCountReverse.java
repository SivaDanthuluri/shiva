package day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class VowelCountReverse {

	public static void main(String[] args) {

		String s = "hey hello everyone its getting complicated for this week that's why we should wrap up the tasks given on same day but we rarely stick to it and learn and upskill";
		System.out.println(vowelCountReverse(s));

	}

	public static String vowelCountReverse(String s) {

		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String[] s1 = s.split(" ");
		int count = 0;
		
		for (int i = 0; i < s1.length; i++) {
			count = 0;
			for (int j = 0; j < s1[i].length(); j++) {
				if (s1[i].charAt(j)=='a' || s1[i].charAt(j)=='e' || s1[i].charAt(j)=='i' || s1[i].charAt(j)=='o' || s1[i].charAt(j)=='u') {
					count++;
				}
			}
			if (map.containsKey(count)) {
				String temp = map.get(count);
				temp = temp + " " + s1[i];
				map.put(count, temp);
			} else {
				map.put(count, s1[i]);
			}
			
		}
		StringBuilder st1 = new StringBuilder(map.get(4));
		st1.reverse();
		String value1= st1.toString();
		
		StringBuilder st2 = new StringBuilder(map.get(4));
		st2.reverse();
		String value2= st2.toString();
		System.out.println(map.keySet());
		if(map.keySet().contains(4))
		{
			map.replace(4, value1);
		}
		if(map.keySet().contains(2))
		{
			map.replace(2, value2);	
		}
		System.out.println(map);
		
		StringBuilder sb = new StringBuilder();
		for(String e:map.values())
		{
			sb.append(e).append(" ");
		}
		return sb.toString();
	

	}
}

