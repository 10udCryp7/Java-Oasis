import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * constructor.
     *
     * @param name    .
     * @param address .
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add.
     *
     * @param vehicle .
     */
    public void addVehicle(Vehicle vehicle) {
        boolean check = true;
        for (Vehicle vehicleOwned : vehicleList) {
            if (vehicle.getRegistrationNumber()
                    .equals(vehicleOwned.getRegistrationNumber())) {
                check = false;
                break;
            }
        }
        if (check) {
            this.vehicleList.add(vehicle);
        }
    }

    /**
     * remove.
     *
     * @param registrationNumber .
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getRegistrationNumber(),
                    registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * getter.
     *
     * @return info.
     */
    public String getVehiclesInfo() {
        String info = "";
        if (vehicleList.size() == 0) {
            return this.getName() + " has no vehicle!";
        } else {
            info += "\n" + this.getName() + " has:" + "\n";
            for (Vehicle vehicle : vehicleList) {
                info += vehicle.getInfo();
            }
        }
        return info;
    }

    /**
     * getter.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * setter.
     *
     * @param name .
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter.
     *
     * @return address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter.
     *
     * @param address add.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
