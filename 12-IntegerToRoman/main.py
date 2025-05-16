from typing import List, Tuple

class Solution:
  def int_to_roman(self, num: int) -> str:
    roman_map: List[Tuple[int, str]] = [
      (1000, "M"),
      (900, "CM"),
      (500, "D"),
      (400, "CD"),
      (100, "C"),
      (90, "XC"),
      (50, "L"),
      (40, "XL"),
      (10, "X"),
      (9, "IX"),
      (5, "V"),
      (4, "IV"),
      (1, "I")
    ]
    
    result: str = ""
    for value, symbol in roman_map:
      while num >= value:
        num -= value
        result += symbol
    
    return result
  
s = Solution()
print(s.int_to_roman(3749))
print(s.int_to_roman(58))
print(s.int_to_roman(1994))