package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class IVendingMachine {
	private HashMap<String, Integer> items = new HashMap<String, Integer>();
	private ArrayList<Integer> denominations;
	
	IVendingMachine() {
		items.put("Icecream", 125);
		items.put("Waffle", 205);
		items.put("Tea", 80);
	}
	IVendingMachine(ArrayList<Integer> denominations) {
		this();
		this.denominations = denominations;
	}
	public Integer buy(String item) {
		if(items.containsKey(item)) {
			return items.get(item);
		}
		return 0;
	}
	public HashMap<Integer, Integer> getReturn(int price, int amt) {
		if(this.denominations == null) {
			System.out.println("No Money In The Bank!");
			return null;
		}
		System.out.println("Amount rendered: Rs." + amt);
		HashMap<Integer, Integer> returnMap = new HashMap<Integer, Integer>();
		if(price == amt) {
			System.out.println("Exact change rendered. Good Customer!");
			returnMap.put(0, 0);
			return returnMap;
		} else {
			int returnAmt = amt - price;
			System.out.println("Amount to be returned: Rs." + returnAmt);
			Iterator<Integer> i = denominations.iterator();
			while(i.hasNext()) {
				int currency = i.next().intValue();
				if(returnAmt != 0 && (returnAmt/currency) != 0) {
					returnMap.put(currency, returnAmt/currency);
					returnAmt = returnAmt%currency;
				}
			}
		}
		return returnMap;
	}
}

public class IVendingMachineExample {

	public static Comparator<Integer> valueComparator = new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i2 - i1;
		}
	};
	
	public static void main(String[] args) {
		ArrayList<Integer> denominations = new ArrayList<Integer>();
		denominations.add(5);
		denominations.add(15);
		denominations.add(50);
		denominations.add(75);
		Collections.sort(denominations, valueComparator);
		IVendingMachine machine1 = new IVendingMachine(denominations);
		int price = machine1.buy("Icecream").intValue();
		System.out.println("Amount to be paid: Rs." + price);
		HashMap<Integer, Integer> map = machine1.getReturn(price, 400);
		System.out.println("Return:");
		Set<Integer> ks = map.keySet();
		for(Integer i: ks) {
			System.out.println("Rs. " + i + ": " + map.get(i));
		}
	}

}