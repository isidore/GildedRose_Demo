package com.gildedrose;

public interface ItemUpdater
{
  boolean isItem(Item item);
  void updateQuality(Item item);
}