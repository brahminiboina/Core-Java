package com.java.Enum;

enum Color2 {
	RED, BLACK, WHITE,Pink(16),Green(7),Purple(10) ;
	private int colorvalue;
	
	static void fun() {
		//Color c = new Color();	not allowed
	}
	
	Color2(){
		System.out.println("color object is created");
	}
	Color2(int cv){
		colorvalue = cv;
	}
	int getColorValue() {
		return colorvalue;
	}
	
}
