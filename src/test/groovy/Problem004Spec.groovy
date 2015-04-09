import spock.lang.*

class Problem004Spec extends Specification {

	def "Problem 004"() {
		when:
			def largestPalindrome = -1
			(100..999).each { a ->
				(100..999).each { b ->
					def product = a * b
					if (EulerString.isPalindrome(product.toString()) && product > largestPalindrome) {
						largestPalindrome = product
					}
				}
			}

		then:
			largestPalindrome == 906609
	}
}
