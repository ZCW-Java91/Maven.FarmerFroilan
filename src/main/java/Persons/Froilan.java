package Persons;

import com.zipcodewilmington.froilansfarm.StorageUnits.CropRows;
import com.zipcodewilmington.froilansfarm.StorageUnits.Pantry;

public class Froilan extends Person implements Botanist, Farmer, Rider{

    int eatenfood=0;
    public Froilan(String name) {
        super(name);
    }

    @Override
    public void plants(CropRows cropRows, Crop crop) {

        cropRows.add(crop);
    }

    @Override
    public void eat(Edible edible) {
        Pantry.remove(edible);
         eatenfood ++;

    }

    @Override
    public void feed(Animal animal, Edible edible) {


    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }
}
