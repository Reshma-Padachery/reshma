package com.practise;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString  {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter String 1");
		 String s1=input.nextLine();
		 input.nextLine();
		 System.out.println("Enter the String 2:");
		 String s2= input.nextLine();
		 
		 String copyOfs1 = s1.replaceAll("\\s", "");
		 
	        String copyOfs2 = s2.replaceAll("\\s", "");
	 
	        //Initially setting status as true
	 
	        boolean status = true;
	 
	        if(copyOfs1.length() != copyOfs2.length())
	        {
	            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
	 
	            status = false;
	        }
	        else
	        {
	            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
	 
	            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
	 
	            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
	 
	            //Sorting both s1Array and s2Array
	 
	            Arrays.sort(s1Array);
	 
	            Arrays.sort(s2Array);
	 
	            //Checking whether s1Array and s2Array are equal
	 
	            status = Arrays.equals(s1Array, s2Array);
	        }
	 
	        //Output
	 
	        System.out.println("s1"+s1);
	        System.out.println("s2"+s2);
	        if(status)
	        {
	            System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
	    }
	 
		 
	}


