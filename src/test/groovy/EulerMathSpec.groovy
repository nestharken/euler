import spock.lang.*

class EulerMathSpec extends Specification {

	def "Multiples should be calculated correctly"() {
		when:
			def multiplesOf3 = EulerMath.findMultiplesBelow(3, 12)
		then:
			multiplesOf3.size() == 3
			[3, 6, 9].each { multiplesOf3.contains(it) }
	}

	def "Fibonacci terms should be calculated correctly"() {
		when:
			def fibonacciTerms = EulerMath.fibonacciBelow(50)
		then:
			fibonacciTerms.size() == 9
			[1, 2, 3, 5, 8, 13, 21, 34].each { fibonacciTerms.contains(it) }
			fibonacciTerms.findAll{ it == 1 }.size() == 2
	}

	def "Prime factors should be calculated correctly"(){
		when:
			def factors = EulerMath.primeFactors(2*3*3*5)
		then:
			factors.size() == 4
			[2, 3, 5].each{ factors.contains(it) }
			factors.findAll{ it == 3 }.size() == 2
	}
}
