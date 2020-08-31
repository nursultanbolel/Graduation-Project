# Graduation Project

It is a web application that bank customers can share their Turkish complaints and bank employees can see and deal with the customer complaints. These compliants(text) are classified by departments(credit card, credit, account,..) using deep learning model. We developed a GRU model which was trained Turkish dataset(labelled 40 thousand line) was created by us and accuracy of model is 95%. Our model runs on VPS(Virtual Private Server) using Flask framewrok. After classification of customer’s complaints, a bank employee can see the classified complaints. In our project there are four parts which are database service, web application, deep learning model for classifying complaints and simple chatbot.

## Database Service

We used MySQL database, Maven, Spring Boot, Hibernate frameworks. In this part our main goal is to create a Restful service to use database transactions. DatabaseBackUp file includes an example of database

 ![entity relationship diagram](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/ERD.png)

If you want to use this part: 

 Step 1: Set up MySQL. <br>
 Step 2: Configure MySQL settings in application.properties file according to your database. <br>
 Step 3: Run ``` $ mvn spring-boot:run``` <br>

Usage: 
You can see some screenshots Get and Post Requests for users in Postman.

###### Get All kullanici <br>
 ![Get All kullanici](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/getAllKullanicilar.png)
 
###### Get By Id kullanici <br>
 ![Get By Id kullanici](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/getByIdKullanicilar.png)
 
###### Add kullanici <br>
 ![Add kullanici](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/addKullanicilar.png)
 
###### Update kullanici <br>
 ![Update kullanici](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/updateKullanicilar.png)
 
 ###### Delete kullanici <br>
 ![Delete kullanici](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/deleteKullanicilar.png)
 
## User Interface

We used Angular 9 framework. You can see all pages in the app.

![Home Page ](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/homePage.png) <br>
![All Complaints ](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/allComplaintsPage.png) <br>
![Banks Statistics ](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/bankStatistics.png) <br>
![Detailed Complaints-1](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/detailedComplaint_1.png) <br>
![Detailed Complaints-2](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/detailedComplaint_2.png) <br>
![Detailed Complaints-3](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/detailedComplaint_3.png) <br>
![Detailed Complaints-bank_employee](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/detailedComplaint_bank_employee.png) <br>
![Sharing Complaints-1](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/enterComplaintPage.png) <br>
![Sharing Complaints-2](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/enterComplaintPage_2.png) <br>
![Log In](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/logInPage.png) <br>
![Sign Up](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/signUp.png) <br>

## Deep Learning Model

We developed a GRU model which was trained Turkish dataset(labeled 40377 lines) was created by us and accuracy of model is 95%. Our model runs on VPS(Virtual Private Server) using Flask framework. We used this model to classify complaint by departments (kredi, kredi katı, bankamatik, hesap, müşteri hizmetleri) in complaint sharing page in the web app. We used stopword list, you can find [there](https://github.com/ahmetax/trstop).

###### Hyper Parameters

- Training samples: 90% train + 10% test = 40377 lines
- Learning Rate: 0,01
- Epoch: 3
- Batch Size: 128
- Activation Functions: softmax
- Dropout: 20%
- Number of Hidden Layer and Units: GRU(100)+GRU(100)
- Loss functions: categorical_crossentropy
- Optimizer: Adam

![Deep Learning model layers](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/modelLayers.png) <br>
![Deep Learning model accuracy graph](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/GRU_graph.png) <br>

If you want to use this part:
- Step 1: download required packages.
- Step 2: configure server address and port number in app.py
```
if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
```
- Step 3: Run ``` $ python app.py```

Usage:

You can see spyder console screen when the deep learning model running on local server. <br>
![Deep Learning model running on server](https://github.com/nursultanbolel/Graduation-Project/blob/master/ScreenShots/modelService.png) <br>

## Simple ChatBot

We used RASA X conversational AI framework to build our chatbot. The chatbot answers basic questions. You can see stories about created conversations in stories.md file.

If you want to use this part you can get information RASA X documents. You can reach [there](https://rasa.com/docs/rasa-x/).

Usage: <br>
There are some screenshots about using of chatbot in the web app.

![ChatBot kullanımı](https://github.com/nursultanbolel/Graduation-Project/blob/master/Gifs/graduationProjectRasaX.gif) <br>
