package main

import "fmt"

func intToRoman(num int) string {
	type RomanPair struct {
		Value  int
		Symbol string
	}

	romanMap := []RomanPair{
		{1000, "M"},
		{900, "CM"},
		{500, "D"},
		{400, "CD"},
		{100, "C"},
		{90, "XC"},
		{50, "L"},
		{40, "XL"},
		{10, "X"},
		{9, "IX"},
		{5, "V"},
		{4, "IV"},
		{1, "I"},
	}

	result := ""
	for i := 0; i < len(romanMap); i++ {
		for num >= romanMap[i].Value {
			num -= romanMap[i].Value
			result += romanMap[i].Symbol
		}
	}

	return result
}

func main() {
	fmt.Println(intToRoman(3749))
	fmt.Println(intToRoman(58))
	fmt.Println(intToRoman(1994))
}
