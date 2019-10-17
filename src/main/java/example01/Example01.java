package example01;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

class Example01 {

    public Observable<String> withJust() {
        return Observable.just("Aworded", "Trivia Crack", "Pictionary");
        // TODO
        // Create an observable using Observable.just() that returns the following strings:
        // "Aworded", "Trivia Crack", "Pictionary"
        //throw new UnsupportedOperationException();
    }

    public Observable<String> withFromIterable() {
        // TODO
        // Create an observable using Observable.fromIterable() that returns the following strings:
        // "Java", "Kotlin", "C#"
        List<String> items = Arrays.asList("Java", "Kotlin", "C#");
        return Observable.fromIterable(items);
        //throw new UnsupportedOperationException();
    }

    public Observable<String> withFromCallable() {
        // TODO
        // Create an observable using Observable.fromCallable() using MessageProvider class
        // Use MessageProvider.getAMessage()
        return Observable.fromCallable(MessageProvider::getAMessage);
    }

    public Observable<String> fromCallbacks() {
        // TODO
        // Create an observable using Observable.create() based on a callback call
        // Use StringsRepository.getAString()
        return Observable.create(emitter -> StringsRepository.getAString(new StringsRepository.Callback<String>() {
            @Override
            public void onSuccess(String result) {
                emitter.onNext(result);
                emitter.onComplete();
            }

            @Override
            public void onError(Throwable error) {
                emitter.onError(error);
            }
        }));
    }

}
