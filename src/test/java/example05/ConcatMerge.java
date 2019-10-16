package example05;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import example01.Example05;
import io.reactivex.observers.TestObserver;

public class ConcatMerge {

	private int count = 5;

	@Test
	public void merge() {
		TestObserver<List<Integer>> testObserver = new TestObserver<>();
		Example05 example04 = new Example05();

		example04.merge(count).toList().subscribe(testObserver);

		testObserver.assertComplete().assertValues(Lists.newArrayList(1,2,3,4,5,10,11,12,13,14));
	}

	@Test
	public void concat() {
		TestObserver<List<Integer>> testObserver = new TestObserver<>();
		Example05 example04 = new Example05();

		example04.concat(count).toList().subscribe(testObserver);

		testObserver.assertValues(Lists.newArrayList(10,11,12,13,14,1,2,3,4,5));
	}
}
