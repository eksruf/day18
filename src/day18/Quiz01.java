package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) throws Exception  {
	Scanner input = new Scanner(System.in);
	String name="";
	String addr = "";
	String age="";
	
	
	File path = new File("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa/test.txt");

	System.out.println("이름입력");
	name=input.next();
	
	System.out.println("나이입력");
	age=input.next();
	
	System.out.println("주소입력");
	addr = input.next();
	
	FileOutputStream os = new FileOutputStream(path);
	
	os.write(name.getBytes());
	os.write(addr.getBytes());
	os.write(age.getBytes());
	
//	if(path.exists()) {
//		System.out.println("");
//	}else {
//		System.out.println("");
//	}
	

}
}
