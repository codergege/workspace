file = new File('objects.dat')
file.deleteOnExit() // Cleans up after ourselves

objects = [1, "Hello Groovy!", new Date()]

file.withObjectOutputStream { outstream ->
	objects.each {
		outstream << it // Serializes each object in the list in turn
	}
}

retrieved = []

file.withObjectInputStream { instream ->
	instream.eachObject {
		retrieved << it // Deserializes each object in turn
	}
}

assert retrieved == objects

// println objects

// println retrieved

/* new File('.').eachFile { */
	// println it.name
/* } */

// assert [] instanceof java.io.Serializable
assert [] instanceof Serializable
assert Integer instanceof Serializable
assert String instanceof Serializable
assert Date instanceof Serializable
