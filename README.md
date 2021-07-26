# freistaatbayern
##Introduction
 This project  shows how can we migrate a project from java 8 with Apache Ant to java 11 with Maven. I have built a project that can run on java 8 and the main build tools is Apache Ant.
 then I convert the code to java 11 Maven

##Project structure
 This project contains three projects.
  1. codeJava8Ant : it contains java project compiled by java 8 and it is built by Apache Ant.
  2. codejava8Maven: it contains the same project of codeJava8Ant after converting Apache Ant to Maven
  3. codeJava11Maven: it contains the same project of codejava8Maven after converting the code to java 11 code
  
## Main Code description
 We have a java backend. This backend  contains one Service called Einwohner Service.
 This service should return back Einwohner data (id, vorname, nachname) with specific ID. The service prints the data on screen as JSON object
 The service gets the Einwohner Data from Datasource Service that stores the data in static List. 

## Challanges to convert to java 11 Maven
 1. There is a different between Apache Ant and Maven. Ant is a flexable building tools that contains many targets and can do many things by java custom code
  Maven depends on convention rather than configuration approach so Maven  has conventions in its building lifecycle also custom tasks are done by custom plugin
 
 2. The main different between java 8 and java 11 is that java 11 introduces Module packaging . This means packages exist inside Module. 
 Each module should declear the depenancies and which packages and services ,it exposes. java 11 also has put out some standard module out of JDK.
 Java 11 puts some restriction over reflection Feature that is used by JAXB , Hibernate and so on.
 
## Converting Steps
 ## building Test cases
   first step we should build test cases that can cover the code so that any unwanted change during the migration will fail the test cases and we can 
   discover faster.
 ## Convert to Maven
   In this step we need to read the build.xml of Ant and analysis it then writing the corresponding Maven code.
 ## Changing Maven script from java 8 to java 11
   In this script we change the compiler inside the Maven script from java 8 to java 11 and upgrade all the dependances to corresponding java 11 version.
 ## Modulralize packages and plan code into Modules and puts dependencies between them
  In this script we analysis the code and split it into 4 Modules 
    1. Models: contains Einwohner pojo object
	2. dataaccess: contains Dataaccess service that reads Einwohner Data from Inmemory List
	3. Businessservice: contains Service that gets Einwohner object by id and print it in JSON format
  Each module contains module-info.java (module descriptor file) that exports the correct packages to public and declear the required module to itself.
  it declare also Services that is needed and Service that should expose.
  
 
   