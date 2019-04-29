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
      updateQuality(item);
    }
  }
  public void updateQuality(Item item)
  {
    if (isBrie(item))
    {
      updateBrie(item);
      return;
    }
    if (isBackstagePasses(item))
    {
      updateBackstagePasses(item);
      return;
    }
    if (isSulfuras(item))
    {
      updateSulfuras(item);
      return;
    }
    if (isConjured(item))
    {
      updateConjured(item);
      return;
    }
    else
    {
      updateDefault(item);
      return;
    }
  }
  private void updateConjured(Item item)
  {
  }
  private boolean isConjured(Item item)
  {
    return false;
  }
  public boolean isSulfuras(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  public boolean isBackstagePasses(Item item)
  {
    return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
  }
  public boolean isBrie(Item item)
  {
    return item.name.equals("Aged Brie");
  }
  private void updateSulfuras(Item item)
  {
    // do nothing
  }
  public void updateDefault(Item item)
  {
    int degrade = 1;
    if (item.quality > 0)
    {
      item.quality = item.quality - degrade;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0 && item.quality > 0)
    {
      item.quality = item.quality - degrade;
    }
    return;
  }
  public void updateBackstagePasses(Item item)
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
  public void updateBrie(Item item)
  {
    if (item.quality < 50)
    {
      item.quality = item.quality + 1;
      if (isBackstagePasses(item))
      {
      }
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