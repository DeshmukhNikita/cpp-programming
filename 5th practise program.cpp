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
    
    int num;
    cout << " Enter the value of number: ";
    cin >> num;
    if(num%2==0)
    {
        cout<< " number is even";
    }
    else
    {
        
        cout << " number is odd";
    }
   
    return 0;
}

