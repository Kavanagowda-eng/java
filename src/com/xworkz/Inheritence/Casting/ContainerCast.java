package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Container;
import com.xworkz.Inheritence.internal.Bottel;

public class ContainerCast {
        public void run(Container container) {
           container.color();
           container.capacity();
           container.empty();
           container.fill();
           container.size();

            if (container instanceof Bottel) {
                Bottel bottel=new Bottel();
               bottel.color();
            }
        }
    }

