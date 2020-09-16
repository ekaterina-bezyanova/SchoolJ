package Homework5.Task2.RAM;

public class KingstonRAMFactory extends RAMFactory {

    @Override
    public RAM createRAM(int memoryVolume, int frequency, String memoryType) {
        RAM kingstonRAM = new KingstonRAM();
        kingstonRAM.createRAM(memoryVolume, frequency, memoryType);
        return kingstonRAM;
    }
}
