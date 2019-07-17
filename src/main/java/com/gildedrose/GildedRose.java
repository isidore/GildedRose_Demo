package com.gildedrose;

class GildedRose extends DefualtItem
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
    GildedRose that = this;
    if (that.isAgedBrie(item))
    {
      that.stuffWithAgedBrie(item);
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
}