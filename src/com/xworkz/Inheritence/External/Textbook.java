package com.xworkz.Inheritence.External;

public class Textbook {
        public Textbook(){
            System.out.println("No args const in Textbook");
        }
        public void read(){
            System.out.println("Read the Textbook");
        }
        public void design(){
            System.out.println("Choose the design of textbook");
        }
        public void write(){
            System.out.println("Write answers on the pencil");
        }
        public void color(){
            System.out.println("Color of textbook");
        }
        public void type(){
            System.out.println("Type the textbook");
        }

    public static class WritingPad {
            public WritingPad(){
                System.out.println("No args const in WritingPad");
            }
            public void use(){
                System.out.println("Use the writingPad");
            }
            public void design(){
                System.out.println("Choose the design of WritingPad");
            }
            public void clean(){
                System.out.println("Clean the writingPad");
            }
            public void color(){
                System.out.println("Color of writingPad");
            }
            public void type(){
                System.out.println("Type the writingPad");
            }
        }
}
