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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("not null");
        }
        if (obj instanceof Lake) {
            Lake lake1 = this;
           Lake lake2= (Lake) obj;
            if (lake1.area== lake2.area && lake1.depth== lake2.depth) {
                return true;
            }
        }
        return false;
}
}
