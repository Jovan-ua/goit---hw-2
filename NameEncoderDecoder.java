class NameEncoderDecoder{
  public String encode(String name){
     /* String e = name.toLowerCase().replace("e","1");
      String u = name.toLowerCase().replace("u","2");
      String i = name.toLowerCase().replace("i","3");
      String o = name.toLowerCase().replace("o","4");
      String a = name.toLowerCase().replace("a","5");*/
    return "NOTFORYOU" + name.replace("e","1").replace("u","2").replace("i","3").replace("o","4").replace("a","5") + "YESNOTFORYOU";    
  }   
  public String decode(String name){
  return name.replace("YESNOTFORYOU","").replace("NOTFORYOU","").replace("2","u").replace("3","i")
    .replace("4","o").replace("5","a").replace("1","e");
  
  }
}
