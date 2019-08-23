package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	int sum = 0;
    	int temp = 0;
    	if(leftBorder > rightBorder) {
    		temp = leftBorder;
    		leftBorder = rightBorder;
    		rightBorder = temp;
    		
    	}
    	for(int i = leftBorder;i<=rightBorder;i++) {
    		if(i%2 == 0) {
    			sum += i;
    			
    		}
    		
    	}
    	return sum;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	
    	int sum = 0; 
    	for (int i = 0;i<arrayList.size();i++) {
    		sum=sum+arrayList.get(i)*3+2;
    		
    	}
    	
		return sum;
    	
       // throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
    	int avg = 0;
    	int count = 0;
    	for (int i = 0;i<arrayList.size();i++) {
    		if(i%2 ==0 ) {
    			avg += arrayList.get(i);
    			count++;
    			
    		}
    		
    	}
    	avg = avg/count;
    	
    	
    	return avg;
        //throw new NotImplementedException();
    }
}
