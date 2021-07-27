import scala.collection.mutable

val a = mutable.Buffer(0, 5, -1, 3, -9)
val positionsToKeep = for (i <- a.indices if a(i) >= 0) yield i
for (j <- positionsToKeep.indices) a(j) = a(positionsToKeep(j))
a.dropRightInPlace(a.length - positionsToKeep.length)