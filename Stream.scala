var a = 0
var b = 1

Stream.continually {
  val tmp = a
  a = b
  b = a + tmp
  b
}
