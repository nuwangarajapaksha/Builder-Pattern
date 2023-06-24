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
public class LaptopBuilder {

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

    public LaptopBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setGpu(int gpu) {
        this.gpu = gpu;
        return this;
    }

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
        return this;
    }

    public LaptopBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public LaptopBuilder setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public LaptopBuilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public LaptopBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    
    public Laptop getLaptop(){
        return  new Laptop(brand, model, ram, gpu, processor, hddCapacity, screenSize, wifi, bluetooth, os);
    }

}
