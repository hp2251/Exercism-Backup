class ResistorColorDuo {
  int value(String[] colors) {
    String[] colours = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

    if (colors.length <= 1)
      return -1;
    else {
      String val = "";
      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < colours.length; j++) {
          if (colors[i] == colours[j]) {
            val += j + "";
          }
        }
      }

      return Integer.parseInt(val);
    }
  }
}
