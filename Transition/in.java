//check validity of the connection
if(!( msg.object instanceof Place))
	error("Only objects of type Place can be connected to a transition");
if(!msg.directionOut)
	error("Only out port of a place can be connected to the in port of a transition");
//co-register
Place pl = (Place)msg.object;
if(!inputPlaces.contains(pl)){
	inputPlaces.add(pl);
	pl.outputTransitions.add(this);
	//notify self
	onChange();
}
