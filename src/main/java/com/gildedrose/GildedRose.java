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
    if (item.name.equals("Aged Brie"))
    {
      stuffWithAgedBrie(item);
      return;
    }
    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert"))
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
    else
    {
      if (true)
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
      }
      if (!item.name.equals("Sulfuras, Hand of Ragnaros"))
      {
        item.sellIn = item.sellIn - 1;
      }
      if (item.sellIn < 0)
      {
        if (true)
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
        }
      }
      return;
    }
  }
  private void stuffWithAgedBrie(Item item)
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