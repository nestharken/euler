class EulerMath {
	static def findMultiplesBelow(factor, max) {
		(1..Math.floor((max-1)/factor)).collect { it * factor }
	}

	static def fibonacciBelow(max) {
		def terms = []
		if (max > 1) {
			terms = [1, 1]
			def nextTerm = 2
			while (nextTerm < max) {
				terms << nextTerm
				nextTerm = terms[-1] + terms[-2]
			}
		}
		return terms
	}
}
