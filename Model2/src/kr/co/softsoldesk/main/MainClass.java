package kr.co.softsoldesk.main;

import kr.co.softsoldesk.beans.HelloWorldEn;
import kr.co.softsoldesk.beans.HelloWorldKr;

public class MainClass {
	public static void main(String[] args) {
			
//		HelloWorldEn hello1 = new HelloWorldEn();
//		callMethod(hello1);
		
		
		
		HelloWorldKr hello2 = new HelloWorldKr();
		callMethod(hello2);
	}
	
	
		public static void callMethod(HelloWorldEn hello) {
			hello.sayHello();
			
			
		}
		
		public static void callMethod(HelloWorldKr hello) {
			hello.sayHello();
			
			
		}
		
		
		
	
	
	
}
