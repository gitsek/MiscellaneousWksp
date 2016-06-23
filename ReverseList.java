package workoutPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

	private ArrayList<String> reverseList(ArrayList<String> list) {
		int size = list.size();
		String[] revList = new String[size];
		
		for(int i = (size -1), cnt = 0; i >= 0 ; i--, cnt++) {
			revList[cnt] = list.get(i);
		}
		ArrayList<String> revArrayList = new ArrayList<String>(Arrays.asList(revList));

		return revArrayList;
	}
	
	private List<String> recursiveReverseList(List<String> list) {
		ArrayList<String> reversedArrayLst = new ArrayList<String>();
		
		if (list.size() == 1){
			return list;
		}
		System.out.println(list);
		
		reversedArrayLst.add(list.get(list.size() -1));
		List<String> retList = recursiveReverseList( list.subList(0, list.size() -1));
		System.out.println(retList);
		reversedArrayLst.addAll(retList);
		
		return reversedArrayLst;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ReverseList revListObj = new ReverseList();
		
		list.add("Test");
		list.add("Reverse");
		list.add("list");
		
		//ArrayList<String> reversedList = revListObj.reverseList(list);
		//System.out.println(reversedList);
		
		List<String> revRecursiveLst = revListObj.recursiveReverseList(list);
		System.out.println(revRecursiveLst);
	}
}
