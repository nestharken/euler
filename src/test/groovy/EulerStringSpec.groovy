import spock.lang.*

class EulerStringSpec extends Specification {

	def "Palindromes should be determined correctly"() {
		when:
			def emptyString = ""
			def oddPalindrome = "abccba"
			def evenPalindrome = "abcdcba"
			def oddNotPalindrome = "abcdef"
			def evenNotPalindrome = "abcdefg"
		then:
			EulerString.isPalindrome(emptyString)
			EulerString.isPalindrome(oddPalindrome)
			EulerString.isPalindrome(evenPalindrome)
			!EulerString.isPalindrome(oddNotPalindrome)
			!EulerString.isPalindrome(evenNotPalindrome)
	}
}
