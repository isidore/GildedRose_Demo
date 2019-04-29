package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FasterTestCommitRevertRunner.class)
public class GildedRoseTest
{
  @Test
  public void foo() throws Exception
  {
    String names[] = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert"};
    Integer qualities[] = {0};
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities);
  }
  public String doStuff(String name, Integer quality)
  {
    Item[] items = new Item[]{new Item(name, quality, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = app.items[0].toString();
    return result;
  }
}
