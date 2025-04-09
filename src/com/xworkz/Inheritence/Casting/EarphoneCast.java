package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Earphone;
import com.xworkz.Inheritence.internal.Bluetooth;

public class EarphoneCast {
        public void device(Earphone earphone) {
            earphone.device();
            earphone.connect();
            earphone.mobile();
            earphone.share();
            earphone.purchase();

            if (earphone instanceof Bluetooth ) {
                 Bluetooth bluetooth = new Bluetooth();
                bluetooth.color();
            }
        }
    }

