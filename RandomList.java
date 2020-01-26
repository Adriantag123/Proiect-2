package bag;

import java.util.ArrayList;
import java.util.Random;

import Surprise.ISurprise;

public class RandomList implements IBag {

		ArrayList<ISurprise> randomList = new ArrayList<>();

		@Override
		public void put(ISurprise newSurprise) {
			// TODO Auto-generated method stub
			randomList.add(newSurprise);
		}

		@Override
		public void put(IBag bagOfSurprises) { // 
			// TODO Auto-generated method stub
			while(bagOfSurprises.size() > 0) {
				this.put(bagOfSurprises.takeOut()); // extrage elemente din lista si le adauga in lista curenta (this)
			}
		}

		@Override
		public ISurprise takeOut() {
			// TODO Auto-generated method stub
			Random r = new Random();
			int n = r.nextInt(randomList.size());
			
			ISurprise surprise = randomList.get(n);
			
			randomList.remove(surprise);
			
			return surprise;
		
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			if(randomList.size() > 0) {
				return true;
			} 
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return randomList.size();
		}
}
