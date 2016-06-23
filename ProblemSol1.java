package workoutPkg;

/*
 *  Given array of ints. find ar[i],ar[j] such that j>i and ar[j]-ar[i] is maximum. Famous problem. (Code)
 */
public class ProblemSol1 {

	int arrLst[] = { 21, 4, 5, 10, 3, 12, 20};
	int min;
	int max;
	int difference;
	
	void minMaxInt() {
		min = arrLst[0];
		max = arrLst[0];
		int len = arrLst.length;
		
		for (int i = 0; i < len; i++) {
			if (min > arrLst[i]) {
				min = arrLst[i];
			}
			if (max < arrLst[i]) {
				max = arrLst[i];
			}
		}
	}
	private static void findMax1(int[] array) {
		
		int i = 0;
		int j = 1;
		int next_min = i;

		for(int k = 1; k < array.length; k++){
			if(array[j] < array[k]) {
				j = k;
			} else if (array[k] < array[next_min]) {
				next_min = k;
			} 
			if (array[k] - array[next_min] > array[j] - array[i] ){
				i = next_min;
				j = k;
			}
		}
		System.out.println("i="+ i + "; j=" + j);
			
	}
	
	private static void findMax(int[] arr) {
		int i=0 , j=0 , max =0,flag=0;
		int len = arr.length;
		for (int k = len-1; k > 0 ; k-- )
		{
			for (int n =0 ; n < len ; n++){
				if ((arr[k]-arr[n]) > max){
					max = arr[k]-arr[n];
					i = n;
					j= k ;
					flag =1;
					
				} 
				
				}
		}
		if (flag == 1)
		System.out.println("i = " + i + "  j =  " + j );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProblemSol1 ps = new ProblemSol1();
		ps.minMaxInt();
		System.out.println("Min : " + ps.min + " Max " + ps.max);
		System.out.println("Difference " + (ps.max - ps.min));
		
		ProblemSol1.findMax(ps.arrLst);
		ProblemSol1.findMax1(ps.arrLst);
	}

}
