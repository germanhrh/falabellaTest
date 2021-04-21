PROJECT TEST AUTOMATED FALABELLA
===============================
Content
-------

1.  Summary project
2.  Test scenarios
3.  Non-functional system requirements
4.  Autor



Summary project
-------------------------------
This is a project that contains the tests proposed by the falabella company, this uses the Serenity bdd framework integrated with cucumber. The Gherkin language is used as for the documentation of test cases, the Cucumber library that is included within the Serenity framework for natural language interpretation and the ScreenPlay design pattern that internally uses the PageObject design pattern.





Test scenarios
-----------------------
|Functionality name|Test case name|Description|Expected result|
|:----------------:|:-------------:|:-----------:|:-------------:|
|ResumenCompra|Search falabella in gogle|Given a costumer that want search falabella page in google|The costumer can open falabella page.|
|ResumenCompra|Search product in falabella page|The costumer can interact whit searh bar of falabella page|The costumer can search a product in the falabella page|
|ResumenCompra|select and add product to car shop|Validate that it is the costumer can add a product to the shopping car |The shopping car have a product inside|
|ResumenCompra|select and add producto insurance|Validate that the costumer can add a insurance to the product|The product have a insurance|
|ResumenCompra|Validate ResumenCompra|Validate that the total value in the resumen is equals to the sum of product value and insurance |The sum of product value and the insurance is equals to the value in falabella resumen page|


Reports of the tests executed
-----------------------
In this session we are going to observe where to find the evidence of the last execution and its respective results.


##### Path in the project

./target/site/serenity/index.html


Non-functional system requirements
--------------
- gradle 6.8
- Java 1.8
- Google chrome with version 89.0.4389.90
- Windows 8 or higher operating system


Autor
------------
&copy; German Rivera