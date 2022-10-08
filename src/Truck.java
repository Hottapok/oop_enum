public class Truck extends Transport {
    private String brand;
    private String model;
    private double engine;
    private Weight weight;

    public Truck(String brand, String model, double engine, Weight weight) {
        super(brand, model, engine);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void typeOfCar() {
        if (weight == null) {
            System.out.println("Данных не достаточно");
        } else {
            String from =weight.getFrom()==null ? "": " от "+weight.getFrom()+" ";
            String to =weight.getTo()==null ? "": " до "+weight.getTo();

            System.out.println("Грузоподъемность авто " + from+to);
        }
    }
}
