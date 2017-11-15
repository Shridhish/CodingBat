public int sumDigits(int n) {
  
  
  //input : 126, mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
  // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


  if(n==0)
    return 0;
  
  return n%10+sumDigits(n/10);
  
  
  
  
}
