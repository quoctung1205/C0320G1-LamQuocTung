package CaseStudy2.Model;

public abstract class Service implements Comparable<Service>{
	private String id;
	private String nameService;
    private double Area;
    private long price;
    private int maximumPeople;
    private String typeRents;

	public Service(){
	}
	
    public Service(String id, String nameService, double Area, long price, int maximumPeople,String typeRents){
		this.id=id;
        this.nameService = nameService;
        this.Area = Area;
        this.price = price;
        this.maximumPeople = maximumPeople;
        this.typeRents = typeRents;
	}
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
    public String getNameService() {
		return this.nameService;
	}

    public void setNameService(String nameService) {
		this.nameService = nameService;
	}

	public double getArea() {
		return this.Area;
	}

	public void setArea(Double Area) {
		this.Area = Area;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getMaximumPeople() {
		return this.maximumPeople;
	}

	public void setMaximumPeople(int maximumPeople) {
		this.maximumPeople = maximumPeople;
	}

	public String getTypeRents() {
		return this.typeRents;
	}

	public void setTypeRents(String typeRents) {
		this.typeRents = typeRents;
	}

	public abstract void showInfo();

	
	@Override
	public int compareTo(Service o) {
		return this.nameService.compareTo(o.getNameService());
	}


}