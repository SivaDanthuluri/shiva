package practice_Create_table;

public class Cart {
	private int id;
	private String orders;
	private String Status;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Cart(int id, String orders, String status) {
		super();
		this.id = id;
		this.orders = orders;
		Status = status;
	}

	@Override
	public String toString() {
		return "Pojo [id=" + id + ", orders=" + orders + ", Status=" + Status + "]";
	}
	
}
