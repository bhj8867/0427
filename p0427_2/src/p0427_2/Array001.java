package p0427_2;

import java.util.Scanner;

public class Array001 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n[]=new int[3],sum=0,i;
		
		for(i=0;i<n.length;i++){
		System.out.printf("%d. 점수입력(1~10) : ",i+1);
		n[i]=s.nextInt();
		
		}System.out.print("\n");
		
			for(i=0;i<n.length;i++){
				System.out.printf("%d. 출력 점수 : %d\n",i+1,n[i]*10);
				
				sum=sum+n[i];//중요!!!!
			
			}System.out.print("\n");
			
		System.out.printf("출력 점수 누적 합계 : %d\n",10*sum);
		System.out.printf("출력 점수 누적 합계 평균 : %.2f",(float)sum*10/n.length);
		
		s.close();
	}
}