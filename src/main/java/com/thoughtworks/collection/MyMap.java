package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
    	
    	for (int i = 0;i<array.size()-1;i++) {

    		for (int j = 0; j < array.size()-i-1;j++) {
    			if(array.get(j)<array.get(j+1)) {
    				int temp;
    				temp = array.get(j);
    				array.set(j, array.get(j+1));
    				array.set(j+1, temp);

    				
    			}
    			
    		}
    		
    	}
    	
		return array;
    	
        //throw new NotImplementedException();
    }

//    public List<Integer> sortFromSmall() {
//        throw new NotImplementedException();
//    }
}
