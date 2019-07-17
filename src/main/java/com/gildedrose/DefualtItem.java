package com.gildedrose;

public class DefualtItem
{
  public DefualtItem()
  {
    super();
  }
  public boolean isItem()
  {
    return true;
  }
  public void updateQuality(Item item)
  {
    if (item.quality > 0)
    {
      item.quality = item.quality - 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0 && item.quality > 0)
    {
      item.quality = item.quality - 1;
    }
    return;
  }
}