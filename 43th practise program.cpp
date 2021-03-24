#include <iostream>
#include <cmath>
using namespace std;

float calculateSD(float data[]);

int main()
{
    int j;
    float data[10];

    cout << "Enter 10 elements: ";
    for(j = 0; j < 10; ++j)
        cin >> data[j];

    cout << endl << "Standard Deviation = " << calculateSD(data);

    return 0;
}

float calculateSD(float data[])
{
    float sum = 0.0, mean, standardDeviation = 0.0;

    int j;

    for(j = 0; j < 10; ++j)
    {
        sum += data[j];
    }

    mean = sum/10;

    for(j = 0; j < 10; ++j)
        standardDeviation += pow(data[j] - mean, 2);

    return sqrt(standardDeviation / 10);
}
