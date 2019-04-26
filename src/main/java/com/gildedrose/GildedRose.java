package com.gildedrose;

class GildedRose extends UpdateDefault
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
}
