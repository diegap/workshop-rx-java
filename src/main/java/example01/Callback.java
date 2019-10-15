package example01;

public interface Callback<T> {

    public void onSuccess(T result);

    public void onError(Throwable error);

}
