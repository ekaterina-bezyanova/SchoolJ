package Homework5.Task2.Processor;

import Homework5.Task2.Processor.Processor;

public abstract class ProcessorFactory {
    public abstract Processor createProcessor(int frequency, int cores, int cache, String name);
}
