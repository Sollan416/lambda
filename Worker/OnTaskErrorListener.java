package Netology.Java_Core.Lamda.Worker;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError (String result);
}