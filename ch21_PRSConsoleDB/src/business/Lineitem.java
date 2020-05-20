package business;

public class Lineitem {
	int id;
	int requestId;
	int productId;
	int quanitity;
	
	// fully loaded constructor
	public Lineitem(int id, int requestId, int productId, int quanitity) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.productId = productId;
		this.quanitity = quanitity;
	}

	//empty constructor
	public Lineitem() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(int quanitity) {
		this.quanitity = quanitity;
	}

	//toString
	@Override
	public String toString() {
		return "Lineitem [id=" + id + ", requestId=" + requestId + ", productId=" + productId + ", quanitity="
				+ quanitity + "]";
	}
	
	
	
	

}
