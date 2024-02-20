public class Renalt extends Engine{
    double extraTurboEnergy;

    public Renalt(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double efficiency(){
        return 0.27;
    }

    public double throttleEnergy(){
        return engineVolume * cylinderAmount * 110 + extraTurboEnergy;
    }

    public double breakEnergy(){
        return engineWeight * 2.1 ;}
}
