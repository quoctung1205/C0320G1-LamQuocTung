package CaseStudy2.Model;

public class VillaService extends Service{

    
	private String StandardRoom;
    private String otherFacility;
    private Double poolArea;
	private int numberOfFloor;
	
	public VillaService(){
	}
	
    public VillaService(String id, String nameService, double Area, long price, int maximumPeople, String typeRents,String StandardRoom,String otherFacility,double poolArea,int numberOfFloor) {
		super(id, nameService, Area, price, maximumPeople, typeRents);
		this.StandardRoom = StandardRoom;
        this.otherFacility = otherFacility;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
	}

    public String getStandardRoom() {
		return this.StandardRoom;
	}

	public void setStandardRoom(String StandardRoom) {
		this.StandardRoom = StandardRoom;
	}

	public String getOtherFacility() {
		return this.otherFacility;
	}

	public void setOtherFacility(String otherFacility) {
		this.otherFacility = otherFacility;
	}

	public double getPoolArea() {
		return this.poolArea;
	}

	public void setPoolArea(Double poolArea) {
		this.poolArea = poolArea;
	}

	public int getNumberOfFloor() {
		return this.numberOfFloor;
	}

	public void setNumberOfFloor(int numberOfFloor) {
		this.numberOfFloor = numberOfFloor;
	}

	@Override
	public void showInfo() {
		System.out.println("Id: " + getId()
		+" Name Service: " + getNameService()
		+" Area: " + getArea()
		+" Price: " + getPrice()
		+" Maximum People: " + getMaximumPeople()
		+" Type rent: " + getTypeRents()
		+" Standard Room: " + getStandardRoom()
		+" Other Facility: " + getOtherFacility()
		+" Pool Area: " +getPoolArea()
		+" Number of Floor: " + getNumberOfFloor());
	}

	@Override
	public String toString() {
		return "Id: " + getId()
		+" Name Service: " + getNameService()
		+" Area: " + getArea()
		+" Price: " + getPrice()
		+" Maximum People: " + getMaximumPeople()
		+" Type rent: " + getTypeRents()
		+" Standard Room: " + getStandardRoom()
		+" Other Facility: " + getOtherFacility()
		+" Pool Area: " +getPoolArea()
		+" Number of Floor: " + getNumberOfFloor();
	}
}