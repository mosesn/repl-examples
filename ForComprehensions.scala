val nums = Seq(1, 2, 3, 4, 5)
val animals = Seq("cat", "dog", "chicken")

for {
  i <- nums
  animal <- animals
} println(animal * i)
