package Homework5.Task2.Processor;

public class IntelProcessorFactory extends ProcessorFactory {

    @Override
    public Processor createProcessor(int frequency, int cores, int cache, String name) {
        Processor intelProcessor = new IntelProcessor();
        intelProcessor.createProcessor(frequency, cores, cache, name);
        return intelProcessor;
    }
}
