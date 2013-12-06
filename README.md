JDBC Test
=========
A tool for testing JDBC connections.

Usage
-----
* Put JDBC drivers in lib/ (not included for licensing/complexity reasons)
* Run sbt assembly
* Copy target/scala*/jdbc-test-assembly-1.0.jar to destination
* Run `java -jar jdbc-test-assembly-1.0.jar 'jdbc:...' username password` to test the connection

This runs a 'SELECT 1' to verify the connection (may not be supported by your RDBMS).

It Should return the result set of the RDBMS and the value 1.
