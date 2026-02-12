class NaturalNumber {
  private int number;

  NaturalNumber(int _number) {
    if(_number < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    number = _number;
  }

  Classification getClassification() {
    int sum = 0;

    for (int i = 1; i < number; i++) {
      if(number % i == 0) {
        sum += i;
      }
    }

    if(sum == number) return Classification.PERFECT;
    else if(sum > number ) return Classification.ABUNDANT;
    else return Classification.DEFICIENT;
  }

}
