package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.PowerBank;
import com.xworkz.Inheritence.internal.Anker;


public class PowerBankCast {
        public void charge(PowerBank powerBank) {
            powerBank.charge();
            powerBank.type();
            powerBank.connect();
            powerBank.wire();
            powerBank.recharge();

            if (powerBank instanceof Anker) {
                Anker anker=new Anker();
                anker.type();
            }
        }
    }


