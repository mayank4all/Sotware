package com.mayank.mfg;

public class ManufaturerDTO {
	private String Name;
	private String BP_Number;
	private String Officer;
	private String Phone_No;
	private String Address;
	public ManufaturerDTO(String Name , String BP_Number , String Officer,
			String Phone_No , String Address) {
		this.Name=Name;
		this.BP_Number=BP_Number;
		this.Officer=Officer;
		this.Phone_No=Phone_No;
		this.Address=Address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBP_Number() {
		return BP_Number;
	}
	public void setBP_Number(String bP_Number) {
		BP_Number = bP_Number;
	}
	public String getOfficer() {
		return Officer;
	}
	public void setOfficer(String officer) {
		Officer = officer;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
