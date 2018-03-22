package com.practise;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbersusingThreadLocalRandom {
public static void main(String[] args) {
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Randome integers:"+ThreadLocalRandom.current().nextInt());
	}
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Randome Floats:"+ThreadLocalRandom.current().nextFloat());
	}
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Random boolean:"+ThreadLocalRandom.current().nextBoolean());
	}
}
}
