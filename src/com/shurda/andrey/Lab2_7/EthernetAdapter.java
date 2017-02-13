package com.shurda.andrey.Lab2_7;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, double price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter ethAdpt = (EthernetAdapter) o;

        if (getSpeed() != ethAdpt.getSpeed() ||
                !getSerialNumber().equals(ethAdpt.getSerialNumber())) return false;
        return true;

    }
    @Override
    public String toString() {
        return super.toString() +
                "speed=" + speed +
                ", mac=" + mac ;
    }
}
