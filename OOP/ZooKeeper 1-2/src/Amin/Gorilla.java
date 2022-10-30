package Amin;

public class Gorilla extends Mammal {
    private int energyLevel=100;

    @Override
    public int displayEnergy() {
        int energy=getEnergyLevel();
        System.out.println("The Energy Level of Gorilla "+energy);
        return energy;
    }

    @Override
    public void setEnergyLevel(int energyLevel) {
        super.setEnergyLevel(energyLevel);
    }

    public int throwSomething() {
        System.out.println("The gorilla has thrown something");
        int loseEnergy = 5;
        int allEnergy = super.getEnergyLevel() - loseEnergy;
        setEnergyLevel(allEnergy);
        return allEnergy;
    }

    public int eatBananas() {
        int gainEnergy=10;
        int allEnergy=super.getEnergyLevel()+gainEnergy;
        System.out.println("The Gorilla has eaten Bananas");
        setEnergyLevel(allEnergy);
        return allEnergy;
    }

    public int climb() {
        int loseEnergy=10;
        int allEnergy=super.getEnergyLevel()-loseEnergy;
        System.out.println("The Gorilla Has Climbed a tree");
        setEnergyLevel(allEnergy);
        return allEnergy;
    }

}
