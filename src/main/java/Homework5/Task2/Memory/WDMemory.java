package Homework5.Task2.Memory;

public class WDMemory implements Memory {
    int volume;
    String type;
    String formFactor;
    String producer;

    @Override
    public void createMemory(int volume, String type, String formFactor) {
        this.formFactor = formFactor;
        this.type = type;
        this.volume = volume;
        this.producer = "WD";
    }
}
