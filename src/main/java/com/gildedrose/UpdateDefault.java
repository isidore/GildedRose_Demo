package com.gildedrose;

public class UpdateDefault
{
  public UpdateDefault()
  {
    super();
  }
  public boolean isType()
  {
    return true;
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
}