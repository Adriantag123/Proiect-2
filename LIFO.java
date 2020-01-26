package bag;

import java.util.ArrayList;
import java.util.Stack;

import Surprise.ISurprise;

public class LIFO implements IBag {
	
	Stack<ISurprise> lifo = new Stack<>();
	
	@Override
	public void put(ISurprise newSurprise) {
		// TODO Auto-generated method stub
		lifo.push(newSurprise);
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		// TODO Auto-generated method stub
		while(bagOfSurprises.size() > 0) {
			this.put(bagOfSurprises.takeOut());
		}
		
	}

	@Override
	public ISurprise takeOut() {
		// TODO Auto-generated method stub
		return lifo.pop();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(lifo.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return lifo.size();
	}
}
