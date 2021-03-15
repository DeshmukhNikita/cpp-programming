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
    
    int a,b,c;
    cout << " Ente the value of a:";
    cin >> a;
     cout << " Ente the value of b:";
    cin >> b;
     cout << " Ente the value of c:";
    cin >> c;
    if(a>b)
    {
        cout << a << " is a Largest number";
        
    }
    else if(b>c)
        {
        cout << b << " is a Largest number";
        
    }
    else
    {
        cout << c << " is a Largest number";
        
    }
        
        
    return 0;
}

