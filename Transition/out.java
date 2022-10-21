//check validity of the connection
if(!( msg.object instanceof Place))
	error("Only objects of type Place can be connected to a transition");
if(msg.directionOut)
	error("Only in port of a place can be connected to the out port of a transition");
//co-register
Place pl = (Place)msg.object;
if(!outputPlaces.contains(pl)){
	outputPlaces.add(pl);
	pl.inputTransitions.add(this);
	//notify self
	onChange();
}
