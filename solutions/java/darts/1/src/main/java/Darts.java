class Darts {
  double x, y;

  Darts(double x, double y) {
    this.x = x;
    this.y = y;
  }

  int score() {
    double distance = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
    if (distance > 10.0) return 0;
    else if (distance > 5.0) return 1;
    else if (distance > 1.0) return 5;
    else if (distance >= 0.0) return 10;

    return -1;
  }

}
