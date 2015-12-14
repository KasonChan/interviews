val a = Some(5)

val n = None

val aa = for {
  a1 <- a
  a2 <- a
} yield (a1, a2)

val an = for {
  a <- a
  n <- n
} yield (a, n)


val na = for {
  n <- n
  a <- a
} yield (n, a)


val nn = for {
  n1 <- n
  n2 <- n
} yield (n1, n2)
