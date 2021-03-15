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
    
    int a,b;
    cout << " Enter the value of a: ";
    cin >> a;
    cout << " Enter the value of b: ";
    cin >> b;
    
    a=a+b;
    b=a-b;
    a=a-b;
          
  cout << "\n after swapping a is:"<< a;
  cout << "\n after swapping b is:"<< b;
    
   
    return 0;
}

