package Amin;

public class Bat extends Mammal {
    private int enegryLevel=300;

    @Override
    public int displayEnergy() {
        int energy=getEnergyLevel();
        System.out.println("The Energy Level of Bat "+energy);
        return energy;
    }

    @Override
    public void setEnergyLevel(int energyLevel) {
        super.setEnergyLevel(energyLevel);
    }

    public int fly(){
        System.out.println("The Bat is Taking Off");
        int loseEnergy = 50;
        int allEnergy = enegryLevel - loseEnergy;
        setEnergyLevel(allEnergy);
        return allEnergy;
    }
    public int eatHumans() {
        int gainEnergy=25;
        int allEnergy=enegryLevel+gainEnergy;
        System.out.println("The Bat ate A human");
        setEnergyLevel(allEnergy);
        return allEnergy;
    }
    public int attackDown(){
        System.out.println("The Town is Down");
        int loseEnergy = 100;
        int allEnergy = enegryLevel - loseEnergy;
        setEnergyLevel(allEnergy);
        return allEnergy;
    }

}
