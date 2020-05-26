package CaseStudy2.Model.Customer;

import CaseStudy2.Model.Service;

public abstract class Customer {
	private String nameCustomer;
	private String idCard;
    private String dayOfBirth;
    private String sex;
    private int cmnd;
    private int phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Service service;

    public Customer(){
    }

    public Customer(String nameCustomer,String idCard, String dayOfBirth, String sex, int cmnd,int phoneNumber,String email,String typeCustomer,String address,Service service){
		this.nameCustomer = nameCustomer;
		this.idCard = idCard;
		this.dayOfBirth = dayOfBirth;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.service = service;
    }
    public String getNameCustomer() {
		return this.nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getIdCard(){
		return this.getIdCard();
	}

	public void setIdCard(String idCatd){
		this.idCard = idCard;
	}
	public String getDayOfBirth() {
		return this.dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeCustomer() {
		return this.typeCustomer;
	}

	public void setTypeCustomer(String typeCustomer) {
		this.typeCustomer = typeCustomer;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
    }
    
    public void showInfo() {
		System.out.println("Name: " + getNameCustomer()
							+"ID Card: " + getIdCard()
							+ "Day of Birth: " + getDayOfBirth()
							+ "Sex: " + getSex()
							+ "CMND: " +getCmnd()
							+ "Phone number: " + getPhoneNumber()
							+ "Email: " + getEmail()
							+" Type customer: " + getTypeCustomer()
							+" Address:  " + getAddress()
							+" Type Service: " + getService());
	}
}