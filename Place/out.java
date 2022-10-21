//check validity of the connection
if(!(msg.object instanceof TimedTransition))
	error("Only objects of type Transition can be connected to a place");
if(msg.directionOut)
	error("Only in port of a transition can be connected to the out port of a place");
//co-register
TimedTransition tr = (TimedTransition)msg.object;
if(!outputTransitions.contains(tr)){
	outputTransitions.add(tr);
	tr.inputPlaces.add(this);
	//notify transition
	tr.onChange();
}
