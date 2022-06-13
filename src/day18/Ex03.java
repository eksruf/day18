package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {
public static void main(String[] args) throws Exception {
	File path = new File ("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa.txt");
	
	FileInputStream fis = new FileInputStream(path);
	while(true) {
		Thread.sleep(1000);
	int res = fis.read();
	//System.out.println("res: "+res); //더이상 가지고 올 값이 없으면 -1(eof)이 출력
			if(res<0)
				break;
		System.out.println((char)res);
		
	}
}
}
