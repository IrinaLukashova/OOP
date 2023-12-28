public class HotDrinks extends BottleOfWater{
    private int temperature;

    public HotDrinks(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public String toString(){
        return "HotDrink{" + "name='" + super.getName() +'\'' +
                ", cost=" + super.getCost() +'\''+
                ", volume=" + super.getVolume() +'\''+ ", temperature=" + temperature + '}';
    }
}
