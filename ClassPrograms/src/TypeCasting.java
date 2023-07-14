public class TypeCasting {

	public static void main(String[] args) {
		
		boolean myBoolean = true;

		char myChar = myBoolean ? 'T' : 'F';  // Assigns 'T' if myBoolean is true, 'F' if false
		byte myByte = myBoolean ? (byte) 1 : (byte) 0;  // Assigns 1 if myBoolean is true, 0 if false
		short myShort = myBoolean ? (short) 1 : (short) 0;  // Assigns 1 if myBoolean is true, 0 if false
		int myInt = myBoolean ? 1 : 0;  // Assigns 1 if myBoolean is true, 0 if false
		long myLong = myBoolean ? 1L : 0L;  // Assigns 1 if myBoolean is true, 0 if false
		float myFloat = myBoolean ? 1.0f : 0.0f;  // Assigns 1.0 if myBoolean is true, 0.0 if false
		double myDouble = myBoolean ? 1.0 : 0.0;  // Assigns 1.0 if myBoolean is true, 0.0 if false
		boolean myNewBoolean = myBoolean;  // No casting needed, directly assigns the value

		System.out.println("boolean to char : " + myChar);
		System.out.println("boolean to byte : " +myByte);
		System.out.println("boolean to short : " +myShort);
		System.out.println("boolean to int : " +myInt);
		System.out.println("boolean to long : " +myLong);
		System.out.println("boolean to float : " +myFloat);
		System.out.println("boolean to double : " +myDouble);
		System.out.println("boolean to newBoolean : " +myNewBoolean);
	}

}
