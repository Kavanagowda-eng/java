package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Tree;
import com.xworkz.Inheritence.internal.Oak;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.NoOfTrees();
        tree.treeHeight();
        tree.treeName();
        tree.place();
        tree.NoOfTrees();
        System.out.println("--------------------------------");

        Tree tree1=new Oak();
        tree1.treeName();
        tree1.treeAge();
        tree1.treeHeight();
        tree1.place();
        tree1.NoOfTrees();
        System.out.println("--------------------------------");

        Tree tree2=new Oak();
        tree2.treeName();
        tree2.treeAge();
        tree2.treeHeight();
        tree2.place();
        tree2.NoOfTrees();
        System.out.println("--------------------------------");

        Tree tree3=new Oak();
        tree3.treeName();
        tree3.treeAge();
        tree3.treeHeight();
        tree3.place();
        tree3.NoOfTrees();
        System.out.println("--------------------------------");
    }
}

