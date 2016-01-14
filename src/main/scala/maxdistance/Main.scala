package maxdistance

/**
  * Created by kasonchan on 1/14/16.
  * Given a non-empty zero-indexed array A consiting of N integers,
  * returns the maximal sum-distance value for this array. A sum-distance of a
  * pair of indices (P, Q), for 0 <= P <= Q < N, is the value of A[P] + A[Q] + (Q - P).
  */
object Main {

  def solution(A: Array[Int]) = {
    val indexed = A.zipWithIndex.map {
      x => Array(x, x)
    } ++ A.zipWithIndex.combinations(2)

    indexed.map {
      a => a(0)._1 + a(1)._1 + (a(1)._2 - a(0)._2)
    }.max
  }

}
