package workoutPkg;

import java.util.Arrays;
import java.util.List;

public class InheritExample {

	int data;
	
	void getData() {
		System.out.println("value of data: " + data);
	}
	
	public void setData( int i) {
		this.data = i;
		System.out.println("Value set for data " + i);
	}
	
	public static void main(String args[] ) {
		
		InheritExample baseClass = new InheritExample();
		baseClass.setData(10);
		baseClass.getData();
		
		InheritExample bClass1 = new subInheritExmp(0);
		bClass1.setData(11);
		bClass1.getData();
		
		String[] strArray = {"test", "array", "aslist"};
		System.out.println("Before converting to list");
		for (String item: strArray) {
			System.out.println(item);
		}
		List<String> strList = Arrays.asList(strArray);
		strList.set(1, "arrayList");
		
		System.out.println(" ArrayList : " + strList);
		System.out.println(" Array : ");
		for (String item: strArray) {
			System.out.println(item);
		}
		
	}
}

class subInheritExmp extends InheritExample {
	
	subInheritExmp(int i) {
		this.data = i;
	}
	
	public void getData() {
		System.out.println(this.getClass() + "Value of data " + data);
	}
}
