package com.koreait.second;

public class Gugudan {

	public static void main(String[] args) {

/*		gugudan(2, 5); 
		//아무것도 안적었다 = 같은 메소드 안에 있을 확률이 높다.
		//static 메소드안에 아무것도 안적은 실행문 = 실행문이 static 이다.
					//=을 안붙였다= void일 확률이 높다.
		int sum = sum(1,2); //3
		sum = sum(1,2,3);
		sum=sum(1,2,3,4,5,6,7,8,9,10,11,12);
	
		
		int result = Utils.parseStringToInt("10",0); //10정수값 리턴
		result = Utils.parseStringToInt("aa10",1);//파싱할수 없을 때 두번째 인자값 리턴
		result = Utils.parseStringToInt("aa10");
		result = Utils.parseStringToInt("9");
		*/
		int[] arr = {4,5,11,223,3,10};
		Utils.sortASC(arr); //오름차순 정렬
		Utils.printArr(arr);	//[3,4,5,10,11,223]
		Utils.sortDESC(arr);	//내림차순정렬
		Utils.printArr(arr);	//[223,11,10,5,4,3]
		
		
		int[] rArr = Utils.createRandomArr(1,9,5);
		//1-9 랜덤한 값을 5칸 가지는 정수형 배열
		
		rArr = Utils.createRandomArrNoDuplication(5, 15, 10);
		Utils.printArr(rArr);
		
		
		String star = makeStarTriangle(5); //결과값 문자열로 넘기기
		System.out.println(star);
		
	}					
	public static void gugudan(int min, int max) {
		for (int i = min; i <= max; i++) {
			for (int z = 1; z < 10; z++) {
				if ((i * z) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, z, i * z);
				}
			}
			System.out.println("");
		}
	}

	public static int sum(int ...n) {
	int sum=0;
	for(int i=0; i<n.length; i++) {
		sum+=n[i];
	}
	return sum;
	
	} 
	
	
	
}
