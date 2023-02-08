# Descriptive-HTML
A program that implements a simple grammar for a declarative language that defines the web page instead of the HTML using JavaCC.
The language describes the web page (WHAT the user needs?) instead of telling the browser (HOW to render the page?). For example, the user will write something like the following:

* ADD IMAGE WITH SOURCE "https://www.w3schools.com/html/pic_trulli.jpg"

* ADD HEADING WITH TEXT "Hello World"

* ADD PARAGRAPH WITH TEXT "Welcome" AND WITH FONT "Arial" AND WITH COLOR "Red"

* ADD LINK WITH TEXT "Search" AND WITH LINK "http://google.com"

* ADD LINK WITH TEXT "Email" AND WITH LINK "http://gmail.com" WITH COLOR "Green"

* ADD PARAGRAPH WITH WITH FONT "Arial" AND TEXT "Good bye"

Which will generate the following HTML
* &lt;img src="https://www.w3schools.com/html/pic_trulli.jpg" /&gt;
* &lt;h1>Hello World&lt;/h1&gt;
* &lt;p style="color:Red;font-family:Arial;"&gt;Welcome&lt;/p&gt;
* &lt;a href="http://google.com"&gt;Search&lt;/a&gt;
* &lt;a href="http://gmail.com" style="color:Green;"&gt;Email&lt;/a&gt;
* &lt;p style="font-family:Arial;"&gt;Good bye&lt;/p&gt;
