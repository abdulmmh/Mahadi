
package Jan06.thirdTask;

import Jan06.secondTask.Address;


public class Trainee {
    private int id;
    private Address address;

    public Trainee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Trainee Details: " + "ID = " + id + ", " + address;
    }
    
}
