# wildfly8-sample

Sample multi-module project using Wildfly 8 with Java EE 7 and Java SE 8, based on the Wildfly BOM.

Build and install the modules into your local Maven repository:

    $ mvn clean install

Run the EAR like this:

    $ cd wildfly8-sample-ear
    $ mvn wildfly:run
    
After Wildfly has finished starting up, visit
[http://localhost:8080/wildfly8-sample-web/sample](http://localhost:8080/wildfly8-sample-web/sample)
and you should see the output returned by `SampleServlet`.
