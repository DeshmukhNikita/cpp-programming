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
    int number,rev=0,reminder;
    
    cout <<" Enter a number:";
    cin >> number;
    
    while(number!=0)
    {
        reminder= number%10;
        rev=rev*10+reminder;
        number=number/10;
    }
    cout <<"Reverse number is:"<< rev;
    
    return 0;
        
}
