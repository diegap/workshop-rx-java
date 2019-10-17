package example01;

import java.util.Map;

import com.google.common.collect.Maps;

import io.reactivex.Observable;

public class Example04 {

	public Observable<String> findLocalizations(int count) {
		return Observable.range(1, count).flatMap(this::translateNumber);
		// TODO
		// Create a code that from the range from 1 to the count
		// returns the text for each number using the function
		// translateNumber
		//throw new UnsupportedOperationException();
	}

	private Observable<String> translateNumber(int number) {
		Map<Integer, String> keys = getKeys();
		return Observable.fromCallable(() -> keys.getOrDefault(number, "other number"));
	}

	private Map<Integer, String> getKeys() {
		Map<Integer, String> keys = Maps.newHashMap();
		keys.put(1, "one");
		keys.put(2, "two");
		keys.put(3, "three");
		keys.put(4, "four");
		keys.put(5, "five");
		return keys;
	}
}
