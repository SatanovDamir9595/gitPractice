import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Damir {

	public static void main(String[] args) {
	
	HopHey me = new HopHey();
	me.setName("Damir");
	me.setSurname("Satanov");
	
	HopHey sveta = new HopHey();
	sveta.setName("Svetlana");
	sveta.setSurname("Burlachuk");
		
		List <HopHey> users = new ArrayList<HopHey>();
		users.add(me);
		users.add(sveta);
		
		System.out.println(HopHey.searchList(users, "Damir", "Satanov"));
		}
	
}

