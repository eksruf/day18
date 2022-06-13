package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex04 {
public static void main(String[] args) throws Exception {
	File path = new File ("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa.txt");
	
	FileOutputStream fos = new FileOutputStream(path);
	BufferedOutputStream bos = new BufferedOutputStream(fos); //보조
	
	
	for(int i='1';i<'9';i++) {
		//Thread.sleep(1000);
		bos.write(i); //파일로 보내는 명령을 적어야 저장소에 저장한 값을 출력
	}
	bos.flush();
}
}
