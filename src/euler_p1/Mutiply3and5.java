package euler_p1;

public class Mutiply3and5 {

	
	public static int sum2Multiples(int firstInt, int secondInt, int upperBound){

		int sumFirst = 0;
		int sumSecond = 0;
		
		int iteracoesFirst = (upperBound)/firstInt;
		int iteracoesSecond = (upperBound)/secondInt;
		
		for (int i = 1; i <= iteracoesFirst; i++) {
			int m = firstInt * i;
			if(m < upperBound)
				sumFirst += (firstInt * i);
		}
		
		for (int i = 1; i <= iteracoesSecond; i++) {
			int m = secondInt * i;
			if(m < upperBound)
			if((i % firstInt) > 0){
				sumSecond += (secondInt * i);
			}
		}		
		return sumFirst + sumSecond;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum2Multiples(3, 5, 1000));

	}

}
