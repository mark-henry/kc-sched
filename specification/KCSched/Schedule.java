/*Created by Acrafts 10/20*/
package KCSched;

import java.util.Collection;

/** This is a container for a schedule object. A Schedule is merely a collection of sections, with no conflicting
  * entries. See the GenerateSchedule class for a more complete view of schedule generation **/
public abstract class Schedule {
	Collection<Section> sections;
	
	//The Schedule document is a basic CRUD database of Sections.
	
	/*@
	ensures
		sections.contains(sec);
	@*/
	public abstract void add(Section sec);
	
	/*@
	requires
	    sections.contains(sec);
	ensures
	    !sections.contains(sec);
	@*/
	public abstract void delete(Section sec);
	
	/*@
	requires
	    sections.contains(oldSec);
   ensures
      !sections.contains(oldSec)
         &&
		sections.contains(newSec);
	@*/
	public abstract void modify(Section oldSec, Section newSec);
	
	public abstract void read();
}
