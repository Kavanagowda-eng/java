package Acess;

public enum SpaceResearch {

        public void conductResearch(Jail jail, Satellite[] satellites, IdCard idCard, Alien[] aliens, Camera camera) {
            System.out.println("Research conducted at: " + jail.getName());
            System.out.println("Jail Location: " + jail.getLocation());
            System.out.println("Total Cells: " + jail.getTotalCells());

            System.out.println("Satellites in research:");
            for (Satellite s : satellites) {
                System.out.println(" - Type: " + s.getType() + ", Cost: " + s.getCost());
            }

            System.out.println("ID Card designed by: " + idCard.getDesignedBy());

            System.out.println("Aliens observed:");
            for (Alien a : aliens) {
                System.out.println(" - Seen by: " + a.getSeenBy() + ", Description: " + a.getDescribe());
            }

            System.out.println("Camera used: " + camera.getBrand() + " (" + camera.getType() + ")");
        }




