int product ( int x, int y) {
    return x*y
}

//another syntax
def product2 (x, y) {
    x*y
}

//best syntax, declaring the types
int product3 ( int x = 3, int y) { //x with default value
    x*y
}

def result = product 2, 10
println result

def result2 = product2(2d, 10f)
println result2

def result3 = product3(2, 10)
println result3

def result4 = product3(10 )
println result4

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}

display(name:'iPhone',price:1000)