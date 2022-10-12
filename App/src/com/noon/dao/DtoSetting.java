package com.noon.dao;

public class DtoSetting {

	// Fields
	int setno;
	String initdate;
	String enddate;
	int pricenow;
	String photonow;
	String menu_name;
	int shop_shopcode;
	int filename;
	String category;
	
	// Constructor
	public DtoSetting() {
		// TODO Auto-generated constructor stub
	}

	public DtoSetting(int setno, String initdate, String enddate, int pricenow, String photonow, String menu_name,
			int shop_shopcode, int filename, String category) {
		super();
		this.setno = setno;
		this.initdate = initdate;
		this.enddate = enddate;
		this.pricenow = pricenow;
		this.photonow = photonow;
		this.menu_name = menu_name;
		this.shop_shopcode = shop_shopcode;
		this.filename = filename;
		this.category = category;
	}

	public DtoSetting(int setno, int pricenow, String menu_name, int filename) {
		super();
		this.setno = setno;
		this.pricenow = pricenow;
		this.menu_name = menu_name;
		this.filename = filename;
	}

	public DtoSetting(int setno, int filename, String category) {
		super();
		this.setno = setno;
		this.filename = filename;
		this.category = category;
	}

	// ---------------------
	public int getSetno() {
		return setno;
	}

	public void setSetno(int setno) {
		this.setno = setno;
	}

	public String getInitdate() {
		return initdate;
	}

	public void setInitdate(String initdate) {
		this.initdate = initdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getPricenow() {
		return pricenow;
	}

	public void setPricenow(int pricenow) {
		this.pricenow = pricenow;
	}

	public String getPhotonow() {
		return photonow;
	}

	public void setPhotonow(String photonow) {
		this.photonow = photonow;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public int getShop_shopcode() {
		return shop_shopcode;
	}

	public void setShop_shopcode(int shop_shopcode) {
		this.shop_shopcode = shop_shopcode;
	}

	public int getFilename() {
		return filename;
	}

	public void setFilename(int filename) {
		this.filename = filename;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
}