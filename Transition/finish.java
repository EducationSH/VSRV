//put a token in each output place
for( Place pl : outputPlaces ) {
	pl.tokens++;
	pl.inform();
}
//increase fire count
fireCount++;
