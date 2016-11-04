def names = ["\n", 'zb']
//
// println names.toString()
// println names.dump()
// println names.inspect()

println properties

class Test {
	def prop1
	def getSecond() {
		return 2
	}
}
def test = new Test()
println test.hasProperty('prop1')
println test.hasProperty('second')
println test.properties
