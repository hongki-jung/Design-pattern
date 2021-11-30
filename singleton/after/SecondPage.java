package singleton.after;

public class SecondPage {
  private Settings settings = Settings.getSettings();

  public void setAndPRintSettings(){
    settings.setDarkMode(true);
    settings.setFontSize(15);

    System.out.println(settings.getDarkMode() + " "+ settings.getFontSize());
  }
}
