
public class ParkingTicketDemo {
   public static void main(String[] args) {
      
     	//Create some parked cars
    	//ParkedCar(make, model, color, license)
      ParkedCar car1 = new ParkedCar("Honda","Civic","Blue","CLD 123");
     
      //create some meters and park a couple cars
      //ParkingMeter(); creates meter with no car and no minutes
      //ParkingMeter(car); parks a car but does not pay meter
      //ParkingMeter(car, minutes); parks car and adds time to meter
      ParkingMeter m = new ParkingMeter(car1);
      
      //create some officers to patrol the parking meters
      //PoliceOfficer(name, badge number);
      PoliceOfficer officer1 = new PoliceOfficer("Sheriff of Nottingham", 9876);
       
      //time goes by
      m.setElapsedTime(200);
      
      //send officers out on patrol to issue tickets
      if(officer1.isExpired(m))
        System.out.println("\n**Parking Violation**\n"+ officer1.issueTicket(m));
      
   }
}
