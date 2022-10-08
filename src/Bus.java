public class Bus extends Transport {
    private String brand;
    private String model;
    private double engine;
    private Capacity capacity;

    public Bus(String brand, String model, double engine,Capacity capacity) {
        super(brand, model, engine);
        this.capacity=capacity;
    }

    @Override
    public void typeOfCar() {
        if (capacity == null) {
            System.out.println("Данных не достаточно");
        } else {

            System.out.println("Вместимость " + capacity.getFrom()+capacity.getTo());
        }
    }


}
