package com.gildedrose;

public class UpdateDefault implements ItemUpdater
{
  public UpdateDefault()
  {
    super();
  }
  public boolean isType(Item item)
  {
    return true;
  }
  public void updateItem(Item item)
  {
    int rate = 1;
    item.sellIn = item.sellIn - rate;
    if (item.quality <= 0)
    {
      return;
    }
    else
    {
      item.quality = item.quality - rate;
      if (item.sellIn < 0)
      {
        if (0 < item.quality)
        {
          item.quality = item.quality - rate;
        }
      }
      return;
    }
  }
}