package web.model;

public class Car {
    private String model;
    private String seriez;
    private float maxSpeed;

    public Car() {
    }

    public Car(String model, String seriez, float maxSpeed) {
        this.model = model;
        this.seriez = seriez;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriez() {
        return seriez;
    }

    public void setSeriez(String seriez) {
        this.seriez = seriez;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
