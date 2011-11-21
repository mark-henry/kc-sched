all: java docs jml
java: 
	javac ./KCSched/*.java
docs:	
	cd ./KCSched/javadoc ; \
	javadoc -private ../*.java 
jml: 

clean: 
	cd ./KCSched ; \
	rm *.class ; \
	cd ./javadoc ; \
	rm -rf *