package Netology.Java_Core.Lamda.Worker;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}