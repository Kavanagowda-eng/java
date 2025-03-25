public class MobileNumberService {
	public static void main(String[] args) {
		System.out.println(MobileNumberService.getNameFromMobile); 
       MobileNumbers.put("1234567890", "Kavana");
       MobileNumbers.put("2345678901", "sindhu");
       MobileNumbers.put("3456789012", "kavya");
        MobileNumbers.put("4567890123", "darsh");
        MobileNumbers.put("5678901234", "nandi");
       MobileNumbers.put("6789012345", "sagar");
        MobileNumbers.put("7890123456", "Guru");
        MobileNumbers.put("8901234567", "virat");
        mobileNumbers.put("9012345678", "anushka");
        MobileNumbers.put("0123456789", "yash");
        MobileNumbers.put("1122334455", "vasuki");
        MobileNumbers.put("2233445566", "nani");
        MobileNumbers.put("3344556677", "pallavi");
        MobileNumbers.put("4455667788", "harshitha");
        MobileNumbers.put("5566778899", "spoorthy");
        MobileNumbers.put("6677889900", "chandhu");
        MobileNumbers.put("7788990011", "prajwal");
        MobileNumbers.put("8899001122", "rohith");
        MobileNumbers.put("9900112233", "Sameer");
        MobileNumbers.put("1001122334", "divya");
        MobileNumbers.put("2102233445", "Uma");
        MobileNumbers.put("3203344556", "Veeru");
    }

    public static String getNameFromMobile(String mobileNumber) {
        return mobileNumbers.getOrDefault(mobileNumber, "Mobile number not found");
    }
}
