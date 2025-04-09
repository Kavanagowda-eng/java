package com.xworkz.Inheritence.Casting;
import com.xworkz.Inheritence.External.Athlete;
import com.xworkz.Inheritence.internal.Sports;

public class AthleteCast {
    public void run(Athlete athlete) {
        athlete.run();
        athlete.fit();
        athlete.rules();
        athlete.type();
        athlete.workout();

        if (athlete instanceof Sports) {
            Sports sports = new Sports();
            sports.color();
        }
    }
}