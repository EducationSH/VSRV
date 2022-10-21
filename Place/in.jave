//check validity of the connection
if(!( msg.object instanceof TimedTransition))
	error("Only objects of type Transition can be connected to a place");
if(!msg.directionOut)
	error("Only out port of a transition can be connected to the in port of a place");
//co-register
TimedTransition tr = (TimedTransition)msg.object;
if(!inputTransitions.contains(tr)){
	inputTransitions.add(tr);
	tr.outputPlaces.add(this);
	//notify transition
	tr.onChange();
}
