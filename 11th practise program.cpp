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
    int fact=1,num,i;
    
    cout << " Enter a number: ";
    cin >> num;
    
    for(i=1; i<=num;i++)
    {
        fact= fact*i;
     
    }
   cout <<" Factorial of" << num <<" is: " << fact;        

    return 0;
}


