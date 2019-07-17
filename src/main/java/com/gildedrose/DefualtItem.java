package com.gildedrose;

public class DefualtItem
{
  public DefualtItem()
  {
    super();
  }
  protected boolean isDefault()
  {
    return true;
  }
  protected void doStuffForEverythingElse(Item item)
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