package com.coreassignments9.com;

import java.util.Arrays;
import java.util.List;

public class DogExample {
	
	public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("A","quick","Brown","fox","jumps","over","the","Lazy","Dog");

        String[] array = arrayList.toArray(String[]::new);

        System.out.println(Arrays.toString(array));

    }

}
