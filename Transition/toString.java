String s = "Transition " + getFullName() + "\n";
s += "Current state: "; 
if(inState(delay))
	s += "delay in progress, remaining time = " + format(finish.getRest());
else 
	s += (enabled() ? "enabled" : "not enabled");
s += "\n";
s += "Input places:\n";
for(Place pl : inputPlaces)
	s += "  " + pl.getFullName() + "\n";
s += "Output places:\n";
for(Place pl : outputPlaces)
	s += "  " + pl.getFullName() + "\n";
return s;
