package example01;

import com.google.common.collect.FluentIterable;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Example05 {

	public Observable<Integer> merge(int count) {
		// TODO
		// Create a code that from the range from 1 to the count
		// returns the merge from the slow request and the normal request
		throw new NotImplementedException();
	}

	public Observable<Integer> concat(int count) {
		// TODO
		// Create a code that from the range from 1 to the count
		// returns the concat from the slow request and the normal request
		throw new NotImplementedException();
	}

	private Observable<Integer> slowRequest(int count) {
		return Observable.range(10, count).map(integer -> {
			Thread.sleep(1000);
			return integer;
		});
	}

	private Observable<Integer> normalRequest(int count) {
		return Observable.range(1, count);
	}
}
