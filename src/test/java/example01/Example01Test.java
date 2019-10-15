package example01;

import io.reactivex.observers.TestObserver;
import org.junit.Test;

public class Example01Test {

    @Test
    public void observableCreationWithJust() {
        TestObserver<String> testObserver = new TestObserver<>();
        Example01 example01 = new Example01();

        example01.withJust().subscribe(testObserver);

        testObserver.assertValues("one", "two", "three");
        testObserver.assertComplete();
    }

    @Test
    public void observableCreationWithFromIterable() {
        TestObserver<String> testObserver = new TestObserver<>();
        Example01 example01 = new Example01();

        example01.withFromIterable().subscribe(testObserver);

        testObserver.assertValues("one", "two", "three");
        testObserver.assertComplete();
    }

    @Test
    public void observableCreationWithFromCallable() {
        TestObserver<String> testObserver = new TestObserver<>();
        Example01 example01 = new Example01();

        example01.withFromCallable().subscribe(testObserver);

        testObserver.assertValue("This is rx-java workshop");
        testObserver.assertComplete();
    }

    @Test
    public void observableCreationFromCallbacks() {
        TestObserver<String> testObserver = new TestObserver<>();
        Example01 example01 = new Example01();

        example01.fromCallbacks().subscribe(testObserver);

        testObserver.assertValue("This is a test string");
        testObserver.assertComplete();
    }
}
