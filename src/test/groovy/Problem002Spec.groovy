import spock.lang.*

class Problem002Spec extends Specification {

	def "Problem 002"() {
		when:
			def terms = EulerMath.fibonacciBelow(4000000)
			def sum = 0
			terms.each { term ->
				if (term % 2 == 0) {
					sum += term
				}
			}
		then:
			sum == 4613732
	}
}
