package example01;

import io.reactivex.Observable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

class Example01 {

    public Observable<String> withJust() {
        // TODO
        // Create an observable using Observable.just() that returns the following strings:
        // "Aworded", "Trivia Crack", "Pictionary"
        throw new NotImplementedException();
    }

    public Observable<String> withFromIterable() {
        // TODO
        // Create an observable using Observable.fromIterable() that returns the following strings:
        // "Java", "Kotlin", "C#"
        List<String> items = Arrays.asList("Java", "Kotlin", "C#");
        throw new NotImplementedException();
    }

    public Observable<String> withFromCallable() {
        // TODO
        // Create an observable using Observable.fromCallable() using MessageProvider class
        MessageProvider.getAMessage();
        throw new NotImplementedException();
    }

    public Observable<String> fromCallbacks() {
        InMemoryStringsRepository repository = new InMemoryStringsRepository();
        throw new NotImplementedException();
    }

}
