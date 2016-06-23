package workoutPkg;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapExmp{
    private TreeMap<String,Integer> studentMap = new TreeMap<String,Integer>();
    public void getStudents(){
        studentMap.put("Lola",new Integer(8));
        studentMap.put("Alexa",new Integer(5));
        studentMap.put("Mason",new Integer(8));
        studentMap.put("Michael",new Integer(6));
        studentMap.put("Gemma",new Integer(8));
        studentMap.put("Alexa",new Integer(6));
        studentMap.put("Lola",new Integer(4));
        studentMap.put("Michael",new Integer(5));
        studentMap.put("Alexa",new Integer(8));
        Set<Entry<String,Integer>> set = studentMap.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Integer i = (Integer)entry.getValue();
            if(i > 5){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
    public static void main(String[] args){
    	TreeMapExmp mc = new TreeMapExmp();
        mc.getStudents();
    }
}