// Generated by Dagger (https://google.github.io/dagger).
package com.movie.maotrailer.paging;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ItemDataSourceFactory_Factory implements Factory<ItemDataSourceFactory> {
  private final Provider<ItemDataSource> itemDataSourceProvider;

  public ItemDataSourceFactory_Factory(Provider<ItemDataSource> itemDataSourceProvider) {
    this.itemDataSourceProvider = itemDataSourceProvider;
  }

  @Override
  public ItemDataSourceFactory get() {
    return provideInstance(itemDataSourceProvider);
  }

  public static ItemDataSourceFactory provideInstance(
      Provider<ItemDataSource> itemDataSourceProvider) {
    return new ItemDataSourceFactory(itemDataSourceProvider.get());
  }

  public static ItemDataSourceFactory_Factory create(
      Provider<ItemDataSource> itemDataSourceProvider) {
    return new ItemDataSourceFactory_Factory(itemDataSourceProvider);
  }

  public static ItemDataSourceFactory newItemDataSourceFactory(ItemDataSource itemDataSource) {
    return new ItemDataSourceFactory(itemDataSource);
  }
}
