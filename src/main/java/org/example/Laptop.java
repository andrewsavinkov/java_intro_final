package org.example;

    public class Laptop{
        String name;
        String model;
        String serialNumber;
        int ram;
        int hdd;
        String os;
        String color;
        int price;

        @Override
        public String toString() {
            return String.format("name:%s,\nmodel:%s,\nserialNr:%s,\nRAM:%d,\nHDD:%d,\nOS:%s,\nColor:%s,\nPrice:%d", name, model, serialNumber, ram, hdd, os, color, price);
        }
    }

