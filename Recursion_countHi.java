public int countHi(String str) {
  
  
  
  /*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/


  if(str.length()==0)
    return 0;
   
    
    if(str.length()>=2 && str.substring(0,2).equals("hi")) {
      
      return 1+countHi(str.substring(1));
    }
    
    
   return countHi(str.substring(1));
  
  
  
  
  
  
}
