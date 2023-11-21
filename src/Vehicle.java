class Vehicle {
    String license_plate;
    String brand;
    String color;

    Vehicle(String c1, String c2, String c3) {
        this.license_plate = c1;
        this.brand = c2;
        this.color = c3;
    }

    public String toString() {
        return "car{" +
                "License :" + license_plate + '\'' +
                "Brand :" + brand + '\'' +
                "Color :" + color + '\'' +
                '}';


    }
}
