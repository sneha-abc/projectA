package com.inheritance;

public class Species {
    String name;
    String habitat;
    int lifespan;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getLifespan() {
        return lifespan;
    }



    public void Endangered()
    {
        System.out.println("Many species are endangered");
    }

}

