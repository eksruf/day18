package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.Scanner;
class A implements Serializable {
	String name;
	String stnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStnum() {
		return stnum;
	}
	public void setStnum(String stnum) {
		this.stnum = stnum;
	}
}
public class Quiz02 {
public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	String path ="D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa/";
	
	String name,stnum;
	 A a = null;
	 
	 while(true) {
	 System.out.println("1.추가");
	 System.out.println("2.수정");
	 System.out.println("3.삭제");
	 System.out.println("4.검색");
	 System.out.println(">>>");
	 int num = input.nextInt();
	 
	 switch (num) {
	 case 1: //추가
		 a= new A();
		
		 System.out.println("학번");
		  stnum = input.next();
		 System.out.println("이름");
		  name = input.next();
		 a.setName(name);
		 a.setStnum(stnum);
		 
		 File path02 = new File(path+name+".txt"); 
		 
		 FileOutputStream fos = new FileOutputStream(path02);
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 ObjectOutputStream oos = new ObjectOutputStream(bos);
		 
		 oos.writeObject(a);
		 
		 oos.close(); bos.close(); fos.close();
		 
		 System.out.println("저장되었습니다.");
		 
		 break;
		 
		 
	 case 2://수정
		 File list = new File(path);
		 String[] li = list.list();
		 for(String s : li) {
			 System.out.println(s);
		 }
		 System.out.println("수정할 파일 이름");
		 name = input.next();
		 File p = new File(path+name+".txt");
		 
		 FileInputStream fis = new FileInputStream(p);
		 BufferedInputStream bis = new BufferedInputStream(fis);
		 ObjectInputStream ois = new ObjectInputStream(bis);
		 
		 a = (A)ois.readObject();
			System.out.println("이름: "+a.getName());
			System.out.println("주소: "+a.getStnum());
			
			
			
		 break;
	 
		 
	 case 3://삭제
		list = new File(path);
		li = list.list();
		 
		 for(int i=0;i<list.length();i++) { System.out.println(li[i]);} 
		 System.out.println("삭제할 파일 이름 입력");
		 name=input.next();
		p = new File(path+name+".txt");
		 p.delete();
		 break;
		 
		 
	 case 4://검색
		 
		 list = new File(path);
			li = list.list();
			 
			 for(int i=0;i<list.length();i++) { System.out.println(li[i]);} 
			 System.out.println("찾는 파일 이름을 입력");
			 name=input.next();
				p = new File(path+name+".txt");
				
			 fis = new FileInputStream(p);
			 bis = new BufferedInputStream(fis);
			 ois = new ObjectInputStream(bis);
				 
				 a = (A)ois.readObject();
					System.out.println("이름: "+a.getName());
					System.out.println("주소: "+a.getStnum());
		 break;
	 }
	 
	 }
}


}
