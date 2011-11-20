all:	main 

main:	
	javac -g -d classes \
	      src/keycow/scheduler/view/data/*.java \
	      src/keycow/scheduler/view/generate/*.java \
	      src/keycow/scheduler/view/*.java

jar:
	cd classes ; \
	jar cmf MANIFEST caltool.jar caltool ; \
	chmod a+x caltool.jar ; \
	mv caltool.jar ..

doc:
	javadoc \
	    -d javadoc \
	    -doctitle "Calendar Tool GUI Prototype" \
	    -windowtitle "Calendar Tool GUI Prototype" \
	    -overview overview.html \
	    caltool \
	    caltool.file_ui \
	    caltool.edit_ui \
	    caltool.schedule_ui \
	    caltool.view_ui \
	    caltool.admin_ui \
	    caltool.options_ui \
	    caltool.utilities

doc2:
	cd ..; \
	javadoc \
	  -sourcepath $(SOURCE) \
	  -classpath $(LIB206) \
	  -d $(DESTINATION) \
	  -overview $(OVERVIEW_FILE) \
	  -doctitle $(DOC_TITLE) \
	  -windowtitle $(WINDOW_TITLE) \
		$(PACKAGES)

print:
	@cd caltool ; \
	csh -q -c "../.make-print"

clean:
	rm -rf *.class *_ui/*.class javadoc/*
