package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

public class GildedRoseTest extends FasterTestCommitRevertTest
{
  @Test
  public void foo()
  {
    String result = doStuff("foo");
    Approvals.verify(result);
  }

  public String doStuff(String name)
  {
    Item[] items = new Item[]{new Item(name, 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = app.items[0].toString();
    return result;
  }
}
