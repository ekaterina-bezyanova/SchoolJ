package Homework5.Task2;

import Homework5.Task2.GraphicAdapter.GraphicAdapter;
import Homework5.Task2.Memory.Memory;
import Homework5.Task2.Processor.Processor;
import Homework5.Task2.RAM.RAM;

public class Computer {

    Processor processor;
    RAM ram;
    GraphicAdapter graphicAdapter;
    Memory memory;

    public Computer(Processor processor, RAM ram, GraphicAdapter graphicAdapter, Memory memory) {
        this.processor = processor;
        this.ram = ram;
        this.graphicAdapter = graphicAdapter;
        this.memory = memory;
    }
}
