public int strCount(String str, String sub) {
  
  if(str.length() == 0 ) return 0;
  
  
  if(str.length() >= sub.length() && str.substring(str.length()-sub.length(),str.length()).equals(sub)) {
    
    return 1+strCount(str.substring(0,str.length()-sub.length()),sub);
  }        
  
  return strCount(str.substring(0,str.length()-1),sub);
   
}
