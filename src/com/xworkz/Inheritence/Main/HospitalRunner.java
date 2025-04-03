package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Hospital;
import com.xworkz.Inheritence.internal.SpecializedHospital;

public class HospitalRunner {
        public static void main(String[] args) {
            Hospital hospital = new Hospital();
            hospital.admitPatient();
            hospital.provideTreatment();
            hospital.dischargePatient();
            hospital.conductSurgery();
            hospital.issueMedicine();

            Hospital hospital1 = new SpecializedHospital();
            hospital1.admitPatient();
            hospital1.provideTreatment();
            hospital1.dischargePatient();
            hospital1.conductSurgery();
            hospital1.issueMedicine();

            Hospital hospital2 = new SpecializedHospital();
            hospital2.admitPatient();
            hospital2.provideTreatment();
            hospital2.dischargePatient();
            hospital2.conductSurgery();
            hospital2.issueMedicine();

            Hospital hospital3 = new SpecializedHospital();
            hospital3.admitPatient();
            hospital3.provideTreatment();
            hospital3.dischargePatient();
            hospital3.conductSurgery();
            hospital3.issueMedicine();
        }

        }
