4.4 A Holistic counter in Servlet
---------------------------------
In this program we are going to make a such a servlet which will count the number of times it has been accessed and the number of threads created by the server.
In this example firstly we are going to create one class named as HolisticCounterInServlet. Now declare a variable counter of int with initial value 0, the value of this counter will be different for each servlet and create a Hashtable object. This object will be shared by all the threads in the container. Inside the doGet() method use the method getWriter() method of the response object which will return the PrintWriter object. 
![1](https://cloud.githubusercontent.com/assets/16949393/13034839/d4275b96-d366-11e5-9fff-10540189bd1e.png)
![2](https://cloud.githubusercontent.com/assets/16949393/13034840/d42d9858-d366-11e5-8d1d-ba0b860553f1.png)
