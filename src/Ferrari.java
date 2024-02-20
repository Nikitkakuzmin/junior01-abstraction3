public class Ferrari extends Engine {
    public Ferrari(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public double efficiency(){
        return 0.25;
    }

    public double throttleEnergy(){
        return engineVolume * cylinderAmount * 100;
    }

    public double breakEnergy(){
        return engineWeight * 2;
    }
}




