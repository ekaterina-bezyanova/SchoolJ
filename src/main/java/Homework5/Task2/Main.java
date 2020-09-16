package Homework5.Task2;

import Homework5.Task2.GraphicAdapter.GraphicAdapterType;
import Homework5.Task2.Memory.MemoryType;
import Homework5.Task2.Processor.ProcessorType;
import Homework5.Task2.RAM.RAMType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Для того чтобы добавить процессор Intel введите INTEL, для процессора AMD - AMD");
        Scanner sc1 = new Scanner(System.in);
        ProcessorType processorType = ProcessorType.valueOf(sc1.nextLine());

        System.out.println("Для того чтобы добавить ОП Kingston введите KINGSTON");
        Scanner sc2 = new Scanner(System.in);
        RAMType ramType = RAMType.valueOf(sc2.nextLine());

        System.out.println("Для того чтобы добавить видеокарту NVIDIA введите NVIDIA");
        Scanner sc3 = new Scanner(System.in);
        GraphicAdapterType graphicAdapterType = GraphicAdapterType.valueOf(sc3.nextLine());

        System.out.println("Для того чтобы добавить накопитель WD введите WD");
        Scanner sc4 = new Scanner(System.in);
        MemoryType memoryType = MemoryType.valueOf(sc4.nextLine());

        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.create(processorType, ramType, graphicAdapterType, memoryType);
    }
}
