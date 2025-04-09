package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Camera;
import com.xworkz.Inheritence.internal.Canon;;

public class CameraCast {

        public void quality(Camera camera) {
            camera.quality();
            camera.blur();
            camera.click();
            camera.lens();
            camera.focus();

            if (camera instanceof Canon) {
                Canon canon=new Canon();
                canon.lens();
            }
        }
    }
