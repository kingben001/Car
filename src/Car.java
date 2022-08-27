public class Car {

    private String make;
    private String model;
    private int year;

    public Car(){
        make = "";
        model = "";
        year = 2021;
    }

    public int computeAge(){
        int currentYear = 2021;
        int age = currentYear -year;
        return age;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYear(int newYear) {
        if (newYear >= 1890 && newYear <=2021) {
            year = newYear;
        }
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getMake(){
        return make;
    }
}
