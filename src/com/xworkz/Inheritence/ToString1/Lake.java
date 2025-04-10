package com.xworkz.Inheritence.ToString1;

public class Lake {
        private String area;
        private int depth;
        private boolean hasFish;

        public Lake(String area, int depth, boolean hasFish) {
            this.area = area;
            this.depth = depth;
            this.hasFish = hasFish;
        }

        @Override
        public String toString() {
            return "Lake: area=" + area + ", depth=" + depth + ", hasFish=" + hasFish;
        }
    @Override
    public int hashCode() {
        return 93;}
}
