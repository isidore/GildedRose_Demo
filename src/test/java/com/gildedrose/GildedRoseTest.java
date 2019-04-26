package com.gildedrose;

import java.text.MessageFormat;

import org.approvaltests.Approvals;
import org.approvaltests.testcommitrevert.TestCommitRevertTest;
import org.junit.Test;

public class GildedRoseTest extends TestCommitRevertTest
{
  @Test
  public void foo()
  {
    String result = doStuff();
    Approvals.verify(result);
  }
  public String doStuff()
  {
    Item[] items = new Item[]{new Item("foo", 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = toString(app.items[0]);
    return result;
  }
  public String toString(Item item)
  {
    return MessageFormat.format("[{0}, sellin: {1}, quality: {2}]", item.name, item.sellIn, item.quality);
  }
}
