package prefixtopostfix

import scala.collection.mutable.Stack

/**
 * Created by ka-son on 10/3/15.
 *
 * Convert infix expression into postfix expression.
 * infix expr:   A+B*C/D-E
 * postfix expr: ABC*D/+E-
 * Assume you have a Stack, assume you have functions which tell you if a token
 * is operand or operator, also the precedence.
 */
object Main {

  def getPrecedence(operator: Char): Int = operator match {
    case '+' => 1
    case '-' => 1
    case '*' => 2
    case '/' => 2
  }

  def isOperator(char: Char): Boolean = char match {
    case '+' | '-' | '*' | '/' => true
    case _ => false
  }

  def prefixToPostfix(expr: String): String = {
    val s = Stack[Char]()
    var finalResult: String = ""

    for (i <- 0 until expr.length) {
      if (!isOperator(expr(i))) {
        finalResult = finalResult + expr(i)
      }
      else {
        while (s.nonEmpty && (getPrecedence(s.top) >= getPrecedence(expr(i)))) {
          finalResult = finalResult + s.pop
        }
        s.push(expr(i))
      }
    }

    while (s.nonEmpty) {
      finalResult = finalResult + s.pop
    }

    finalResult
  }

  def main(args: Array[String]) {
    val infix = "A+B*C/D-E"
    val postfix = prefixToPostfix(infix)

    println("infix expr: " + infix)
    println("post expr: " + postfix)
  }

}
