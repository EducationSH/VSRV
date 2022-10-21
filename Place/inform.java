//notify all ougoing transitions about the marking change
for( TimedTransition tr : outputTransitions )
	tr.onChange();
