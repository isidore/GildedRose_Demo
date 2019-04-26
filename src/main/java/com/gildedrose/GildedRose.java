package com.gildedrose;

class GildedRose extends UpdateBrie
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
      updateQualityForBrie(item);
      return;
    }
    if (ifBackstagePasses(item))
    {
      updateQualityForBackstagePasses(item);
      return;
    }
    if (ifSulfuras(item))
    {
      updateQualityForSulfuras(item);
      return;
    }
    else if (ifDefault())
    {
      updateDefaultItem(item);
      return;
    }
  }
  public boolean ifDefault()
  {
    return true;
  }
  public boolean ifSulfuras(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  public boolean ifBackstagePasses(Item item)
  {
    return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
  }
  private void updateQualityForSulfuras(Item item)
  {
    // do nothing
  }
  public void updateDefaultItem(Item item)
  {
    if (item.quality > 0)
    {
      item.quality = item.quality - 1;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0)
    {
      if (item.quality > 0)
      {
        item.quality = item.quality - 1;
      }
    }
    return;
  }
  public void updateQualityForBackstagePasses(Item item)
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
}
