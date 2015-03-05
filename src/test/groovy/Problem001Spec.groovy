import spock.lang.*

class Problem001Spec extends Specification {

	def "Problem 001"() {
		when:
			def max = 1000
			def multiplesOf3 = EulerMath.findMultiplesBelow(3, max)
			def multiplesOf5 = EulerMath.findMultiplesBelow(5, max)
			def sum = (multiplesOf3 + multiplesOf5).unique().sum()
		then:
			sum == 233168
	}
}
