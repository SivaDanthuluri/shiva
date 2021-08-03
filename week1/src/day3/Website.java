package day3;
import java.util.*;
public class Website {

	public static void main(String[] args) {
		String s="https://en.wikipedia.org/wiki/Main_Page";
		if(s.substring(0,8).equals("https://"))
		{
			s=s.substring(8);
		}
		if(s.substring(0,7).equals("http://"))
		{
			s=s.substring(7);
		}
		 System.out.println(s.substring(0,s.indexOf('/')));
	}
	
}
