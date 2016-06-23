package workoutPkg;

public class DzoneProb1 {
	int x;
	public void method(int i){
		try {
			if(i > 2) {
				i = (1 / 0) + Integer.parseInt("x");
			}else {
				i =  Integer.parseInt("x") + (1 / 0);
			}
		}catch(ArithmeticException e) {
			x += 4;
		}catch(RuntimeException e) {
			x += 3;
		}catch(Exception e) {
			x += 5;
		}finally {
			x += 2;
		}
		x ++ ;
	}
	public static void main(String[] args){
		DzoneProb1 mc = new DzoneProb1();
		mc.method(3);
		mc.method(2);
		System.out.print(mc.x);
	}
}
