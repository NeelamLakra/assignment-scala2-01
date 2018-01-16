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


  def happySadChecker(number: Int):Boolean ={
    (if number <=9)
    {
      val sumOfSquare = number*number
      if(sumOfSquare>9)
        {
          happySadChecker(sumOfSquare)
        }
    }
    else
    {
      val sumOfSquare = 
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
