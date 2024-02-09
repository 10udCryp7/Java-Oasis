public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * constructor.
     *
     * @param brand              .
     * @param model              .
     * @param registrationNumber .
     * @param owner              .
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * info.
     *
     * @return info.
     */
    public abstract String getInfo();

    /**
     * transfer.
     *
     * @param newOwner .
     */
    public void transferOwnership(Person newOwner) {
        owner.removeVehicle(this.getRegistrationNumber());
        this.setOwner(newOwner);
        newOwner.addVehicle(this);
    }

    /**
     * brand.
     *
     * @return brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * brand.
     *
     * @param brand .
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * model.
     *
     * @return model.
     */
    public String getModel() {
        return model;
    }

    /**
     * model.
     *
     * @param model .
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * register.
     *
     * @return register.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * setter.
     *
     * @param registrationNumber .
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * owner.
     *
     * @return owner.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * setter.
     *
     * @param owner .
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
