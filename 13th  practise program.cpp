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

#include <cstdlib>
#include<iostream>

using namespace std;

int main() {
    int num1=0,num2=1,num3,i, number;
    
    cout << " Enter a number: ";
    cin >> number;
    cout << num1 <<" "<<num2<<" ";
   
    for(i=2;i<number;i++)
    {
        num3= num1+num2;
        cout << num3 <<" ";
        num1=num2;
        num2=num3;
    }
    
    
    return 0;
}


