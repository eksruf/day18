package day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex05 {
public static void main(String[] args) throws Exception {
	File path = new File ("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa.txt");
	
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = new BufferedOutputStream(fos); //보조
	DataOutputStream dos = new DataOutputStream(bos);
	
	String s ="안녕하세요";
	dos.writeUTF(s);
	
	dos.close(); //stream을 열었으면 닫아주기 (역순으로) / 안닫으면 데이터가 많이 무겁다 
	bos.close();
	fos.close();
	
	
	FileInputStream fis = new FileInputStream(path);
	BufferedInputStream bis = new BufferedInputStream(fis);
	DataInputStream dis = new DataInputStream(bis);
	String str = dis.readUTF();
	System.out.println("가져온 내용: "+str);
	
	
	dis.close();
	bis.close();
	fis.close(); //통로를 다 쓰면 닫아주기
	
}
}
