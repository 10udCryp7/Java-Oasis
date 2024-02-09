public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor.
     *
     * @param brand          .
     * @param model          .
     * @param registerNumber .
     * @param owner          .
     * @param hasSidecar     .
     */
    public MotorBike(String brand, String model, String registerNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registerNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * getter.
     *
     * @return info.
     */
    @Override
    public String getInfo() {
        String info = "";
        info += "\n" + "Motor Bike:"
                + "\n" + "\tBrand: " + this.brand
                + "\n" + "\tModel: " + this.model
                + "\n" + "\tRegistration Number: " + this.registrationNumber
                + "\n" + "\tHas Side Car: " + this.hasSidecar
                + "\n" + "\tBelongs to " + this.getOwner().getName() + " - "
                + this.getOwner().getAddress();
        return info;
    }

    /**
     * boolean.
     *
     * @return hasSideCar.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * setter.
     *
     * @param hasSidecar .
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
