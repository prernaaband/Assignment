package Assign;
import java .util.HashMap;
public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> HM=new HashMap<>();
		HM.put(1, 1);
		HM.put(2, 8);
		HM.put(3, 27);
		HM.put(4, 64);
		HM.put(5, 125);
		HM.put(6, 216);
		HM.put(7, 343);
		HM.put(8, 512);
		HM.put(9, 729);
		HM.put(10, 1000);
		HM.put(11, 1331);
		HM.put(12, 1728);
		HM.put(13, 2197);
		HM.put(14, 2744);
		HM.put(15, 3375);
		for(Integer key:HM.keySet())
		{
			System.out.println("Key:"+key+"values:"+HM.get(key));
		}
		

	}

}
