<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<h4 class="section">Installation Instructions</h4>
<div style="width:400">
<h4>Required software</h4>
<p>
The following software is required:
</p>
<h5>Application Server</h5>
<p>
TechyTax runs as a web application on an application server.
</p>
<ul>
<li>Java 1.6</li>
<li>Tomcat 6.0</li>
<li>MySQL Java Connector</li>
</ul>
<h5>Database Server</h5>
<p>
All data is stored in a MySQL database on a database server. This does not
have to be the same server as the application server. 
</p>
<ul>
<li>MySQL 5.0</li>
</ul>
<h4>Installation instructions</h4>
<ul>
<li>Place the Java Connector in the Tomcat lib directory.</li>
<li>Add a user with 'admin' role to the Tomcat user database.</li>
<li>Edit the server port number in the file 'index.jsp'.</li>
<li>Start the Tomcat server.</li>
</ul>
<h4>Database configuration</h4>
<ul>
<li>If needed, adapt the file 'database.properties' to your own database situation.</li> 
<li>In your database, create schema 'techytax': <code>create database techytax;</code></li>
<li>Create a user, 'techy': <code>create user techy@localhost;</code></li>
<li>Give this user select, insert and update privileges: <code>grant select, insert, update on techytax.* to techy;</code></li>
<li>Look in the TechyTax/sql directory</li>
<li>Import the database structure: <code>mysql -uroot &lt; create_db.sql</code></li>
<li>Import the cost type table: <code>mysql -uroot &lt; kostensoort_data.sql</code></li>
<li>Import the balance tables: <code>mysql -uroot &lt; balance_data.sql</code></li>
</ul>
<h4>Program configuration</h4>
<ul>
<li>Place a copy of techytax.properties in your home directory.</li>
<li>Edit the start date of your administration.</li>
<li>If needed, place a copy of 'mail.properties' in your home directory.</li>
</ul>
<h4>Program test</h4>
<ul>
<li>Check te URL: http://localhost:8080/TechyTax</li>
<li>Select an option in the menu.</li>
<li>Log on with the admin user.</li>
</ul>
</div>