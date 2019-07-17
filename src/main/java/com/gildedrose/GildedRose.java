package com.gildedrose;

class GildedRose
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
  private boolean isSulfuras(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  private boolean isBackstagePasses(Item item)
  {
    return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
  }
  private boolean isAgedBrie(Item item)
  {
    return item.name.equals("Aged Brie");
  }
  private void doStuffForSulfuras(Item item)
  {
    // TODO Auto-generated method stub
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
  private void doStuffForBackstagePasses(Item item)
  {
    if (item.quality < 50)
    {
      item.quality = item.quality + 1;
      if (item.sellIn < 11)
      {
        if (item.quality < 50)
        {
          item.quality = item.quality + 1;
        }
      }
      if (item.sellIn < 6)
      {
        if (item.quality < 50)
        {
          item.quality = item.quality + 1;
        }
      }
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0)
    {
      item.quality = item.quality - item.quality;
    }
    return;
  }
  private void stuffWithAgedBrie(Item item)
  {
    if (item.quality < 50)
    {
      item.quality = item.quality + 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0)
    {
      if (item.quality < 50)
      {
        item.quality = item.quality + 1;
      }
    }
    return;
  }
}