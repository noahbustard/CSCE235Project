package com.yrl;

/**
 * @author Noah Bustard
 * @Author Caden France
 * 
 *         Date: 2024-02-22
 */
public class Item {
	private String code;
	private String type;
	private String name;
	private Double basePrice;

	public Item(String code, String type, String name, String basePrice) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.basePrice = Double.parseDouble(basePrice);
	}

	public String getCode() {
		return code;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public Double getBasePrice() {
		return basePrice;
	}
}
