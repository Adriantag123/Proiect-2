package ContainerFactory;

import bag.FIFO;
import bag.IBag;
import bag.LIFO;
import bag.RandomList;

public class BagFactory implements IBagFactory {
	

	@Override
	public IBag makeBag(String type) {
		// TODO Auto-generated method stub
		
		if(type.equals("RANDOM")) {
			return new RandomList();
		}
		
		if(type.equals("FIFO")) {
			return new FIFO();
		}
		
		if(type.equals("LIFO")) {
			return new LIFO();
		}
		
		return null;
	}
	
	

}
