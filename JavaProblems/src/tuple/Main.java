package tuple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
   
    public static void main(String args[]) {

    	Tuple t1 = new Tuple(1900, 1950);
    	Tuple t2 = new Tuple(1910, 1940);
    	Tuple t3 = new Tuple(1920, 1930);
    	
    	ArrayList<Tuple> tupleList = new ArrayList<Tuple>();
    	tupleList.add(t1);
    	tupleList.add(t2);
    	tupleList.add(t3);
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();    	
    	for(Tuple t : tupleList) {
    		for(int i = t.getStart(); i <= t.getEnd(); i++) {
        		list.add(i);
        	}
    	}
    	//Collections.sort(list);
    	System.out.println(list);
    	int max = 0;
    	int min = 0;
    	int iCount = 0;
    	for(Integer i : list) {
    		iCount = Collections.frequency(list, i);
    		if((iCount > max)) {
    			max = iCount;
    		} else {
    			
    		}
    	}
    	
    	Map<Integer, Long> countMap =
    		    list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    	//int sahanaCount = Collections.frequency(list, new Employee("003", "Sahana"));
    	
    	System.out.println(countMap);
    	List<TruckService> truckRange = new ArrayList<TruckService>();
    	
    	
    	/*TreeMap<Integer, Long> map = new TreeMap<Integer, Long>();
    	map.putAll(count); 	
    	System.out.println(map);*/
    	
    }

}
