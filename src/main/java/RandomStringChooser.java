import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> temp;
  public RandomStringChooser(String[] list){
    temp = new ArrayList <String>();
    for(String words: list)
      temp.add(words);
  }
  public String getNext(){
    if(temp.size() == 0)
      return "NONE";
    return temp.remove((int)(Math.random()*temp.size()));
  }
}
