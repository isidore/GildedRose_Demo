package com.gildedrose;

public class DefualtItem implements ItemUpdater
{
  public DefualtItem()
  {
    super();
  }
  @Override
  public boolean isItem(Item item)
  {
    return true;
  }
  @Override
  public void updateQuality(Item item)
  {
    updateDefaultItemQuality(item, 1);
  }
  private void updateDefaultItemQuality(Item item, int qualityRate)
  {
    if (item.quality > 0)
    {
      item.quality = item.quality - qualityRate;
    }
    item.sellIn = item.sellIn - 1;
    if (item.sellIn < 0 && item.quality > 0)
    {
      item.quality = item.quality - qualityRate;
    }
    return;
  }
}