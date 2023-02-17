package Modules.Concesionario.Clases;

public abstract class Service implements Comparable<Service> {
	
///////////////ATRIBUTOS////////////////	
	
	private String id;
	private String client_name;
	private String car_type; 
	private String payment_method;
	private int price;
	
//////////////CONSTRUCTOR////////////////	
	
	public Service(String id, String client_name, String car_type, String payment_method, int price) {
		super();
		this.id = id;
		this.price = price;
		this.client_name = client_name;
		this.car_type = car_type;
		this.payment_method = payment_method;
	}
	
	///////// CONTRUCTOR VACIO /////////
	
	public Service() {
	}
	
	/////// CONTRUCTOR CLAVE PRIMARIA /////
	
	public Service(String id) {
		this.id = id;
	}
	
	/////// GETTERS /////////////
	
	public String getid() {
		return id;
	}

	public String getclient_name() {
		return client_name;
	}

	public String getcar_type() {
		return car_type;
	}

	public String getpayment_method() {
		return payment_method;
	}

	public int getprice() {
		return price;
	}
	
	//////// SETTERS //////////
	
	public void setid(String id) {
		this.id = id;
	}

	public void setclient_name(String client_name) {
		this.client_name = client_name;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public void setcar_type(String car_type) {
		this.car_type = car_type;
	}

	public void setpayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	
	public int compareTo(Service param) {// para ordenar los empleados por nombre
		if (this.getid().compareTo(param.getid()) > 0)
			return 1;
		if (this.getid().compareTo(param.getid()) < 0)
			return -1;
		return 0;

	}

	public boolean equals(Object param) {
		return getid().equals(((Service) param).getid());
	}

	public abstract String toString(); 
	
}