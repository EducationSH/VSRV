String s = "Place " + getFullName() + "\n";
s += "Input transitions:\n";
for( TimedTransition tr : inputTransitions )
s += "  " + tr.getFullName() + "\n";
s += "Output transitions:\n";
for( TimedTransition tr : outputTransitions )
	s += "  " + tr.getFullName() + "\n";
s += "Tokens: " + tokens;
return s;
