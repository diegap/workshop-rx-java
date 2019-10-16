package example04;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

import example01.Example04;
import io.reactivex.observers.TestObserver;

public class FlatMap {

	private int count = 5;

	@Test
	public void localizeNumbers() {
		TestObserver<List<String>> testObserver = new TestObserver<>();
		Example04 example04 = new Example04();

		example04.findLocalizations(count).toList().subscribe(testObserver);

		testObserver.assertValues(Lists.newArrayList("one", "two", "three", "four", "five"));
	}
}
