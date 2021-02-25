# Megaventory Mini App

A simple app to demonstrate Megaventory's API.

## About
This project is written in Java and all it does is just simple HTTP calls to Megaventory's API. The model consists of 6 entities: 
* Product  
* Client  
* Warehouse  
* Tax  
* Discount  
* Sale

The "controller" is the class *APICalls.java*, and it does the HTTP POST calls to the API.  
The "frontend" is a Java main function, which is intializing the Objects and calling the controller's functions.

You can see the flow of the app below: 

![Flow](Diagrams/Flow.png)

### Σχετικά Project

Υπάρχει ένα project στο CV μου το οποίο αφορά ένα web app σε Spring (Spring boot app Java), αν και είναι λίγο πιο πολύπλοκο και πιο δομημένο.  
Σχετικό [link][1].

[1]: https://github.com/PanagiotisNtymenos/OMDb-API-Web-Design "OMDb SpringBoot App"
