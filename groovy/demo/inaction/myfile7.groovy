// Creates a temporary directory
File tempDir = File.createTempDir()
// Checks that directory is empty
assert tempDir.directorySize() == 0
// Creates a file and sets file contents
File source = new File(tempDir, 'input.dat')
source.bytes = "hello world".bytes
assert tempDir.directorySize() == 11

File destination = new File(tempDir, 'output.dat')

// copy
destination.withDataOutputStream { os->
	source.withDataInputStream { is->
		os << is
	}
}

assert tempDir.directorySize() == 22
// 删除临时目录
tempDir.deleteDir()
