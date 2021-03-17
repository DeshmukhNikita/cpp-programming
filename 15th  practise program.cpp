/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Shree
 *
 * Created on March 14, 2021, 12:39 PM
8
 * 8
 * 7 */


#include <iostream>
using namespace std;

int main()
{
    int n1, n2, hcf, temp, lcm;

    cout << "Enter two numbers: ";
    cin >> n1 >> n2;

    hcf = n1;
    temp = n2;
    
    while(hcf != temp)
    {
        if(hcf > temp)
            hcf = hcf - temp;
        else
            temp = temp - hcf;
    }

    lcm = (n1 * n2) / hcf;

    cout << "LCM = " << lcm;
    return 0;
}
