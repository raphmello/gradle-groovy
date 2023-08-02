// variable defini
def a = 10.24F
int b = 10
Integer c = 20
d = 20.10d

println a
println a.class
println d
println d.class

//strings
name = 'raphael'
s1 = 'hello' //this cannot use placeholders
s2 = "hello $name" //this is a groovy string because allow us to use placeholders
println s2
s3 = '''
Test
Multiple
Lines
'''
println(s3)

//REGEX
emailPattern=/^\w+[\w-\.]*\@\w+((-\w+)|(\w*))\.[a-z]{2,3}$/
println emailPattern.class //this is still a string
println "test@gmail.com" ==~ emailPattern
