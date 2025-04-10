package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Camera;

public class CameraRun {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 20, true);
        System.out.println(camera);
        System.out.println(camera.hashCode());
        System.out.println("Original:"+System.identityHashCode(camera));
        System.out.println("-------------------------");
    }
}
