package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldKo hello1= new HelloWorldKo();		
		callMethod(hello1);
		
		HelloWorldKo hello2= new HelloWorldKo();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
