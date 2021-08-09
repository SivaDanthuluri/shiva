package day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.SortOrder;

public class UniqueVowel {

	public static void main(String[] args) {

		String s = "hey hello everyone its getting complicated for this week that's why we should wrap up the tasks given on same day but we rarely stick to it and learn and upskill";
		System.out.println(uniqueVowel(s));
	}
	public static String uniqueVowel(String s) {

		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String[] s1 = s.split(" ");
		int count = 0;
		
		for (int i = 0; i < s1.length; i++) {
			count = 0;
			String s2[]=s1[i].split("");
			Arrays.sort(s2);
			String s3[]=new String[s2.length];
			int z=0;
			for(int k=0;k<s2.length-2;k++)
			{	
				if(s2[k]!=s2[k+1])
				{
					s3[z]=s2[k];
				}
				z++;			
			}
			s3[z++] = s2[s2.length-1];
			
			for (int j = 0; j < z-1; j++) {
	
			 if (s3[j]=="a" || s3[j]=="e" ||  s3[j]=="i" || s3[j]=="o" ||  s3[j]=="u") {
					count++;
				}		 
			}
			if(count>=2) {
			if (map.containsKey(count)) {
				String temp = map.get(count);
				
				temp = temp + " " + s1[i];
				
				map.put(count, temp);
			} else {
				map.put(count, s1[i]);
			}
			}
			else {
				if (map.containsKey(count)) {
					String temp = map.get(count);
					temp = temp + " " + s1[i];
					map.put(count, temp);
				} else {
					map.put(count, s1[i]);
			}
		}
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
