package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapDemo2 {

	public static void main(String[] args) {

		
//		Map<String, String> m = new HashMap<>();//fail-fast-> ConcurrentModificationException
		Map<String, String> m = new ConcurrentHashMap<>();//fail-safe

		m.put("AP", "Andhrapradesh");
		m.put("TG", "Hyderabad");
		m.put("TG", "Telangana");

		m.put("KA", "Bangalore");
		m.put("KA", "Karnataka");

		m.put("TN", "Madras");
		m.put("TN", "Tamil Nadu");

		m.put("KL", "Thiruvananthapuram");

		System.out.println(m);
		System.out.println(m.containsKey("TN"));
		System.out.println(m.containsValue("Bangalore"));

		System.out.println(m.keySet());// Set<String>
		System.out.println(m.values());// Collection<String>
		
		System.out.println(m.get("TN"));//

		Set<Entry<String, String>> entries = m.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			m.put("vc", "Vcube");//java.util.ConcurrentModificationException : fail-fast
		}
		
		
		System.out.println(m);

	}

}
