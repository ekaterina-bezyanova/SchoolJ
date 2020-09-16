package Homework5.Task2.GraphicAdapter;

public class NVidiaGraphicAdapterFactory extends GraphicAdapterFactory {

    @Override
    public GraphicAdapter createGraphicAdapter(String memoryType, int memoryVolume, String cooling) {
        GraphicAdapter nvidiaGraphicAdapter = new NVidiaGraphicAdapter();
        nvidiaGraphicAdapter.createGraphicAdapter(memoryType, memoryVolume, cooling);
        return nvidiaGraphicAdapter;
    }
}
