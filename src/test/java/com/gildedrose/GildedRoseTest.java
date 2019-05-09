package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.testcommitrevert.TestCommitRevertTest;
import org.junit.Test;

public class GildedRoseTest extends TestCommitRevertTest
{
  @Test
  public void foo()
  {
    Item[] items = new Item[]{new Item("foo", 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    Approvals.verify(app.items[0].toString());
  }
}
