package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		String id ="abcd";
		String pwd = "333";
		
		while(true) {
			System.out.println("등록 아이디 입력");
			id = input.next();
		File path =
				new File ("D:/220509오후취업_김윤현/eclipse-jee-2022-03-R-win32-x86_64/eclipse workspace/"+id+".txt");
		
		//stream: 연결통로(무언가 데이터를 연결받기 위함)
		//path.exists(): 해당하는 위치에 접근이 가능한가(가능하면 true)
		
			if(path.exists()) {//해당 파일이 존재할 떄
			System.out.println("존재하는 아이디 입니다.");
			
			}else {//해당 파일이 없을 때
			System.out.println("비밀번호 입력");
			pwd = input.next();
			FileOutputStream fos = new FileOutputStream(path);
	
		
			fos.write(id.getBytes());
			fos.write(pwd.getBytes());
			System.out.println("등록되었습니다.");
			break;
			}
		}
		
		
		
		
		

	}
}
