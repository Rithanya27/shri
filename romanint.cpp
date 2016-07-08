#include <iostream>
using namespace std;
int main()
{

	int numtoConvert;
	cout << "Enter an integer between 1 and 4000";
	cin >> numtoConvert;
	int th,h,t,o;
	char thousands[] = {"", "M", "MM", "MMM", "MMMM"};
	char hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	char tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	char ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	if (numtoConvert<=4000){
		int romanNumber;
		th = numtoConvert / 1000;
		numtoConvert = numtoConvert % 1000;
		h = numtoConvert % 100;
		t = numtoConvert / 10;
		o = numtoConvert % 10;
		romanNumber = romanNumber + thousands[th] + hundreds[h] + tens[t] + ones[o];
		cout << "The roman number for this integer is " << romanNumber;
	}
	else
	{
		cout << "Invalid number, please enter a new number between 1 and 4000";
		return 0;
	}
}
