package Modules.Concesionario.Clases;

public class Rent extends Service {
	
///////////////ATRIBUTOS////////////////	
	
	private String duration_type;
	private int duration_time;
	
//////////////CONSTRUCTOR////////////////
	
	public Rent(String id, String client_name, String car_type, String payment_method, int price, String duration_type, int duration_time) {
		super(id, client_name, car_type, payment_method, price);
		
		this.duration_type = duration_type;
		this.duration_time = duration_time;
	}
	
///////// CONTRUCTOR VACIO /////////
	
	public Rent() {
		super();
	}
	
	/////// CONTRUCTOR CLAVE PRIMARIA /////
	
	public Rent(String id) {
		super(id);
	}
	
	/////// GETTERS /////////////
	
	public String getduration_type() {
		return duration_type;
	}
	
	public int getduration_time() {
		return duration_time;
	}
	
	//////// SETTERS //////////
	
	public void setduration_type(String duration_type) {
		this.duration_type = duration_type;

	}	
		
	public void setduration_time(int duration_time) {
		this.duration_time = duration_time;
	}
	
	public String toString() {
		
		return "Venta/sale:" + "\n" + "ID = " + getid() + 
				"\n" + "Nombre del cliente / Client name = " + getclient_name() + 
				"\n" + "Tipo de coche / Car tipe = " + getcar_type() + 
				"\n" + "Método de pago / Paymentmethod = " + getpayment_method() + 
				"\n" + "Precio / Price = " + getprice() +
				"\n" + "Tipo de duración / Duration type = " + getduration_type() +
				"\n" + "Duración total / Total duration = " + getduration_time();
	}

}