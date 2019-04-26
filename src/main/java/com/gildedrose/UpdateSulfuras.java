package com.gildedrose;

public class UpdateSulfuras implements ItemUpdater
{
  public UpdateSulfuras()
  {
    super();
  }
  public boolean isType(Item item)
  {
    return item.name.equals("Sulfuras, Hand of Ragnaros");
  }
  public void updateItem(Item item)
  {
    // do nothing
  }
}