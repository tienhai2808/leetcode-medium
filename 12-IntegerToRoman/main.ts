const intToRoman = (num: number): string => {
  type RomanPair = {
    value: number;
    symbol: string;
  };

  const romanMap: RomanPair[] = [
    { value: 1000, symbol: "M" },
    { value: 900, symbol: "CM" },
    { value: 500, symbol: "D" },
    { value: 400, symbol: "CD" },
    { value: 100, symbol: "C" },
    { value: 90, symbol: "XC" },
    { value: 50, symbol: "L" },
    { value: 40, symbol: "XL" },
    { value: 10, symbol: "X" },
    { value: 9, symbol: "IX" },
    { value: 5, symbol: "V" },
    { value: 4, symbol: "IV" },
    { value: 1, symbol: "I" },
  ];

  let result: string = "";
  for (let i = 0; i < romanMap.length; i++) {
    while (num >= romanMap[i].value) {
      num -= romanMap[i].value;
      result += romanMap[i].symbol;
    }
  }

  return result 
};

console.log(intToRoman(3749));
console.log(intToRoman(58));
console.log(intToRoman(1994));
