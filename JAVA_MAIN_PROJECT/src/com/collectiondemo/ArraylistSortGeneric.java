package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.common.entities.Address;
import com.common.entities.Oraganization;

public class ArraylistSortGeneric {
	public static void main(String[] args) {

		Address address = new Address();
		
		address.setAddline1("Bijapur");
		address.setTaluk("Bijapur");
		address.setDist("Bijapur");
		address.setState("KARNATAKA");
		address.setPincode(586127);

		Oraganization o = new Oraganization(5547, "SDM", address);
		Oraganization o1 = new Oraganization(12, "BVB", address);
		Oraganization o2 = new Oraganization(1, "BIT", address);
		Oraganization o3 = new Oraganization(55, "JC", address);
		Oraganization o4 = new Oraganization(10, "RV", address);

		List<Oraganization> list = new ArrayList<>();
		list.add(o);
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);

		// Collections.sort(list);

		Collections.sort(list, new Comparator<Oraganization>() {

			@Override
			public int compare(Oraganization o1, Oraganization o2) {
				Integer id1 = o1.getId();
				Integer id2 = o2.getId();
				return id1.compareTo(id2);
			}
		});
		System.out.println(list);
	}

}
