package edu

package object knoldus {


  def runLength[T](list: List[T]): List[(Int, T)] = list match {
    case Nil => List()
    case head :: tail => {
      val (back, front) = tail.span(_ == head)
      (front.length + 1, head) :: runLength(back)
    }
  }


  def rotateList(index: Int, list: List[Char]): List[Char] = {
    list match {
      case head :: tail if (index == 0) => list
      case head :: tail if (index != 0) => rotateList(index - 1, tail :+ head)
    }
  }


  def happySadChecker(number: Int,list:List[Int]):Boolean = {
    def sumOfSquares(sum: Int, number: Int): Int = {
      number match {
        case 0 => sum
        case _ => sumOfSquares(sum + (number % 10) * (number % 10),number/10)
      }
    }
   val n= sumOfSquares(0,number)
    n match{
      case 1 => true
      case _ => {
        list.contains(n) match{
          case true => false
          case false =>happySadChecker(n,n::list)
        }
      }
    }
  }

  def consecutiveElimination(outputList: List[Char], list: List[Char]): List[Char] = {
    list match {
      case head1 :: head2 :: tail if (head1 == head2) => consecutiveElimination(outputList, head2 :: tail)
      case head1 :: head2 :: tail if (head1 != head2) => consecutiveElimination(outputList ::: List(head1), head2 :: tail)
      case head :: Nil => outputList ::: List(head)
    }
  }
}
