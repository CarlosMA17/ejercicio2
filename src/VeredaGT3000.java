public class VeredaGT3000 implements Vehicle{
    public String matricula;
    public int maxEnergy;
    public float energy;
    public int movementCount = 0;
    public int energyDelta;

    public VeredaGT3000(String matricula, int maxEnergy, int energy, int movementCount, int energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.movementCount = movementCount;
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        return 0;
    }

    @Override
    public void recharge() {

    }

    @Override
    public void move() {

    }

    @Override
    public String status() {
        return null;
    }
}
