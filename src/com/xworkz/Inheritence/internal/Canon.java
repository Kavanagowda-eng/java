package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Camera;

public class Canon extends Camera {
    public Canon(){
        super();
        System.out.println("No args const in Canon");
    }

    @Override
    public void lens() {
        super.lens();
    }

    @Override
    public void quality() {
        super.quality();
    }

    @Override
    public void blur() {
        super.blur();
    }

    @Override
    public void click() {
        super.click();
    }

    @Override
    public void focus() {
        super.focus();
    }

}
