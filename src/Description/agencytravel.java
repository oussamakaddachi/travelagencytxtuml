package Description;

import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Row;
import travelagency.x.model.Agency;
import travelagency.x.model.Airlains;
import travelagency.x.model.Car;
import travelagency.x.model.Costumer;
import travelagency.x.model.Hotel;
import travelagency.x.model.Login;
import travelagency.x.model.Register;
import travelagency.x.model.Reserv;
import travelagency.x.model.Reservation_details;
import travelagency.x.model.Restaurant;

class agencytravel extends ClassDiagram {

	
	
	@Row({Agency.class,Costumer.class})
	
	@Row({Register.class,Login.class,Reserv.class})
	@Row({Reservation_details.class})
	@Row({Airlains.class , Hotel.class,Car.class,Restaurant.class})
	
	class L  extends Layout{}
}

