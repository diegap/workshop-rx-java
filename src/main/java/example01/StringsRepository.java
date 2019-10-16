package example01;

public class StringsRepository {

    public interface Callback<T> {

        public void onSuccess(T result);

        public void onError(Throwable error);

    }

    public static void getAString(Callback<String> callback) {
        callback.onSuccess("This is a test string");
    }

}
