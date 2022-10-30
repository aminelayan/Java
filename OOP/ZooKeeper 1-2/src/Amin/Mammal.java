package Amin;

public class Mammal {
    private int energyLevel;

    public int displayEnergy(){
        int energy=this.getEnergyLevel();
        System.out.println("The energy level of this mammal is: "+energy);
        return energy;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
