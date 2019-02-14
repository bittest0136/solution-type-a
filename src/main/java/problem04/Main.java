package problem04;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str="";
		String[] answer = {"7","8","3"};
		File file = new File("result.txt");
		FileWriter write = null;
		String ans = "783";
		int cnt=0;

		while( true) {
			str = scanner.next();
			cnt++;
			int check=0;
			String remove ="";
			int S=0;
			int B=0;
			int O=0;
			String[] arr = str.split("");
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(answer[i])) {
					S++;
					remove = answer[i];
				}else if(ans.indexOf(arr[i]) >-1) {
					check = ans.indexOf(arr[i]);
					for(int k=i;k<answer.length;k++) {						
						if(check != ans.indexOf(arr[i],k)) {
							B++;
						}
					}
				}else {
					O++;
				}
			}
			
			System.out.println(cnt+ " - "+"S:"+S+", B: "+B+", O:"+O);
			
			if(S==3) {
				System.out.println("(종료)");
				break;
			}
		}
	}
}