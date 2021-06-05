package basic.dev;

import java.util.Scanner;


public class MainApp {
	public static boolean checkNumberStr(String str) {
		boolean check = true;
		if (str.length() >= 6) check = true; 
		else check = false;
		return check;
	}
	public static int checkNumberUpper(String str){
		int indexUpper = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int cas = (int) ch;
			if (cas >= 65 && cas <= 90) {
			indexUpper++;
			}
		}
		return indexUpper;
	}
	
	public static int checkNumberLower(String str){
		int indexLower = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int cas = (int) ch;
			if (cas >= 97 && cas <= 122) {
			indexLower++;
			}
		}
		return indexLower;
	}
	public static int checkDacBiet(String str){
		int indexLower = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int cas = (int) ch;
			if ((cas >= 0 && cas <= 47)||(cas >= 58 && cas <= 64)||(cas >= 91 && cas <= 96) ||  cas >= 123) {
			indexLower++;
			}
		}
		return indexLower;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mat khau: ");
		String str = sc.next();
		int index = 0;
		int a = checkNumberLower(str);
		int b = checkNumberUpper(str);
		int c = checkDacBiet(str);
		boolean check;
		if(check = checkNumberStr(str) == true) index ++;
		if(a  >= 1) index++;
		if (b >= 1) index++;
		if (c >= 1) index++;
		if (index == 4) {
			System.out.println("Mat khau manh");
		}else if (index == 2 || index == 3) {
			System.out.println("Mat khau trung binh");
		}else {
			System.out.println("Mat khau yeu");
		}
	}

}
