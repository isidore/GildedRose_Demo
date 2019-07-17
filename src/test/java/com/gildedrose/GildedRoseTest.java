package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest
{
  @Test
  public void foo()
  {
    String names[] = {"foo",
                      "Aged Brie",
                      "Backstage passes to a TAFKAL80ETC concert",
                      "Sulfuras, Hand of Ragnaros"};
    Integer[] qualities = {0};
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities);
  }
  private String doStuff(String name, Integer quality)
  {
    Item[] items = new Item[]{new Item(name, 0, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = app.items[0].toString();
    return result;
  }
}
