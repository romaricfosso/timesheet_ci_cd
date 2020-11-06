package tn.esprit.spring;

public class NumberService {
  public int biggestNumber(int[]list) {
	  int index, max=0;
	  for(index=0;index<list.length ;index++)
	  {
		  if(list[index] >max) {
			  
			  max=list[index];
		  }
	  }
	  
	  return max;
  }
}
