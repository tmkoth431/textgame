package Utils;

import Objects.Enemy;
import Objects.Item;

public class Enemies {
  public static final Item[] feederItems = {Items.feederEye, Items.feederHeart, Items.feederArm, Items.feederLeg};
  public static final Enemy feeder = new Enemy(Utils.calcHp(feederItems), feederItems);
}
