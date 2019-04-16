# Sorting-Numbers
Project to sort given array numbers

How to Run:

1)Checkout the project and execute "mvn spring-boot:run" on parent folder.

2)Open the URL http://localhost:8080.

3)Enter the numbers seperated by comma in the input box and click Sort.

4)Open the URL http://localhost:8080/h2-console/ to check the data saved in DB

5)Interpret the result "time taken" in milliseconds and Position changed as the number and number of positions changed in brackets. eg. 1(2). Here the input 1 had changed 2 positions.
If the number of positions changed is positive then it had advanced in position else it went down in position.

Limitations:
The change in position will be accurate only for non-duplicate input array of numbers
