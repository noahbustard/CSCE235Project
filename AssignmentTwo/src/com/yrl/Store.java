package com.yrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Noah Bustard
 * @author Caden France
 * 
 *         Date: 2024-03-08
 * 
 *         Store class represents each store and included managers.
 */

public class Store {
	private String storeCode;
	private Person manager;
	private Address address;

	public Store(String storeCode, Person manager, Address address) {
		this.storeCode = storeCode;
		this.manager = manager;
		this.address = address;
	}

	public Store(String storeCode, Address address) {
		this.storeCode = storeCode;
		this.address = address;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public Person getManager() {
		return manager;
	}

	public String getManagerUUID() {
		return this.manager.toString();
	}

	public Address getAddress() {
		return this.address;
	}

	@Override
	public String toString() {
		return this.getStoreCode();
	}

	/**
	 * Creates a map of each store and maps it with the sales the store had.
	 * 
	 * @param saleList
	 * @return
	 */
	public static Map<Store, List<Sale>> createStoreMap(ArrayList<Sale> saleList, ArrayList<Store> storeList) {
		Map<Store, List<Sale>> storeMap = new HashMap<>();
		for (Store key : storeList) {
			storeMap.put(key, new ArrayList<Sale>());
		}
		for (Sale sale : saleList) {
			Store store = sale.getStore();
			storeMap.get(store).add(sale);
		}
		return storeMap;
	}

	public void generateStoreReport(List<Sale> saleList) {
		double total = 0.0;
		for (Sale s: saleList) {
			//TODO: create total variable
				total += s.getItem().getCost();
			
				
			
		System.out.printf("%-10s %-30s %-10d %-15f\n",
				this.getStoreCode(), this.getManager(), saleList.size(), total);
		}
	}

}
