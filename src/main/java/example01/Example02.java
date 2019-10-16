package example01;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Example02 {

	public Disposable singleElement() {
		return Observable.range(1, 10)
                .subscribeOn(Schedulers.computation())
                .map(integer -> integer * 10)
				.flatMap(integer ->
                        Observable.fromCallable(() -> {
                            System.out.println("el numero es " + integer);
                            return integer;
                        })
                )
                .observeOn(Schedulers.single())
				.subscribe();
	}
}
