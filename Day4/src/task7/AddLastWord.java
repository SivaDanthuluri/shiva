package task7;

import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;

public class AddLastWord {

    public static char lovePalindromes(String str) {

        StringBuilder a=new StringBuilder();
        int i= str.length();
        char c= str.charAt(i-1);
        a.append(c).append(str);

        if(a.toString().equals(a.reverse().toString())){

            return c;
        }

        else{

            return 'Z';
        }
    }

    public static void main(String args[])

    {

        String str = "baabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaabbaaby";

        System.out.println(lovePalindromes(str));
    }

}