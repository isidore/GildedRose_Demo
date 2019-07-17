package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest
{
  @Test
  public void foo()
  {
    String names[] = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert"};
    CombinationApprovals.verifyAllCombinations(this::doStuff, names);
  }
  private String doStuff(String name)
  {
    Item[] items = new Item[]{new Item(name, 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = app.items[0].toString();
    return result;
  }
}
