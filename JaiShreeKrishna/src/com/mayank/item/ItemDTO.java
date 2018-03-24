package com.mayank.item;

public class ItemDTO {
	
	private int sNo;
	private int hsnNo;
	private String itemName;
	private String itemPrice;
	private double CGST;
	private double SGST;
	private String manufacturer;
//	public ItemDTO(int S_NO,String Item_Name,String Item_Price,double CGST,double SGST,
//			String Manufacturer) {
//		this.sNo=S_NO;
//		this.itemName=Item_Name;
//		this.itemPrice=Item_Price;
//		this.CGST=CGST;
//		this.SGST=SGST;
//		this.manufacturer=Manufacturer;
//	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public int gethsnNo() {
		return hsnNo;
	}
	public void sethsnNo(int hsnNo) {
		this.hsnNo = hsnNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getCGST() {
		return CGST;
	}
	public void setCGST(double cGST) {
		CGST = cGST;
	}
	public double getSGST() {
		return SGST;
	}
	public void setSGST(double sGST) {
		SGST = sGST;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
	
