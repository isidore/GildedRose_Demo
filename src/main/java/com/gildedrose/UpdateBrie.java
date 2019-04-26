package com.gildedrose;

public class UpdateBrie
{
  public UpdateBrie()
  {
    super();
  }

  public boolean isBrie(Item item)
  {
    return item.name.equals("Aged Brie");
  }

  public void updateQualityForBrie(Item item)
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