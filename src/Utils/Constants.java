package Utils;

import Objects.Item;

public final class Constants {
  public static final Item[] feederItems = {Items.feederEye, Items.feederHeart, Items.feederArm, Items.feederLeg};
  public static final int feederhp = Utils.calchp(feederItems);
}
