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
   
   int no1,no2;
   
   cout <<" Enter two numbers:";
   cin >> no1 >> no2;
   
   while(no1!=no2){
       if(no1>no2)
       {
           no1=no1-no2;
       }
       else{
           no2= no2-no1;
       }  
   }
  cout <<" GCD " << no1;
    
    return 0;
}


