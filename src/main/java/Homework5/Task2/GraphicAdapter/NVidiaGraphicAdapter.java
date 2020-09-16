package Homework5.Task2.GraphicAdapter;

public class NVidiaGraphicAdapter implements GraphicAdapter {
    //производитель, тип памяти, объем памяти, охлаждение(активное или пассивное).
    String producer;
    String memoryType;
    int memoryVolume;
    String cooling;

    @Override
    public void createGraphicAdapter(String memoryType, int memoryVolume, String cooling) {
        this.cooling = cooling;
        this.memoryType = memoryType;
        this.memoryVolume = memoryVolume;
        this.producer = "NVidia";
    }
}
