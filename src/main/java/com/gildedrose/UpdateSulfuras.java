package com.gildedrose;

public class UpdateSulfuras
{
  public UpdateSulfuras()
  {
    super();
  }
  public boolean isType(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  protected void updateQualityForSulfuras(Item item)
  {
    // do nothing
  }
}