**note** Prgramming language: JAVA **note**

This is a simulation of a shop inventory.
A UML diagram was made from the problem description.

Learning Outcome:
-Learned to design a solution from a problem description from a client.
-Learned to implement a UML diagram(design) to make an application.
-Improved understanding of class relationships.

Problem Description:
A small retail shop that sells toolsrequires an application to manage inventory of different types
of tools it sells. The store owner wants to be able to modify the store’s inventory by adding new tools, and deleting
tools. The owner also wants to be able to search the inventory for tools by tool name, and by tool id.
Currently, the information about tools available in  the  shop and  suppliers is stored  in two text files which are given
items.txt, and suppliers.txt.The order and type of data given in these files are:
items.txt:(id; description or name of tool; quantity in stock; price; supplier id number)
Suppliers.txt:  (id; company name; address; sales contact)
The owner would also like to check the quantity of each item in stock. 
If the quantity of each item in stock goes below 40 items,then the program should automatically generate an order line for that item. 
The order line will have the supplier information and the required quantity for
that item(The default quantity ordered byeach item = 50 –number of existing items).
All items ordered each day should be included in an order which has a randomly generated 5-digit id,
and the date that was ordered.