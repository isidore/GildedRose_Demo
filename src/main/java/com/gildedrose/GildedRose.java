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
      dostuff(item);
    }
  }
  public void dostuff(Item item)
  {
    if (item.name.equals("Aged Brie"))
    {
      updateQualityForBrie(item);
      return;
    }
    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
    {
      everythingElse(item);
      return;
    }
    else
    {
      everythingElse(item);
      return;
    }
  }
  public void everythingElse(Item item)
  {
    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
    {
      if (item.quality > 0)
      {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
        {
          item.quality = item.quality - 1;
        }
      }
    }
    else
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
    }
    if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
    {
      item.sellIn = item.sellIn - 1;
    }
    if (item.sellIn < 0)
    {
      if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
      {
        if (item.quality > 0)
        {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
          {
            item.quality = item.quality - 1;
          }
        }
      }
      else
      {
        item.quality = item.quality - item.quality;
      }
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