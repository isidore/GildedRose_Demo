package com.gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.testcommitrevert.TestCommitRevertRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestCommitRevertRunner.class)
public class GildedRoseTest
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
