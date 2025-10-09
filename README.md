# Assignment 2: Architectural MVC Pattern
Group Members:
- Neha Khan - 100912630, Contribution: Question 4
- Huda Saeed - 100920036, Contribution: Question 1
- Completed Questions 2 and 3 together

# Q1
Swing is a built-in Java library for making desktop applications containing a graphical user interface (GUI). It is used to provide developers with a set of lightweight components like windows, buttons, text boxes, and menus, that are predefined. The main advantage of Swing is that it is platform-independent. This means that the application will look and behave the same whether it is running on Windows, macOS, or Linux systems. Swing is a "lightweight" toolkit that uses Java code to draw its own components rather than using the original operating system to render them.

<img width="661" height="400" alt="image" src="https://github.com/user-attachments/assets/b00c6744-f712-47ce-8e13-5e0cac76e68e" />


# Q2
### How it implements MVC pattern
- The model class has methods to set and store the data (firstname, lastname)
- In MVC patterns, the model class is responsible for getting and changing the state of the data
- The view class has the Swing UI components like labels, text fields, and buttons
- In MVC patterns, the view class is responsible for giving a presentation of the model
- The controller class coordinates between the model and view classes. It updates the view class when the user inputs are received
- In MVC patterns, the controller class is responsible for being the bridge between the model and view classes

### How it is different from conventional MVC patterns
Typically, when there are changes to the Model, it automatically notifies the Controller and View. In the example, the Model just holds the data, and the Controller updates the View when needed
In the conventional MVC, Model notifies View and Controller about changes when the Model’s data changes, and the View receives the data from the Model. In this example, the Controller is responsible for updating. The View doesn’t respond to when the model changes; it only updates through the controller. 
Conventional MVC patterns use observer patterns and interfaces to minimize dependencies between different components. In the example, the Controller has direct access to some components in View like getFirstNameTextfield(). Any structural changes to View needs changes in the Controller too.
Usually in MVC patterns, the Model and View can communicate directly through an observer pattern or something similar. Here, the Model and View are completely separate from each other. The interaction between them happens through the Controller, not directly

# Q4
### Sequence Diagram
<img width="589" height="400" alt="image" src="https://github.com/user-attachments/assets/9628717d-f647-4aa8-b36c-61218888f893" />



