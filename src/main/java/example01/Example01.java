package example01;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

class Example01 {

    public Observable<String> withJust() {
        // TODO
        // Create an observable using Observable.just() that returns the following strings:
        // "Aworded", "Trivia Crack", "Pictionary"
        throw new UnsupportedOperationException();
    }

    public Observable<String> withFromIterable() {
        // TODO
        // Create an observable using Observable.fromIterable() that returns the following strings:
        // "Java", "Kotlin", "C#"
        List<String> items = Arrays.asList("Java", "Kotlin", "C#");
        throw new UnsupportedOperationException();
    }

    public Observable<String> withFromCallable() {
        // TODO
        // Create an observable using Observable.fromCallable() using MessageProvider class
        // Use MessageProvider.getAMessage()
        MessageProvider.getAMessage();
        throw new UnsupportedOperationException();
    }

    public Observable<String> fromCallbacks() {
        // TODO
        // Create an observable using Observable.create() based on a callback call
        // Use StringsRepository.getAString()
        throw new UnsupportedOperationException();
    }

}
