package Modules.Concesionario.Clases;

public class Vinyl extends Service {
	
///////////////ATRIBUTOS////////////////	
	
	private String vinyl_color;
	
//////////////CONSTRUCTOR////////////////
	
	public Vinyl(String id, String client_name, String car_type, String payment_method, int price, String vinyl_color) {
		super(id, client_name, car_type, payment_method, price);
		
		this.vinyl_color = vinyl_color;
	}
	
///////// CONTRUCTOR VACIO /////////
	
	public Vinyl() {
		super();
	}
	
	/////// CONTRUCTOR CLAVE PRIMARIA /////
	
	public Vinyl(String id) {
		super(id);
	}
	
	/////// GETTERS /////////////
	
	public String getvinyl_color() {
		return vinyl_color;
	}
	
	//////// SETTERS //////////
	
	public void setvinyl_color(String vinyl_color) {
		this.vinyl_color = vinyl_color;
	}
	
	public String toString() {
		
		return "Venta/sale:" + "\n" + "ID =" + getid() + 
				"\n" + "Nombre del cliente / Client name =" + getclient_name() + 
				"\n" + "Tipo de coche / Car tipe =" + getcar_type() + 
				"\n" + "Método de pago / Paymentmethod =" + getpayment_method() + 
				"\n" + "Precio / Price =" + getprice() +
				"\n" + "Color del vinilo / Vinyl color =" + getvinyl_color();
	}

}