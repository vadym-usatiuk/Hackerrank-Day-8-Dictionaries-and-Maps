
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, String> myMap = new HashMap<String, String>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			String str = Integer.toString(phone);
			myMap.put(name, str);

		}
		while (in.hasNext()) {
			String s = in.next();
			String number = myMap.get(s);
			if (number != null) {
				System.out.println(s + "=" + number);
			} else {
				System.out.println("Not found");

			}
		}
		in.close();
	}
}