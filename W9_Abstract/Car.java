public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor.
     *
     * @param brand          .
     * @param model          .
     * @param registerNumber .
     * @param owner          .
     * @param numberOfDoors  .
     */
    public Car(String brand, String model, String registerNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registerNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getter.
     *
     * @return info.
     */
    @Override
    public String getInfo() {
        String info = "";
        info += "\n" + "Car:"
                + "\n" + "\tBrand: " + this.brand
                + "\n" + "\tModel: " + this.model
                + "\n" + "\tRegistration Number: " + this.registrationNumber
                + "\n" + "\tNumber of Doors: " + this.numberOfDoors
                + "\n" + "\tBelongs to " + this.getOwner().getName() + " - "
                + this.getOwner().getAddress();
        return info;
    }

    /**
     * getter.
     *
     * @return numberOfDoors.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * numberOfDoors.
     *
     * @param numberOfDoors .
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
