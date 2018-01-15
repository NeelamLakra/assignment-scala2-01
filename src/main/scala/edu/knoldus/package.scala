package edu

package object knoldus {

  /*def runLength(list:List[Int]):List[List[Int]] = {
      list match {
        case head :: head1 :: tail if (head == head1) => runLength(head1,)
        case head :: head1 :: tail if (head != head1) => runLength(head1 :: tail)
        case head :: Nil => (head, counter)

      }
    }
  }
  */

  def rotateList(index: Int, list: List[Char]): List[Char] = {
    list match {
      case head :: tail if (index == 0) => list
      case head :: tail if (index != 0) => rotateList(index - 1, tail :+ head)
    }
  }


  def happySadChecker(number: Int) {

  }

  def consecutiveElimination(outputList: List[Char], list: List[Char]): List[Char] = {
    list match {
      case head1 :: head2 :: tail if (head1 == head2) => consecutiveElimination(outputList, head2 :: tail)
      case head1 :: head2 :: tail if (head1 != head2) => consecutiveElimination(outputList ::: List(head1), head2 :: tail)
      case head :: Nil => outputList ::: List(head)
    }
  }
}
