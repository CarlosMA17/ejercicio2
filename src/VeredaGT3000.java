public class VeredaGT3000 implements Vehicle{
    public String matricula;
    public int maxEnergy;
    public float energy;
    public int movementCount = 0;
    public int energyDelta;

    public VeredaGT3000(String matricula, int maxEnergy, int energy, int energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.energyDelta = energyDelta;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
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
        if (energy == maxEnergy){
            System.out.println("no se puede cargar mas energia");
        } else {

            energy = maxEnergy;
        }
    }

    @Override
    public void move() {
        if (energy == 0) {
            System.out.println("la nave no tiene energia para moverse");
        } else {

            energy = energy - energyDelta;
            movementCount = movementCount + 1;
        }
    }

    @Override
    public String status() {
        return "El vehículo <"+ matricula + "> tiene un nivel de carga de: <" + energy + "> y se ha movido <" + movementCount + "> veces";
    }

}
