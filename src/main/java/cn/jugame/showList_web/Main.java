package cn.jugame.showList_web;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 20 ; i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()){
			if(i.next() == 10){
				i.remove();
			}
		}
		System.out.println(al);
	}
}
