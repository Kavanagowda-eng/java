package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Hostel;
import com.xworkz.Inheritence.internal.ModernHostel;

public class HostelRunner {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        hostel.provideAccommodation();
        hostel.offerMeals();
        hostel.maintainCleanliness();
        hostel.provideSecurity();
        hostel.offerCommonFacilities();

        Hostel hostel1 = new ModernHostel();
        hostel1.provideAccommodation();
        hostel1.offerMeals();
        hostel1.maintainCleanliness();
        hostel1.provideSecurity();
        hostel1.offerCommonFacilities();

        Hostel hostel2 = new ModernHostel();
        hostel2.provideAccommodation();
        hostel2.offerMeals();
        hostel2.maintainCleanliness();
        hostel2.provideSecurity();
        hostel2.offerCommonFacilities();

        Hostel hostel3 = new ModernHostel();
        hostel3.provideAccommodation();
        hostel3.offerMeals();
        hostel3.maintainCleanliness();
        hostel3.provideSecurity();
        hostel3.offerCommonFacilities();

    }
}

