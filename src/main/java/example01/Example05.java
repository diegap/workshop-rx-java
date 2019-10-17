package example01;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Example05 {

	public Observable<Integer> merge(int count) {

		return Observable.merge(slowRequest(count), normalRequest(count));
		// TODO
		// Create a code that from the range from 1 to the count
		// returns the merge from the slow request and the normal request
		//throw new UnsupportedOperationException();
	}

	public Observable<Integer> concat(int count) {
		return Observable.concat(slowRequest(count), normalRequest(count));
		// TODO
		// Create a code that from the range from 1 to the count
		// returns the concat from the slow request and the normal request
		// Using first Slow request
		//throw new UnsupportedOperationException();
	}

	private Observable<Integer> slowRequest(int count) {
		return Observable.range(10, count)
				.subscribeOn(Schedulers.io())
				.map(integer -> {
					Thread.sleep(1000);
					return integer;
				});
	}

	private Observable<Integer> normalRequest(int count) {
		return Observable.range(1, count);
	}
}
