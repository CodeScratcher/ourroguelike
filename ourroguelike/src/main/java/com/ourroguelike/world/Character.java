import com.googlecode.lanterna.TextCharacter;
public interface Entity {
  char getCharacter();
  void move(int xAmount, int yAmount);
}