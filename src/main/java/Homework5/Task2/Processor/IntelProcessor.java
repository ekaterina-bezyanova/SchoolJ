package Homework5.Task2.Processor;

public class IntelProcessor implements Processor {

    int frequency = 0;
    int cores = 0;
    int cache = 0;
    String name = "";
    String producer = "";

    @Override
    public void createProcessor(int frequency, int cores, int cache, String name) {
        this.frequency = frequency;
        this.cores = cores;
        this.cache = cache;
        this.name = name;
        this.producer = "Intel";
    }
}
