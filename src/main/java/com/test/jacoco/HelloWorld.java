package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
		if(a == 0) {
			return 0;
		}
		int x = 0;
		if((a == b) || ((c == d) && (bug(a)))) {
			x = 1;
		}
		e = 1/x;
		return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	if(a <= 0 || b <= 0 || c <= 0)
    		return false;
		else return (a + b > c) && (b + c > a) && (a + c > b);
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
    	int num = getNum(month);
    	if(year >= 1990 && year <= 2018)
		{
			if(month >= 1 && month <= 12)
			{
				return day >= 1 && day <= num;
			}
		}
    	else if(year == 2019)
		{
			if(month >= 1 && month <= 9) {
				return day >= 1 && day <= num;
			}
			else return month == 10 && day == 1;
		}
    	return false;
    }
    public int getNum(int month)
	{
		int num = 0;
		switch (month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				num = 31;
				break;
			default: num = 30;
		}
		return num;
	}
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	if(op == '+')
		{
			result = a + b;
		}
    	else if(op == '-') {
			result = a - b;
		}
    	else if(op == '*') {
			result = a * b;
    	}
    	else if(op == '/') {
    		if(b != 0)
    			result = a / b;
		}
    	return result;
    }
    
}
