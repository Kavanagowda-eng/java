package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Mesh;

public class MeshRunner {
    public static void main(String[]args){
        Mesh mesh=new Mesh();
        mesh.type();
        mesh.design();
        mesh.display();
        mesh.color();
        mesh.put();

        System.out.println("--------------------------------");
    }
}
