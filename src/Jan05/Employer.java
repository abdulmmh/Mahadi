
package Jan05;


public class Employer {
    private int id;
    private String name;
    private double capital;

    public Employer(int id, String name, double capital) {
        this.id = id;
        this.name = name;
        this.capital = capital;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Employer{" + "id=" + id + ", name=" + name + ", capital=" + capital + '}';
    }
    
}
