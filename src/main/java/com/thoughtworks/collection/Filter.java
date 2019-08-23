package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
//
//import java.util.List;

public class Filter {

    List<Integer>  array;
    

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    	//nteger[] resultArray = new Integer[] {};
    	List<Integer> result=new ArrayList<Integer>();
    	
    	for (int i = 0;i<array.size();i++) {
    		if(array.get(i)%2 == 0) {
    			result.add(array.get(i));
    			
    		}
    		
    	}
		return result;
        //throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
    	List<Integer> result  = new ArrayList<Integer>();
    	for(int i = 0;i < array.size();i++) {
    		if (array.get(i)% 3 ==0) {
    			result.add(array.get(i));
    			
    		}
    		
    		
    	}
		return result;
    	
    	
       // throw new NotImplementedException();
    }
}
