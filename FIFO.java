package bag;

import java.util.LinkedList;
import java.util.Queue;

import Surprise.ISurprise;

public class FIFO implements IBag {
	
	Queue <ISurprise> fifo = new LinkedList<>();
	
	

	@Override
	public void put(ISurprise newSurprise) {
		// TODO Auto-generated method stub
		fifo.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		// TODO Auto-generated method stub
		while(bagOfSurprises.isEmpty()) { // fun fact :)
			this.put(bagOfSurprises.takeOut());
		}
	}

	@Override
	public ISurprise takeOut() {
		// TODO Auto-generated method stub
		if(fifo.size() > 0) {
			return fifo.remove();
		}
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(fifo.size() > 0){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return fifo.size();
	}

}
