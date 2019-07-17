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
    AgedBrie that = new AgedBrie();
    BackstagePasses passes = new BackstagePasses();
    Sulfuras sulfuras = new Sulfuras();
    if (that.isAgedBrie(item))
    {
      that.stuffWithAgedBrie(item);
      return;
    }
    else if (passes.isBackstagePasses(item))
    {
      passes.doStuffForBackstagePasses(item);
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