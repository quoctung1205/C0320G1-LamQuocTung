package CaseStudy2.Model;

public class AccompaniedService {
    private String nameService;
    private int unit;
    private int price;

    public AccompaniedService(){
    }

    public AccompaniedService(String nameService,int unit, int price){
        this.nameService = nameService;
        this.unit = unit;
        this.price = price;
    }
    public String getNameService() {
		return this.nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
	}

	public int getUnit() {
		return this.unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}