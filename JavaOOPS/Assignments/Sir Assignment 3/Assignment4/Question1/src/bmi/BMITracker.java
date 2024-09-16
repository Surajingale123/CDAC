package bmi;



public class BMITracker {
    private float weight; // in kilograms
    private float height; // in meters

    // Default constructor
    public BMITracker() {
        this(0.0f, 0.0f);
    }

    // Parameterized constructor
    public BMITracker(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    // Getter and setter methods
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Calculate BMI
    public float calculateBMI() {
        if (height == 0) return 0; // Avoid division by zero
        return weight / (height * height);
    }

    // Classify BMI
    public String classifyBMI() {
        float bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    @Override
    public String toString() {
        return String.format("Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Classification: %s",
                             weight, height, calculateBMI(), classifyBMI());
    }
}
