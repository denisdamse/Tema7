package tema.orders.pojo;

public class Order {
	private int id;
	private String destinationFrom;
	private String destinationTo;
	private int weight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinationFrom() {
		return destinationFrom;
	}
	public void setDestinationFrom(String destinationFrom) {
		this.destinationFrom = destinationFrom;
	}
	public String getDestinationTo() {
		return destinationTo;
	}
	public void setDestinationTo(String destinationTo) {
		this.destinationTo = destinationTo;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Order(int id, String destinationFrom, String destinationTo, int weight) {
		super();
		this.id = id;
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
		this.weight = weight;
	}
	public Order() {
		super();
	}
	public Order(String destinationFrom, String destinationTo, int weight) {
		super();
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
		this.weight = weight;
	}
	
}
