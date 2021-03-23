#include <iostream>
using namespace std;

int main()
{
    double a,b,multiplication;
    cout << "Enter two numbers: ";

    // Stores two floating point numbers in variable firstNumber and secondNumber respectively
    cin >> a >> b;
 
    // Performs multiplication and stores the result in variable productOfTwoNumbers
    multiplication=a*b;
    cout << "Product = " << multiplication;    
    
    return 0;
}