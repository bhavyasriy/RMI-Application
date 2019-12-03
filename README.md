# RMI-Application
RMI application for getting the final total price of the shopping list with some of the following items and quantities chosen by the user from the client side. On the server, the item list contains the prices. As example potatoes Rs. 17 per a 5 kg, tomatoes 8 Rs per kg, onions 20 Rs per 5 kg, and spinach 12 Rs per kg, etc.


Execute the code as follows:

>>javac *.java
>>rmic BillTotalRemote
>>rmiregistry 5000
----------------------------------------------
>>java MyServer
--------------------------------------------------
>>java MyClient
-----------------------------------------------
