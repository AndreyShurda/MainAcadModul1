package com.shurda.andrey.Lab2_7;

/**
 * Create classes:
 * 1) Base class Device (manufacturer(String), price(float), serialNumber(String));
 * 2) Subclasses Monitor (resolutionX(int), resolutionY(int))
 * and EthernetAdapter(speed (int), mac (String));
 * Add getters/setters and constructor to each class
 */
public class Device {
    private String manufacturer;
    private double price;
    private String serialNumber;

    public Device(String manufacturer, double price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;

        if (!getManufacturer().equals(device.getManufacturer()) ||
                getPrice() != device.getPrice() ||
                !getSerialNumber().equals(device.getSerialNumber())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + getManufacturer().hashCode();
        long price = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int)(price ^ (price >>> 32));
        result = 31 * result + getSerialNumber().hashCode();

        return result;
    }
}
