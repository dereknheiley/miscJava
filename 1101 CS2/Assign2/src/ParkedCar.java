
public class ParkedCar {

	private String make;
	private String model;
	private String color;
	private String licenseNum;
	
	//constructors
	public ParkedCar(){
		make = "null";
		model = "null";
		color = "null";
		licenseNum = "null";
	}
	public ParkedCar(String make, String mod, String col, String lic){
		this.make = make;
		model = mod;
		color = col;
		licenseNum = lic;
	}
	
	//set methods not needed for this application
	//get methods
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public String getLicenseNum() {
		return licenseNum;
	}

	public String toString(){
		if (make.equals("null"))
			return "null";
		return "Make: "+make+"\tModel: "+model+
				"\nColor: "+color+"\tLicense Number: "+licenseNum;
	}
}
