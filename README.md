# freistaatbayern
##Einführung
 Dieses Projekt zeigt, wie wir ein Projekt von Java 8 mit Apache Ant auf Java 11 mit Maven migrieren können.
  Ich habe ein Projekt erstellt, das auf Java 8 ausgeführt werden kann und sein Hauptwerkzeug ist Apache Ant. 
  Dann konvertiere ich den Code in Java 11 Maven

##Projektstruktur
Dieses Projekt enthält drei Unterprojekte.
  1. codeJava8Ant :Es enthält ein Java-Projekt, das von Java 8 kompiliert wurde und von Apache Ant erstellt wurde.
  2. codejava8Maven: Es enthält das gleiche Projekt von codeJava8Ant nach der Konvertierung von Apache Ant in Maven
  3. codeJava11Maven: Es enthält das gleiche Projekt von codejava8Maven nach der Konvertierung des Codes in Java 11-Code
  
## Beschreibung des Hauptcodes
 Wir haben ein Java-Backend. Dieses Backend enthält einen Service namens EinwohnerService.
 Dieser Service sollte Einwohnerdaten (ID, Vorname, Nachname) mit einer bestimmten ID zurückgeben. Die Service druckt die Daten auf dem Bildschirm als JSON-Objekt aus
 Die Service ruft die Einwohnerdaten vom Datasource Service ab, der die Daten in einer statischen Liste speichert. 
 
## Herausforderungen bei der Konvertierung zu Java 11 Maven
 1. Es gibt einen Unterschied zwischen Apache Ant und Maven. Ant ist ein flexibles Erstellungstool, das viele Ziele enthält und viele Dinge mit benutzerdefiniertem Java-Code tun kann.
   Maven hängt vom  "convention rather than configuration approach" ab, daher hat Maven in seinem Gebäudelebenszyklus Konventionen, auch benutzerdefinierte Aufgaben werden von benutzerdefinierten Plugins erledigt.
 Es ist also perfekt für den regulären Erstellungs- und Kompilierungsprozess, aber bei komplexen benutzerdefinierten Prozessen ist es etwas schwieriger.
 
 2.Der Hauptunterschied zwischen Java 8 und Java 11 besteht darin, dass Java 11 Module-Packaging einführt. Dies bedeutet, dass Pakete innerhalb von Module vorhanden sind.
 Jedes Modul sollte Abhängigkeiten, Pakete und Dienste deklarieren, die es bereitstellt. java 11 hat auch einige Standardmodule aus dem JDK herausgebracht.
Java 11 schränkt die Reflexionsfunktion ein, die von JAXB , Hibernate usw. verwendet wird.
 
## Konvertieren von Schritten
 ## Testfälle erstellen
   Im ersten Schritt sollten wir Testfälle erstellen, um den größten Teil des Codes abzudecken, damit jede unerwünschte Änderung während der Migration die Testfälle fehlschlägt und wir sie schneller entdecken können.
 ## In Maven umwandeln
   In diesem Schritt müssen wir die build.xml von Ant lesen und analysieren und dann den entsprechenden Maven-Code schreiben, um die build.xml zu ersetzen
 ## Changing Maven script from java 8 to java 11
   In diesem Schritt ändern wir den Compiler im Maven-Skript von Java 8 auf Java 11 und aktualisieren alle Abhängigkeiten auf die entsprechende Java 11-Version.
 ## Modulralize packages  into Modules and puts dependencies between them
  In diesem Schritt analysieren wir den Code und teilen ihn in 4 Module auf
    1. Models: es enthält Einwohner Pojo-Modell
	2. dataaccess: Es enthält einen  Dataaccess service, der Einwohnerdaten aus der In Memory List liest
	3. Businessservice:Es enthält einen Dienst, der das Einwohner-Objekt nach der ID abruft und im JSON-Format ausdruckt
  Jedes Modul enthält module-info.java (Moduldeskriptordatei), die die richtigen Pakete öffentlich exportiert und das erforderliche Modul für sich selbst deklariert.
  Es deklariert auch Dienste, die benötigt werden, und Dienste, die verfügbar gemacht werden sollen.
  
 
   