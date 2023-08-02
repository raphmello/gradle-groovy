c = { n ->
    println("Closure are simple $n")
}

c.call(3)

a = { n=2 -> //default value is 2
    println(n%2 == 0 ? "even" : "odd")
}

a.call(3)
a.call()

4.times {n -> print n}
println()
4.times {print it}
