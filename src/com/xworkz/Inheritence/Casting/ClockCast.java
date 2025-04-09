package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Clock;
import com.xworkz.Inheritence.internal.Casio;

public class ClockCast {

        public void lens(Clock clock) {
            clock.type();
            clock.lens();
            clock.quality();
            clock.duration();
            clock.color();


            if (clock instanceof Casio) {
                Casio casio = new Casio();
                casio.color();
            }
        }
    }

