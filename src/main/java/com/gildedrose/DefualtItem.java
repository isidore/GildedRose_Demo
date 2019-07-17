package com.gildedrose;

public class DefualtItem implements ItemUpdater
{
  public DefualtItem()
  {
    super();
  }
  @Override
  public boolean isItem(Item item)
  {
    return true;
  }
  @Override
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