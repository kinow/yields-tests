package sample.yield;

import com.google.code.jyield.Generator;
import com.google.code.jyield.YieldUtils;
import com.google.code.jyield.Yieldable;

/**
 * Sample class using informancers Yielder library.
 */
public class JavaYieldSample2 {

	public static void main(String[] args) {
		CountForever intGen = new CountForever();

		for (Integer number : YieldUtils.toIterable(intGen)) { 
			System.out.println(number);
		}
	}

}

//com.google.code.jyield.Generator
class CountForever implements Generator<Integer> { // this could be a stoppable generator too

	public void generate(Yieldable<Integer> yieldable) {
		int x = 0;
		while (true) {
			yieldable.yield(x++);
		}

	}

}
