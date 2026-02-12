import java.util.Arrays;

class DnDCharacter {

  private int strength;
  private int dexterity;
  private int constitutution;
  private int intelligence;
  private int wisdom;
  private int charisma;
  private int hitpoints;

  public DnDCharacter() {
    strength = ability();
    dexterity = ability();
    constitutution = ability();
    intelligence = ability();
    wisdom = ability();
    charisma = ability();
    hitpoints = 10 + modifier(constitutution);
  }

  int ability() {
    int[] diceRolls = new int[4];

    for (int i = 0; i < 4; i++) {
      diceRolls[i] = (int) (Math.floor(Math.random() * 6) + 1);
    }

    int min = Arrays.stream(diceRolls).min().getAsInt();
    int total = diceRolls[0] + diceRolls[1] + diceRolls[2] + diceRolls[3];

    return total - min;
  }

  int modifier(int input) {
    return (int) Math.floorDiv((input - 10), 2);
  }

  int getStrength() {
    return strength;
  }

  int getDexterity() {
    return dexterity;
  }

  int getConstitution() {
    return constitutution;
  }

  int getIntelligence() {
    return intelligence;
  }

  int getWisdom() {
    return wisdom;
  }

  int getCharisma() {
    return charisma;
  }

  int getHitpoints() {
    return hitpoints;
  }
}
