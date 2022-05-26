public class VeredaGT3000 implements Vehicle{
    public String matricula;
    public int maxEnergy;
    public float energy;
    public int movementCount = 0;
    public int energyDelta;

    public VeredaGT3000(String matricula, int energy, int energyDelta) {
        this.matricula = matricula;
        this.energy = energy;
        this.energyDelta = energyDelta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public int getEnergyDelta() {
        return energyDelta;
    }

    public void setEnergyDelta(int energyDelta) {
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = maxEnergy;
    }

    @Override
    public void move() {
        energy = energy - energyDelta;
        movementCount = movementCount+1;
    }

    @Override
    public String status() {
        return "El vehículo <"+ matricula + "> tiene un nivel de carga de: <" + energy + "> y se ha movido <" + movementCount + "> veces";
    }

}
