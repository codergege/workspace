class Mother {
	def local = "mother's local"
	Closure getClosure(param) {
		// def local = "closure's local"
		def closure = {
			println local + ' ' + param
		}
		return closure
	}
}

Mother mother = new Mother()
def closure = mother.getClosure('param')
closure.call()
