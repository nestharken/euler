class EulerMath {
	static def findMultiplesBelow(factor, max) {
		(0..Math.floor((max-1)/factor)).collect { it * factor }
	}
}
