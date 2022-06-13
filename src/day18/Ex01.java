package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 파일입출력
 -디스크에 저장하는 방식
 -영구저장을 하기위해 사용
 */
public class Ex01 {
public static void main(String[] args) throws Exception {
	File path = new File ("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/aaa.txt");
	//stream: 연결통로(무언가 데이터를 연결받기 위함)
	FileOutputStream os = new FileOutputStream(path);

	os.write('A');
	os.write(97);
	
	String s = "hello";
	os.write(s.getBytes()); //문자열을 받아서 바로 못 쓰니깐 바이트형식으로 받아야 한다.


}
}
