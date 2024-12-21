package saturday21;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// left rotation one move
				int[]  num = {60,70,80,90,100};
				System.out.println("Before rotation");
				for(int i=0;i<num.length;i++) {
					System.out.print(num[i]+" ");
				}
				System.out.println();
				System.out.println("how many times want to rotate");
				Scanner sc = new Scanner(System.in);
				int no = sc.nextInt();
				while(no !=0) {
					int last = num[num.length-1];
					for(int i=num.length-1;i>0;i--) {
						num[i]= num[i-1];// 4--3
					}
					num[0]= last;
					no--;	
				}
				System.out.println("after 1 rotation");
				for(int i=0;i<num.length;i++) {
					System.out.print(num[i]+" ");
				}	
			}
		}
