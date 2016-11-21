package Description;

import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import travelagency.x.model.Login;

public class costlogin extends StateMachineDiagram<Login> {
	
@Column({Login.init.class,Login.waitforid.class,Login.waitforpd.class,Login.complete.class})
//@Column({Login.finish.class})

class L extends Layout{}
}
