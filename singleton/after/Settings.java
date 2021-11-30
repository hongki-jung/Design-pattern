package singleton.after;

public class Settings{

  private Settings(){}; // 생성자를 private으로!!
  // 이렇게 할 경우 다른 클래스에서는 new로 생성할 수 없게 된다.

  // static으로 선언된 변수나 메서드들은
  // 객체가 얼마나 만들어지든
  // 메모리의 지정된 공간에 딱 하나씩만 존재하게 된다.
  private static Settings settings = null;

  public static Settings getSettings(){
    if(settings == null){
      settings = new Settings();

    }
    return settings;
  }

  // 클래스 안에 있는 static이 아닌 변수나 메서드들은
  // 객체가 생성될 때마다 메모리의 공간을 새로 차지한다.
  private boolean darkMode = false;
  private int fontSize = 13;

  public boolean getDarkMode () { return darkMode; }
  public int getFontSize () { return fontSize; }

  public void setDarkMode (boolean _darkMode){
    darkMode = _darkMode;
  }

  public void setFontSize (int _fontSize){
    fontSize = _fontSize;
  }


}