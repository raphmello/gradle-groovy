l = [1,2,3]
println l
println l.class

//adding elements
l << 4 //same as l.add(4)
l.add(5)
println l

//adding two lists
l = l + [6,7]
println l

//removing elements
println l - [1,2,4]

l.each { println it}
l.reverseEach {println it}
l.eachPermutation {println it} //show all the possible permutation with the elements

println "Combinations example"
[[0,1],[2,3]].eachCombination { println(it) }

a = [1,1,2]
def combinations = a.combinations()
println combinations

//SET
s = ['java','js','python','js'] as Set
//another way is > Set s = ['java','js','python','js']
println s
println s.class

//MAP
m = [courseName:'Gradle',rating:5,price:20]
println m
println m.getClass()
m.each { k, v ->
    println k + ' ' + v
}

//Accessing Map values
println m.get('courseName')
println m.courseName
println m['courseName']

//Adding or Changing Keys
m.review = 'Awesome';
println m.review
