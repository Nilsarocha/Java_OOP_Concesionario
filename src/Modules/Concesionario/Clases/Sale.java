package Modules.Concesionario.Clases;

public class Sale extends Service {
	
///////////////ATRIBUTOS////////////////	
	
	private String payment_type;
	
//////////////CONSTRUCTOR////////////////
	
	public Sale(String id, String client_name, String car_type, String payment_method, int price, String payment_type) {
		super(id, client_name, car_type, payment_method, price);
		
		this.payment_type = payment_type;
	}
	
///////// CONTRUCTOR VACIO /////////
	
	public Sale() {
		super();
	}
	
	/////// CONTRUCTOR CLAVE PRIMARIA /////
	
	public Sale(String id) {
		super(id);
	}
	
	/////// GETTERS /////////////
	
	public String getpayment_type() {
		return payment_type;
	}
	
	//////// SETTERS //////////
	
	public void setpayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	
	public String toString() {
		
		return "Venta/sale:" + "\n" + "ID = " + getid() + 
				"\n" + "Nombre del cliente / Client name = " + getclient_name() + 
				"\n" + "Tipo de coche / Car tipe = " + getcar_type() + 
				"\n" + "Método de pago / Paymentmethod = " + getpayment_method() + 
				"\n" + "Precio / Price = " + getprice() +
				"\n" + "Método de pago / Payment type = " + getpayment_type();
	}

}