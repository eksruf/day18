package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class AAA implements Serializable{
	String name;
	String addr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
public class Ex06 {
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner (System.in);
	String name, addr;
	
	System.out.println("1.저장");
	System.out.println("2.가져오기");
	int num = input.nextInt();
	
	String path ="D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/";
	
	AAA info = null;//갹체가 만들어진것이 아니라서 기능은 쓸 수 없다.
	
	if(num==1) {
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("주소 입력");
		addr = input.next();
		
		info = new AAA(); //객체생성 = 기능사용가능
		info.setName(name);
		info.setAddr(addr);
		
		File path02 = new File(path+name+".txt");
		FileOutputStream fos = new FileOutputStream(path02);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(info);
		
		oos.close(); bos.close(); fos.close();
		System.out.println("저장되었습니다.");
		
		
	}else {
		File list = new File (path);
		String[] li = list.list();
		for(int i = 0; i<li.length;i++) {System.out.println(li[i]);}
	System.out.println("확인할 이름 입력");
	name = input.next();
	File p= new File(path+name+".txt");
	//p.delete();
	FileInputStream fis = new FileInputStream(p);
	BufferedInputStream bis = new BufferedInputStream(fis);
	ObjectInputStream ois = new ObjectInputStream(bis);
	
	info = (AAA)ois.readObject();
	System.out.println("이름: "+info.getName());
	System.out.println("주소: "+info.getAddr());
	
	
	
	
//		for(String a : li) {
//			System.out.println(a);
//		}
	}
	
}
}
