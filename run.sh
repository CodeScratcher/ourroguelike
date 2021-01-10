cd ourroguelike
mvn package
mvn exec:java -Djava.awt.headless=true -Dexec.mainClass="com.ourroguelike.app.App"