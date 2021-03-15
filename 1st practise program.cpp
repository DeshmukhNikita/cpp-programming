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
 */

#include <cstdlib>
#include<iostream>

using namespace std;

int main() {
    int a,b,ans;
    cout << "Enter the value of a:";
    cin >>a;
    cout << "Enter the value of b:";
    cin >>b;
    ans= a+b;
    cout <<" \n Addition is"<< ans ;
    ans= a-b;
    cout <<" \n substraction is :"<< ans;
    ans= a*b;
    cout <<" \n Multiplication is :"<< ans;
    ans= a/b;
    cout <<" \n division is :"<< ans;
    

    return 0;
}

