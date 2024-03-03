package Startup_Game;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;

    Startup(String n) {
        this.name = n;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    // public void setName(String n) {
    // name = n;
    // }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index > 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println(name + " sunk !!!");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}
