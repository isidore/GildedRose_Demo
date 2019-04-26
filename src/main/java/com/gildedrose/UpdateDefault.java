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
    item.sellIn = item.sellIn - 1;
    if (0 < item.quality)
    {
      item.quality = item.quality - 1;
      if (item.sellIn < 0)
      {
        if (0 < item.quality)
        {
          item.quality = item.quality - 1;
        }
      }
      return;
    }
    else
    {
      return;
    }
  }
}