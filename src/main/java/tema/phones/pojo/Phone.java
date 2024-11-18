package tema.phones.pojo;

public class Phone {
	private int id;
	private String name;
	private int yearReleased;
	private String software;
	public Phone(int id, String name, int yearReleased, String software) {
		super();
		this.id = id;
		this.name = name;
		this.yearReleased = yearReleased;
		this.software = software;
	}
	public Phone(String name, int yearReleased, String software) {
		super();
		this.name = name;
		this.yearReleased = yearReleased;
		this.software = software;
	}
	public Phone() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	
}
