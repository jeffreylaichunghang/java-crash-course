/*
 * Nested Class: static || non-static
 *
 */

class CPU {
    double price;

    class Processor {
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }

        double getCpuPrice() {
            return CPU.this.price;
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

class MotherBoard {

    /* Static nested class */
    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {
            return usb2 + usb3;
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // ? outer class
        // CPU cpu = new CPU();
        // ? inner class: create an inner class using the outer class
        // CPU.Processor processor = cpu.new Processor();
        // CPU.RAM ram = cpu.new RAM();

        // System.out.println("Processor Cache = " + processor.getCache());
        // System.out.println("Ram Clock speed = " + ram.getClockSpeed());
        // System.out.println(processor.getCpuPrice());

        MotherBoard.USB usb = new MotherBoard.USB();
        /* nested class doesn't require you to create an instance of the outer class */
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}
