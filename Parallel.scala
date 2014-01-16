def mkSeq(): Seq[Int] = {
  var i = 0

  Seq.fill(100000) {
    i += 1
    i
  }
}

def time(f: => Unit) {
  val t = System.currentTimeMillis()
  f
  println(System.currentTimeMillis() - t)
}

var normal = 0
var parallel = 0

println("timing for normal")
time {
  normal = (mkSeq.par map { int => int * int }).sum
}

println("timing for parallel")
time {
  parallel = (mkSeq.par map { int => int * int }).sum
}

println("normal: " + normal)
println("parallel: " + parallel)
