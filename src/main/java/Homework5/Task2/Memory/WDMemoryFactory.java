package Homework5.Task2.Memory;

public class WDMemoryFactory extends MemoryFactory {

    @Override
    public Memory createMemory(int volume, String type, String formFactor) {
        Memory wdMemory = new WDMemory();
        wdMemory.createMemory(volume, type, formFactor);
        return wdMemory;
    }
}
