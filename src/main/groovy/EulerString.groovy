class EulerString {
	static def isPalindrome(string) {
		if (string.size() == 0) {
			return true
		}
		for (int i = 0; i < Math.floor(string.size() / 2); i++) {
			if (string[i] != string[-1 * i - 1]) {
				return false
			}
		}
		return true
	}
}
