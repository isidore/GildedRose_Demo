package com.gildedrose;

import java.text.MessageFormat;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest // extends FasterTestCommitRevertTest
{
  @Test
  public void foo() throws Exception
  {
    String[] names = {"foo"};
    CombinationApprovals.verifyAllCombinations(this::doStuff, names);
  }
  public String doStuff(String name)
  {
    Item[] items = new Item[]{new Item(name, 0, 0)};
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
