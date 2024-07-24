<h1>Spring Basics</h1>
<p>Project to learn the fundamentals of spring. The project has three Layer: API (with GET, POST, PUT, DELETE), Service (for business logic) and Data Acesses (to connect to the database)</p>
<h3>Table of contents</h3>
<ul>
    <li><a href="#prerequisites">Prerequisites</a></li>
    <li><a href="#install">How to install</a></li>
    <li><a href="#learned">What i learned</a></li>
</ul>
<h3 id="prerequisites">Prerequisites</h3>
<ul>
    <li>Java 22</li>
    
</ul>
<h3 href="install">How to install</h3>
<p>Within IntelliJ search for Maven, click on it, and go to 'springBasics.Lifecycle.install', its done.</p>
<h3 href="learned">What i learned</h3>
<h3></h3>
<h4>Beginning:</h4>
<p>Everything start in the <a href="https://start.spring.io/">SpringInitializr</a> where it is possible to configure the 
application and define the versions and dependencies. More dependencies can be added later by updating the pom.xml file.</p>
<h3></h3>
<h4>Entity</h4>
<p>The entity is the object that will be transformed into a table, and its attributes are the columns. 
The order in which it will be shown in the GET response is the order of the attributes in the code.</p>
<h3></h3>
<h4>@Transient</h4>
<p>This annotation indicates that an attribute 
will not be part of the table.</p>
<h3></h3>
<h4>Bean</h4>
<p>Bean its the notation that the class gonna be managed and instantiate in spring container.</p>
<h3></h3>
<h4>@Configuration</h4>
<p>This annotation is used to indicate that the class contains bean definitions to be managed by the spring container.
 In that class it's possible to define multiple beans using the "@Bean" on the methods. These methods return instances of objects that Spring should manage, providing dependency injection.</p>
<h3></h3>
<h4>@Repository (Its a Bean)</h4>
<p>This annotation its used to indicate that the class provides the mechanism for storage, retrieval, update and deletion
operation on objects. Essentially, it marks the class as a Data Acess Object (DAO). This class will execute the querries in the database, ensuring that data acess logic is properly encapsulated.</p>
<h3></h3>
<h4>@Service (Its a Bean)</h4>
<p>This annotation its used to indicate that the class contains methods that execute the core business logic, performing operations such validations and processing data.
 After applying the business rules, the service call the "Repository" to execute the querry and interact with the database.</p>
<h3></h3>
<h4>@Transactional (Used in service)</h4>
<p>This annotation is used in the update method. When its used, there's no need to use the Repository to update the database; just update the setAttribute, and it's done.</p>
<h3></h3>
<h4>@Controller (Its a Bean)</h4>
<p>The annotation its used to mark a class as a web controller, handling incoming web requests and returning responses. After handling the initial web request, the controller calls the "@service" to apply the business logic.</p>
<h3></h3>
<h4>@Autowired</h4>
<p>This annotation is used to tell Spring that the constructor or variable below it is related to the bean's repository. 
Spring should retrieve the information from there and inject it where the annotation is placed. An example of this can 
be found in 'src/main/java/com/example/demo/student/StudentService.java'. In that file, the constructor gets the information 
about StudentRepository from the bean's repository managed by Spring.</p>
