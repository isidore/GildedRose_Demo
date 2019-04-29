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
    String result = app.items[0].toString();
    Approvals.verify(result);
  }
}
