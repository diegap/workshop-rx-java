package example01;

import io.reactivex.Observable;

public class Example03 {

    public Observable<Integer> filterOddNumbers(int count) {
        // TODO
        // Create a code that from the range from 1 to the count
        // returns only odd numbers
        return Observable.range(1, count).filter(num -> num % 2 != 0);
    }

    public Observable<Integer> duplicate(int count) {
        // TODO
        // Create a code that from the range from 1 to the count
        // return each number duplicated (x2)
        //throw new UnsupportedOperationException();
        return Observable.range(1, count).map(num -> num * 2);
    }
}
