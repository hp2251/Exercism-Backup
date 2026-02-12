class ArmstrongNumbers {
	boolean isArmstrongNumber(int numberToCheck) {
		if(numberToCheck < 0) return false;
		else if(numberToCheck > 0 && numberToCheck < 10) return true;
		else {
			String numberTocheckToString = String.valueOf(numberToCheck);

			int sum = 0, length = numberTocheckToString.length();
			for(int i = 0; i < length; i++) {
				int current = Integer.parseInt(String.valueOf(numberTocheckToString.charAt(i)));
				sum += Math.pow(current, length);
			}

			return sum == numberToCheck;
		}
	}
}