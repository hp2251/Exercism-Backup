class ResistorColor {
  int colorCode(String color) {
    String[] colours = colors();

    for (int i = 0; i < colours.length; i++) {
      if (colours[i] == color)
        return i;
    }

    return -1;
  }

  String[] colors() {
    String[] colours = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

    return colours;
  }
}

/*
 * 
 * Black: 0 Brown: 1 Red: 2 Orange: 3 Yellow: 4 Green: 5 Blue: 6 Violet: 7 Grey:
 * 8 White: 9
 * 
 */
