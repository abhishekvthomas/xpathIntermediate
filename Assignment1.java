package Goals.XpathIntermediate;

public class Assignment1 {
	
	
//	<root xmlns:foo="http://www.foo.org/" xmlns:bar="http://www.bar.org">
//    <actors>
//        <actor id="1">Christian Bale</actor>
//        <actor id="2">Liam Neeson</actor>
//        <actor id="3">Michael Caine</actor>
//    </actors>
//    <foo:singers>
//        <foo:singer id="4">Tom Waits</foo:singer>
//        <foo:singer id="5">B.B. King</foo:singer>
//        <foo:singer id="6">Ray Charles</foo:singer>
//    </foo:singers>
//</root>
	
	
//	a. Select all 'singer' elements regardless of their positions in the document.
	
//  -  /foo:singers//foo:singer
	
//	b. Select the 'id' attributes of the 'singer' elements regardless of their positions in the document.
	
//   - /foo:singers//foo:singer[@id]
	
//	 c. Select the last 'actor' element.
	 
//	 - /actors/actor[last()]
	
//	d. Select the textual value of first 'actor' element. 
	
//	- /actors/actor[1]/text()
	
//	e. Select the first and second 'actor' elements using their position. 
	
//	- //actor[position() < 3]
	
//	f. Select all 'actor' elements that have an 'id' attribute. 
	
//	- /actors//actor[@id]
	
//	g. Select the 'actor' element with the 'id' attribute value of '3'. 
	
//	- /actors//actor[@id = '3']
	
//	h. Select all 'actor' nodes with the 'id' attribute value lower or equal to '3'. 
	
//	- /actors//actor[@id <= 3]
	
//	i. Select all the children of the 'singers' node.
	
//	- //foo:singer/*
	
//	j. Select all the elements in the document. 
	
//	- //*.
	
//	k. Select all the 'actor' elements AND the 'singer' elements.
	
//	- //actor | //foo:singer
	
//	l. Select the name of the first element in the document. 
	
//	- name(//*[1])

//	m. Select all 'actor' elements that are direct children of the 'actors' element.

//	- /root/actors/actor

	
}
