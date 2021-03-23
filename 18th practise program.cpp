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
#include <cmath>
using namespace std;
 
class check_count
 {
   public:
     int count_plus;
     int count_minus;

     check_count()
     {
       count_plus = 0;
       count_minus = 2;
     };
     void operator ++() { ++count_plus; } // count increment
     void operator --() { --count_minus; } // count increment
 };
int main()
 {
   check_count x, y; //creating objects

   //before increment/decrement
   cout << "x =" << x.count_plus<<"\n";
   cout <<"y =" << y.count_minus<<"\n";

   ++x;
   --y;

   //after increment/decrement
   cout<<"\nAfter increment/decrement\n";
   cout<<"x ="<<x.count_plus<<"\n";
   cout<<"y ="<<y.count_minus<<"\n";
 return 0;
}