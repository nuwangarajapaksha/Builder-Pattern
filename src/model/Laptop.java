/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class Laptop {

    private String brand;
    private String model;
    private int ram;
    private int gpu;
    private String processor;
    private int hddCapacity;
    private double screenSize;
    private boolean wifi;
    private boolean bluetooth;
    private String os;

    public Laptop(String brand, String model, int ram, int gpu, String processor, int hddCapacity, double screenSize, boolean wifi, boolean bluetooth, String os) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.gpu = gpu;
        this.processor = processor;
        this.hddCapacity = hddCapacity;
        this.screenSize = screenSize;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.os = os;
    }

    @Override
    public String toString() {

        String msg = "";
        if (brand != null && !brand.isEmpty()) {
            msg = msg + "Brand: " + brand + "\n";
        }
        if (model != null && !model.isEmpty()) {
            msg = msg + "Model: " + model + "\n";
        }
        if (ram > 0) {
            msg = msg + "RAM: " + ram + "\n";
        }
        if (gpu > 0) {
            msg = msg + "GPU: " + gpu + "\n";
        }
        if (processor != null && !processor.isEmpty()) {
            msg = msg + "Processor: " + processor + "\n";
        }
        if (hddCapacity > 0) {
            msg = msg + "Hard Drive Capacity: " + hddCapacity + "\n";
        }
        if (screenSize > 0.0) {
            msg = msg + "Screen Size: " + screenSize + "\n";
        }
        if (wifi != false) {
            msg = msg + "Wi-Fi: Yes\n";
        }
        if (bluetooth != false) {
            msg = msg + "Bluetooth: Yes\n";
        }
        if (os != null && !os.isEmpty()) {
            msg = msg + "OS: " + os + "\n";
        }

        return msg;
    }

}
