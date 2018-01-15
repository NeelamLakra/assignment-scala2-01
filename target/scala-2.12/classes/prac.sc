/*val list= List(1,1,2,2,3,3,3,2,2)
def runLength(list:List[Int]):List[Int] ={
def inner(list:List[Int],counter:Int):List[Int]={
 list match{
   case head :: head1 :: tail if(head == head1)=>(head,counter+1) else (head1::tail)
   case head :: head1 :: tail if(head != head1) =>runLength(head1::tail)
   case head ::Nil =>(head,counter)

  }
}


    def consecutiveElimination(outputList:List[Char],list: List[Char]): List[Char] = {
        list match {
          case head1 :: head2 :: tail if (head1 == head2) => consecutiveElimination(outputList, head2 :: tail)
          case head1 :: tail if (head1 != tail.head) => consecutiveElimination(outputList ::: List(head1), tail)
          case head ::Nil=>outputList:::List(head)
        }
      }






