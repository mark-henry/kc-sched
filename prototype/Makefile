all:	main jar

main:	
	
	rm -rf classes ; \
	mkdir classes ; \
	javac -g -d classes \
	      src/keycow/scheduler/view/data/*.java \
	      src/keycow/scheduler/view/generate/*.java \
	      src/keycow/scheduler/view/*.java ; \
	
	cp src/keycow/scheduler/view/fake.png classes/keycow/scheduler/view/fake.png
	
jar:
	cd classes ; \
	echo Main-Class: keycow.scheduler.view.Main > Manifest.txt;\
	jar cmf Manifest.txt scheduler.jar keycow ; \
	chmod a+x scheduler.jar ; \
	mv scheduler.jar ..


clean:
	rm -rf *.class *_ui/*.class javadoc/* *.jar classes
