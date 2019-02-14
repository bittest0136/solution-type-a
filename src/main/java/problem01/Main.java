package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int num = number;
		int result =0;
		String strNumber = String.valueOf(num);
		String[] arrNumber = strNumber.split("");
		int three= -1;
		int six= -1;
		int nine= -1;

		for(int i=0;i<arrNumber.length;i++) {
			int checkThree = strNumber.indexOf("3",i);
			int checkSix = strNumber.indexOf("6",i);
			int checkNine = strNumber.indexOf("9",i);
			if(checkThree>-1) {
				if( three !=checkThree) {
					result++;
					three = checkThree;
				}
			};
			if(strNumber.indexOf("6",i)>-1) {
				if( six !=checkSix) {
					result++;
					six = checkSix;
				}
			};
			if(strNumber.indexOf("9",i)>-1) {
				if( nine !=checkNine) {
					result++;
					nine = checkNine;
				}
			};
		}
		
		return result;
	}
}
