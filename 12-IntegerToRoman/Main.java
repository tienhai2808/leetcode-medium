class IntegerToRoman {
  public record RomanPair(int value, String symbol) {}

  public String integerToRoman (int num) {
    RomanPair[] romanMap = new RomanPair[] {
      new RomanPair(1000, "M"),
      new RomanPair(900, "CM"),
      new RomanPair(500, "D"),
      new RomanPair(400, "CD"),
      new RomanPair(100, "C"),
      new RomanPair(90, "XC"),
      new RomanPair(50, "L"),
      new RomanPair(40, "XL"),
      new RomanPair(10, "X"),
      new RomanPair(9, "IX"),
      new RomanPair(5, "V"),
      new RomanPair(4, "IV"),
      new RomanPair(1, "I")
    };

    String result = "";
    for (int i = 0; i < romanMap.length; i++) {
      while (num >= romanMap[i].value) {
        num -= romanMap[i].value;
        result += romanMap[i].symbol;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    IntegerToRoman sol = new IntegerToRoman();
    System.out.println(sol.integerToRoman(3749));
    System.out.println(sol.integerToRoman(58));
    System.out.println(sol.integerToRoman(1994));
  }
}