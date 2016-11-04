mailReminder =
'''
Dear ${salutation?salutation+' ':''}$lastname,
another month has passed and it's time for these
<%=tasks.size()%> tasks:
<% 
tasks.each { out.println('- ' + it) }
%>
your collaboration is very much appreciated
'''
def engine = new groovy.text.SimpleTemplateEngine()
def template = engine.createTemplate(mailReminder)
def binding = [
salutation: 'Mrs.',
lastname : 'Davis',
tasks: ['visit the Groovy in Action (GinA) page',
		'chat with GinA readers']
]

/*
assert template.make(binding).toString() == '''
Dear Mrs. Davis,
another month has passed and it's time for these
2 tasks:
- visit the Groovy in Action (GinA) page
- chat with GinA readers

your collaboration is very much appreciated
'''
*/
println template.make(binding).toString()