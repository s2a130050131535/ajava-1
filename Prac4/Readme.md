4.2 Displaying Date in Servlet
------------------------------
In this example we are going to show how we can display a current date and time on our browser. It is very easy to display it on our browser by using the Date class of the java.util package.
![1](https://cloud.githubusercontent.com/assets/16949393/13034822/1878a2f6-d366-11e5-96b6-0d55c4f43e44.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034823/196be07e-d366-11e5-9cf7-a6130200e5c7.png)

4.4 A Holistic counter in Servlet
---------------------------------
In this program we are going to make a such a servlet which will count the number of times it has been accessed and the number of threads created by the server.
In this example firstly we are going to create one class named as HolisticCounterInServlet. Now declare a variable counter of int with initial value 0, the value of this counter will be different for each servlet and create a Hashtable object. This object will be shared by all the threads in the container. Inside the doGet() method use the method getWriter() method of the response object which will return the PrintWriter object. 
![1](https://cloud.githubusercontent.com/assets/16949393/13034839/d4275b96-d366-11e5-9fff-10540189bd1e.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034840/d42d9858-d366-11e5-8d1d-ba0b860553f1.png)

4.8 Dice Roller
---------------
We are going to make one program on the dice roller in which the number in the dice will be selected randomly.
To make a program over this firstly we need to make a class DiceRoller in which we will have a doGet() method in which we will have our application logic. To make the dice working randomly use the random() method of the class java.lang.Math. To print the number on the browser call the method getWriter() of the response object which will return the PrintWriter object. Now by the object of the PrintWriter class print the values of the dice on the browser. 
![1](https://cloud.githubusercontent.com/assets/16949393/13034864/2f71e020-d367-11e5-9220-ec25624d8f47.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034863/2f6b6ce0-d367-11e5-8118-fd68eebf59e2.png)

4.12 Time Updater in Servlet
----------------------------
In this program we are going to make one program on servlet which will keep on updating the time in every second and the result will be displayed to you.
To make this servlet firstly we need to make a class named TimeUpdater.  The name of the class should be such that it becomes easy to understand what the program is going to do. Call the method getWriter() method of the response object which will return a PrintWriter object. Use the method getHeader() of the response object to add a new header. We can also use setHeader() in place of getHeader(). The setHeader() method overrides the previous set header. Now by using the PrintWriter object display the result on the browser.
![1](https://cloud.githubusercontent.com/assets/16949393/13034886/884d8a64-d367-11e5-8e33-e4ce6d84c618.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034887/8bd9041a-d367-11e5-9d04-431b0bfbe355.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13034888/8e73aca2-d367-11e5-8ae2-3e0693c0d63f.png)
![4](https://cloud.githubusercontent.com/assets/16949393/13034890/949da4b6-d367-11e5-8030-3252cb1e5062.png)

4.13 Send Redirect in Servlet
-----------------------------
When we want that someone else should handle the response of our servlet, then there we should use sendRedirect() method.
In send Redirect whenever the client makes any request it goes to the container, there the container decides whether the concerned servlet can handle the request or not. If not then the servlet decides that the request can be handle by other servlet or jsp. Then the servlet calls the sendRedirect() method of the response object and sends back the response to the browser along with the status code. Then the browser sees the status code and look for that servlet which can now handle the request. Again the browser makes a new request, but with the name of that servlet which can now handle the request and the result will be displayed to you by the browser. In all this process the client is unaware of the processing.
In this example we are going to make one html in which we will submit the user name and his password. The controller will check if the password entered by the user is correct or not. If the password entered by the user is correct then the servlet will redirect the request to the other servlet which will handle the request. If the password entered by the user is wrong then the request will be forwarded to the html form.
![1](https://cloud.githubusercontent.com/assets/16949393/13034886/884d8a64-d367-11e5-8e33-e4ce6d84c618.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034887/8bd9041a-d367-11e5-9d04-431b0bfbe355.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13034888/8e73aca2-d367-11e5-8ae2-3e0693c0d63f.png)
![4](https://cloud.githubusercontent.com/assets/16949393/13034890/949da4b6-d367-11e5-8030-3252cb1e5062.png)

4.16 Session Last Accessed Time Example
---------------------------------------
This example illustrates to find current  access time of session  and last access time of session. Sessions are used to maintain state and user identity across multiple page requests. An implementation of HttpSession represents the server's view of the session. The server considers a session to be new until it has been joined by the client. Until the client joins the session, isNew() method returns true.

![1](https://cloud.githubusercontent.com/assets/16949393/13380656/f87ff824-de6d-11e5-8ad7-717626888573.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380657/fa15b19c-de6d-11e5-8e6e-a89bddc77d18.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13380658/fb154332-de6d-11e5-9877-1b209b6b0107.png)

practical 4.19
-----------------------------------------------

![1](https://cloud.githubusercontent.com/assets/16949393/13380675/61f4a6a6-de6e-11e5-95be-46bfeeadc596.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380676/6260deb6-de6e-11e5-9c03-0b81033994b9.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13380677/631007b0-de6e-11e5-922c-827a1fadffa2.png)

practical 4.20
----------------------------------------------------

![1](https://cloud.githubusercontent.com/assets/16949393/13380685/af90cb24-de6e-11e5-9815-8cb202da57a9.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380686/b0ab232e-de6e-11e5-9399-0d52601c359e.png)

practical 4.21
--------------------------------------------------------

![1](https://cloud.githubusercontent.com/assets/16949393/13380701/17fd5f24-de6f-11e5-81c9-d43af2aecc20.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380705/1cad32d8-de6f-11e5-9251-47119e4f225f.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13380708/24811308-de6f-11e5-8c9d-2306dd035aeb.png)

practical 4.22
---------------------------------------------------------

![1](https://cloud.githubusercontent.com/assets/16949393/13380719/661f89ac-de6f-11e5-9106-3080ebb5db2e.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380720/67279fa6-de6f-11e5-9b1d-0888014baf27.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13380721/68538be2-de6f-11e5-909b-50a4a4d0a6dd.png)

practical4.23
---------------------------------------------------------

![1](https://cloud.githubusercontent.com/assets/16949393/13380743/d13be7da-de6f-11e5-88ff-c6678471f550.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13380744/d15e9c6c-de6f-11e5-85ee-ac2407de2db6.png)
![3](https://cloud.githubusercontent.com/assets/16949393/13380745/d1ede188-de6f-11e5-9951-f8c4c08e7974.png)
