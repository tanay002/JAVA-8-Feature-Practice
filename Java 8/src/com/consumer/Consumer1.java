package com.consumer;

import java.util.function.Consumer;

public class Consumer1
{
	public static void main(String[] args) {

		Consumer<String> str=strr->System.out.println(strr);
		str.accept("Tanay Saxena");
		str.accept("DJ");
	}
}
