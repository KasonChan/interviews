package minDistance

/**
  * Created by kasonchan on 1/13/16.
  * Given a non-empty zero-indexed array A consisting of N non-negative integers,
  * returns the minimum distance between two distanct elements of A.
  * For element A[P] and A[Q] that are distinct, i.e. P not equals to Q, their
  * distance is defined as:
  * A[P] - A[Q] if A[P] - A[Q] >= 0;
  * A[Q] - A[P] if A[P] - A[Q] < 0.
  */
object Main {

  def solution(A: Array[Int]): Int = {

    val sorted = A.sortWith((x, y) => x < y)
    sorted(1) - sorted(0)

  }

}
