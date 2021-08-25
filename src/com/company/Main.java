package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        MyStore<Integer, String> myStore = new MyStore<>();
        myStore.add(1, "I");
        myStore.add(2, "II");
        System.out.println(myStore.get(1));
        System.out.println(myStore.get(2));
        System.out.println(myStore.get(3));
        System.out.println(myStore.getSize());
    }
}
