package example03;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import example01.Example03;
import io.reactivex.observers.TestObserver;

public class FilterMap {

	private int count =  5;

	@Test
	public void filterOddNumbers() {
		TestObserver<List<Integer>> testObserver = new TestObserver<>();
		Example03 example01 = new Example03();

		example01.filterOddNumbers(count).toList().subscribe(testObserver);

		testObserver.assertValues(Lists.newArrayList(1, 3, 5));
	}

	@Test
	public void duplicateNumbers() {
		TestObserver<List<Integer>> testObserver = new TestObserver<>();
		Example03 example01 = new Example03();

		example01.duplicate(count).toList().subscribe(testObserver);

		testObserver.assertValues(Lists.newArrayList(2, 4, 6, 8, 10));
	}
}

