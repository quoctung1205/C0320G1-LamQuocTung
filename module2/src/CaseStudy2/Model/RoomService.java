package CaseStudy2.Model;

public class RoomService extends Service{

    public RoomService(String id, String nameService, double Area, long price, int maximumPeople, String typeRents,String freeService) {
        super(id, nameService, Area, price, maximumPeople, typeRents);
        this.freeService = freeService;
    }

    public RoomService() {
	}

	private String freeService;

    
    public String getFreeService() {
		return this.freeService;
	}

	public void setFreeService(String freeService) {
		this.freeService = freeService;
	}

    @Override
    public void showInfo() {
        System.out.println("Id: " + getId()
		+" Name Service: " + getNameService()
		+" Area: " + getArea()
		+" Price: " + getPrice()
		+" Maximum People: " + getMaximumPeople()
		+" Type rent: " + getTypeRents()
		+" Free Service" + getFreeService());
    }

    
}