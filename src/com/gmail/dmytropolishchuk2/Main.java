package com.gmail.dmytropolishchuk2;

import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] stringArray = { "H", "e", "l", "l", "o", "W", "o", "r", "l", "d" };

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println("before->" + arrayList + " " + arrayList.size());

		arrayList.remove(0);
		System.out.println("first elements was deleted->" + arrayList + " " + arrayList.size());

		arrayList.remove(0);
		System.out.println("second elements was deleted->" + arrayList + " " + arrayList.size());

		arrayList.remove(arrayList.size() - 1);
		System.out.println("last elements was deleted->" + arrayList + " " + arrayList.size());
	}
	public static void add(String[] stringArrays) {// from List to Array
		String[] stringArray = { "[H", "e", "l", "l", "o", "W", "o", "r", "l", "d]" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
		for (String s : stringArr)
			if (s != null && arrayList.size() != 0) {
				System.out.print(s + " ");
			}
		System.out.println(arrayList.size());
	}

	public static void added(String[] stringArrays) {//from Array to List 
		String[] stringArray = { "H", "e", "l", "l", "o", "W", "o", "r", "l", "d" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
	}
}
