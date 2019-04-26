package com.gildedrose;

import java.text.MessageFormat;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;

public class GildedRoseTest extends FasterTestCommitRevertTest
{
  @Test
  public void foo() throws Exception
  {
    String[] names = {"foo",
                      "Aged Brie",
                      "Backstage passes to a TAFKAL80ETC concert",
                      "Sulfuras, Hand of Ragnaros"};
    Integer qualities[] = {-1, 0, 1, 49, 50, 51};
    Integer sellins[] = Range.get(-1, 15);
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities, sellins);
  }
  public String doStuff(String name, Integer quality, Integer sellin)
  {
    Item[] items = new Item[]{new Item(name, sellin, quality)};
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
