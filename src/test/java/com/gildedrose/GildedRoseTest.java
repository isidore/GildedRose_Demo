package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FasterTestCommitRevertRunner.class)
public class GildedRoseTest
{
  @Test
  public void foo() throws Exception
  {
    String names[] = {"foo",
                      "Aged Brie",
                      "Backstage passes to a TAFKAL80ETC concert",
                      "Sulfuras, Hand of Ragnaros"};
    Integer qualities[] = {0, 1, -1, 49, 50, 51};
    Integer sellins[] = Range.get(-1, 15);
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities, sellins);
  }
  public String doStuff(String name, Integer quality, Integer sellins)
  {
    Item[] items = new Item[]{new Item(name, sellins, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = app.items[0].toString();
    return result;
  }
}
