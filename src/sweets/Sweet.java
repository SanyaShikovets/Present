package sweets;

public class Sweet {

    private String name;
    private double weight;

    public Sweet(String name, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Name sweet: " + name + " Weight: " + weight;
    }
}
