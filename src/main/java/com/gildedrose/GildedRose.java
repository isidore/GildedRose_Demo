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
    if (new UpdateBrie().isBrie(item))
    {
      new UpdateBrie().updateQualityForBrie(item);
      return;
    }
    if (new UpdateBackstagePasses().ifBackstagePasses(item))
    {
      new UpdateBackstagePasses().updateQualityForBackstagePasses(item);
      return;
    }
    if (new UpdateSulfuras().ifSulfuras(item))
    {
      new UpdateSulfuras().updateQualityForSulfuras(item);
      return;
    }
    else if (ifDefault())
    {
      updateDefaultItem(item);
      return;
    }
  }
}
