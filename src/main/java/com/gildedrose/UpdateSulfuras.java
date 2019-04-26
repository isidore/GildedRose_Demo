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
  protected void updateItem(Item item)
  {
    // do nothing
  }
}