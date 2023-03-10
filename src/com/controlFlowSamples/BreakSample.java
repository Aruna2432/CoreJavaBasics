package com.controlFlowSamples;

public class BreakSample {

	public static void main(String[] args) {
		
		int[] arrayList = {21, 3, 4, 67, 82};
		int SearchFor = 24;
		int i = 0;
		boolean foundIt = false;
        for(; i < arrayList.length; i++) {
        	if(arrayList[i] == SearchFor) {
        		foundIt = true;
        		break;
        	}
        }
        if(foundIt) {
        	System.out.println("Found " + SearchFor + " at index " + i);
        }else
        {
        	System.out.println(SearchFor + " not in the array");
        }
	}

}
