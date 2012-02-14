package sample.yield;

import java.util.Arrays;
import java.util.List;

import com.infomancers.collections.yield.Yielder;

/**
 * Sample class using informancers Yielder library. 
 */
public class YielderSample {

	public static void main(String[] args) {
				
		final List<Integer> numbers = Arrays.asList(1, 2, 3);
		
		Yielder<Integer> myYielder = new Yielder<Integer>() {
			
			@Override
			protected void yieldNextCore() {
				for(Integer number : numbers) {
					yieldReturn(number);
				}
				yieldBreak();
			}
			
		};
		
		for(Integer number : myYielder) {
			System.out.println(number); 
		}
		
		// Nothing is printed
		// Probably due to some problem reg/ code instrumentation
	}
	
}
