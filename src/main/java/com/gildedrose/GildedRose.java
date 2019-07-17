package com.gildedrose;

class GildedRose extends Sulfuras
{
  Item[] items;
  public GildedRose(Item[] items)
  {
    this.items = items;
  }
  public void updateQuality()
  {
    for (int i = 0; i < items.length; i++)
    {
      Item item = items[i];
      stuff(item);
    }
  }
  private void stuff(Item item)
  {
    if (isAgedBrie(item))
    {
      stuffWithAgedBrie(item);
      return;
    }
    else if (isBackstagePasses(item))
    {
      doStuffForBackstagePasses(item);
      return;
    }
    else if (isSulfuras(item))
    {
      doStuffForSulfuras(item);
      return;
    }
    else if (isDefault())
    {
      doStuffForEverythingElse(item);
      return;
    }
  }
  private boolean isDefault()
  {
    return true;
  }
  private void doStuffForEverythingElse(Item item)
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