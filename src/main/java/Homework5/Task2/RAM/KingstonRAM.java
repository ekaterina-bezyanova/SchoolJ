package Homework5.Task2.RAM;

public class KingstonRAM implements RAM {
    // производитель, объем памяти, частота, тип памяти.
    String producer;
    int memoryVolume;
    int frequency;
    String memoryType;

    @Override
    public void createRAM(int memoryVolume, int frequency, String memoryType) {
        this.frequency = frequency;
        this.memoryType = memoryType;
        this.memoryVolume = memoryVolume;
        this.producer = "Kingston";
    }
}
