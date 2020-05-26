package CaseStudy2.Model.Customer;

public class BookingService {
    private String id;
    private String nameCustomer;

    public BookingService(){

    }

    public BookingService(String id, String nameCustomer){
        this.id=id;
        this.nameCustomer=nameCustomer;
    }
    public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameCustomer() {
		return this.nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer=nameCustomer;
	}

    

	
}