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
      updateQualityForBrie(item);
      return;
    }
    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
    {
      updateQualityForBackstagePasses(item);
      return;
    }
    if (item.name.equals("Sulfuras, Hand of Ragnaros"))
    {
      updateQualityForSulfuras(item);
      return;
    }
    else if (true)
    {
      updateDefaultItem(item);
      return;
    }
  }
  public boolean isBrie(Item item)
  {
    return item.name.equals("Aged Brie");
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
  public void updateQualityForBrie(Item item)
  {
    if (item.quality < 50)
    {
      item.quality = item.quality + 1;
      if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
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
