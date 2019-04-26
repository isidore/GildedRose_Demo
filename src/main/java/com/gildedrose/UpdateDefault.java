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
    if (item.quality > 0)
    {
      item.quality = item.quality - 1;
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
    else
    {
      item.sellIn = item.sellIn - 1;
      return;
    }
  }
}