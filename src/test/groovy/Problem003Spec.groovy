import spock.lang.*

class Problem003Spec extends Specification {

	def "Problem 003"() {
		when:
			def multiplicand = 600851475143
			def factors = EulerMath.primeFactors(multiplicand)
		then:
			factors.last() == 6857
	}
}
