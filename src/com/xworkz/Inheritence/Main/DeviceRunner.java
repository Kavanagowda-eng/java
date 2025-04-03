package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Device;
import com.xworkz.Inheritence.internal.Phone;

public class DeviceRunner {
    public static void main(String[]args) {
        Device device = new Device();
        device.call();
        device.message();
        device.playGames();
        device.track();
        device.videoCall();

        Device device1 = new Phone();
        device1.call();
        device1.message();
        device1.playGames();
        device1.track();
        device1.videoCall();

        Device device2 = new Phone();
        device2.call();
        device2.message();
        device2.playGames();
        device2.track();
        device2.videoCall();

        Device device3 = new Phone();
        device3.call();
        device3.message();
        device3.playGames();
        device3.track();
        device3.videoCall();


    }

}
