package sample.yield;

import com.google.code.jyield.Generator;
import com.google.code.jyield.YieldUtils;
import com.google.code.jyield.Yieldable;
import com.google.code.jyield.utils.Range;


/**
 * Sample class using informancers Yielder library. 
 */
public class JavaYieldSample {

	public static void main(String[] args) {
		//com.google.code.jyield.utils.Range
		Range range = new Range(0, 5);
		//for(int number : range) {
		//	System.out.println(number);
		//}
		
		IntegerGenerator intGen = new IntegerGenerator(range);
		
		for(Integer number : YieldUtils.toIterable(intGen)) {
			System.out.println(number);
		}
	}
	
}

// com.google.code.jyield.Generator
class IntegerGenerator implements Generator<Integer> {

	//com.google.code.jyield.utils.Range
	private Range range;

	public IntegerGenerator(Range range) {
		this.range = range;
	}
	
	public void generate(Yieldable<Integer> yieldable) {
		for(Integer number : range) {
			yieldable.yield(number);
		}
	}
	
}
