package com.gildedrose;

import java.text.MessageFormat;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest extends FasterTestCommitRevertTest
{
  @Test
  public void foo() throws Exception
  {
    String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert"};
    Integer qualities[] = {-1, 0, 1};
    CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities);
  }
  public String doStuff(String name, Integer quality)
  {
    Item[] items = new Item[]{new Item(name, 0, quality)};
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
