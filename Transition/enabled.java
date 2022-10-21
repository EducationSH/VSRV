if(inputPlaces.isEmpty())
	return false;
for(Place pl : inputPlaces)
	if(pl.tokens < 1)
		return false;
return true;
