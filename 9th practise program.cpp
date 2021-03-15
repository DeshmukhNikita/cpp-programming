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
    
    int num, sum, i;
  
    cout << " enter the numbers:";
    cin >> num;
    
    for(i=0;i<= num;i++)
        
    sum = sum +i;
    
    cout <<" sum of natural number is: " << sum;
    
        
    return 0;
}

