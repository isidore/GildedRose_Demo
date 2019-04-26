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
    if (new UpdateBrie().isType(item))
    {
      new UpdateBrie().updateQualityForBrie(item);
      return;
    }
    if (new UpdateBackstagePasses().isType(item))
    {
      new UpdateBackstagePasses().updateQualityForBackstagePasses(item);
      return;
    }
    if (new UpdateSulfuras().ifSulfuras(item))
    {
      new UpdateSulfuras().updateQualityForSulfuras(item);
      return;
    }
    else if (new UpdateDefault().ifDefault())
    {
      new UpdateDefault().updateDefaultItem(item);
      return;
    }
  }
}
