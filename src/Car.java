public class Car extends Transport {
    private double engine;
    private String brand;
    private String model;
    private TypeOfBody type;

    public Car(String brand, String model, double engine, TypeOfBody type) {
        super(brand, model, engine);
        this.type = type;

    }

    public TypeOfBody getType() {
        return type;
    }

    public void setType(TypeOfBody type) {
        this.type = type;
    }

    @Override
    public void typeOfCar() {
        if (type == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Тип  кузова " + type);
        }
    }
}
