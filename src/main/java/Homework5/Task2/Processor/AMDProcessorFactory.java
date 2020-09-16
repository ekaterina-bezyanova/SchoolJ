package Homework5.Task2.Processor;

public class AMDProcessorFactory extends ProcessorFactory {

    @Override
    public Processor createProcessor(int frequency, int cores, int cache, String name) {
        Processor amdProcessor = new IntelProcessor();
        amdProcessor.createProcessor(frequency, cores, cache, name);
        return amdProcessor;
    }
}
