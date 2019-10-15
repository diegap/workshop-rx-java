package example01;

import io.reactivex.Observable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

class Example01 {

    public Observable<String> withJust() {
        throw new NotImplementedException();
    }

    public Observable<String> withFromIterable() {
        List<String> items = Arrays.asList("one", "two", "three");
        throw new NotImplementedException();
    }

    public Observable<String> withFromCallable() {
        throw new NotImplementedException();
    }

    public Observable<String> fromCallbacks() {
        InMemoryStringsRepository repository = new InMemoryStringsRepository();
        throw new NotImplementedException();
    }

    private String getAMessage() {
        return "This is rx-java workshop";
    }
}
