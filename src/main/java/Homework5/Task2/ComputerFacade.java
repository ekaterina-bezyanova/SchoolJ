package Homework5.Task2;

import Homework5.Task2.GraphicAdapter.*;
import Homework5.Task2.Memory.*;
import Homework5.Task2.Processor.*;
import Homework5.Task2.RAM.*;

public class ComputerFacade {

    public Computer create(ProcessorType processorType, RAMType ramType, GraphicAdapterType graphicAdapterType, MemoryType memoryType) {

        ProcessorFactory processorFactory = null;
        switch (processorType) {
            case INTEL:
                processorFactory = new IntelProcessorFactory();
                break;
            case AMD:
                processorFactory = new AMDProcessorFactory();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        Processor processor = processorFactory.createProcessor(3600, 4, 14, "i7");

        RAMFactory ramFactory = null;
        switch (ramType) {
            case KINGSTON -> ramFactory = new KingstonRAMFactory();
        }
        RAM ram = ramFactory.createRAM(12, 1200, "ram");

        GraphicAdapterFactory graphicAdapterFactory = null;
        switch (graphicAdapterType) {
            case NVIDIA -> graphicAdapterFactory = new NVidiaGraphicAdapterFactory();
        }
        GraphicAdapter graphicAdapter = graphicAdapterFactory.createGraphicAdapter("integrated", 123, "active");

        MemoryFactory memoryFactory = null;
        switch (memoryType) {
            case WD -> memoryFactory = new WDMemoryFactory();
        }
        Memory memory = memoryFactory.createMemory(1234, "SSD", "2.5");

        return new Computer(processor, ram, graphicAdapter, memory);
    }
}
