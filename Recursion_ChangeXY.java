public String changeXY(String str) {
 
 
 
 /*Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/

 if(str.length()==0) {
   return str;
 }

if(str.charAt(0)=='x') {
  return 'y'+changeXY(str.substring(1));
}

return str.charAt(0)+changeXY(str.substring(1));
}

/*  Bottom up
public String changeXY(String str) {
  
  if(str.length() == 0) return "";
  
  if(str.charAt(str.length()-1) == 'x') {
    return changeXY(str.substring(0,str.length()-1))+"y";
  }
  
  return changeXY(str.substring(0,str.length()-1))+str.charAt(str.length()-1);
  
  
  
} */
