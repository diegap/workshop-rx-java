package example01;

public class InMemoryStringsRepository implements StringsRepository {
    @Override
    public void getAString(Callback<String> callback) {
        callback.onSuccess("This is a test string");
    }
}
