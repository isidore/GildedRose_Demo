package com.gildedrose;

import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;

import org.junit.Test;

public class GildedRoseTest
{
  @Test
  public void foo()
  {
    Item[] items = new Item[]{new Item("foo", 0, 0)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    String result = toString(app.items[0]);
    assertEquals("[foo, sellin: -1, quality: 0]", result);
  }
  public String toString(Item item)
  {
    return MessageFormat.format("[{0}, sellin: {1}, quality: {2}]", item.name, item.sellIn, item.quality);
  }
}
