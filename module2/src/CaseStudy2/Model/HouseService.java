package CaseStudy2.Model;

public class HouseService extends Service{

	private String StandardRoom;
    private String otherFacility;
    private int numberOfFloor;

	public HouseService(String id, String nameService, double Area, long price, int maximumPeople, String typeRents,String StandardRoom,String otherFacility,int numberOfFloor) {
		this.StandardRoom = StandardRoom;
        this.otherFacility = otherFacility;
        this.numberOfFloor = numberOfFloor;
	}
    
    public HouseService() {
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
		+" Number of Floor: " + getNumberOfFloor();
	}


    
}