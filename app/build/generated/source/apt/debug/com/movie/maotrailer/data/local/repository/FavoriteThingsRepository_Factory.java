// Generated by Dagger (https://google.github.io/dagger).
package com.movie.maotrailer.data.local.repository;

import com.movie.maotrailer.data.local.dao.FavoriteThingsDao;
import com.movie.maotrailer.helper.AppsExecutor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FavoriteThingsRepository_Factory implements Factory<FavoriteThingsRepository> {
  private final Provider<FavoriteThingsDao> favoriteThingsDaoProvider;

  private final Provider<AppsExecutor> appsExecutorProvider;

  public FavoriteThingsRepository_Factory(
      Provider<FavoriteThingsDao> favoriteThingsDaoProvider,
      Provider<AppsExecutor> appsExecutorProvider) {
    this.favoriteThingsDaoProvider = favoriteThingsDaoProvider;
    this.appsExecutorProvider = appsExecutorProvider;
  }

  @Override
  public FavoriteThingsRepository get() {
    return provideInstance(favoriteThingsDaoProvider, appsExecutorProvider);
  }

  public static FavoriteThingsRepository provideInstance(
      Provider<FavoriteThingsDao> favoriteThingsDaoProvider,
      Provider<AppsExecutor> appsExecutorProvider) {
    return new FavoriteThingsRepository(
        favoriteThingsDaoProvider.get(), appsExecutorProvider.get());
  }

  public static FavoriteThingsRepository_Factory create(
      Provider<FavoriteThingsDao> favoriteThingsDaoProvider,
      Provider<AppsExecutor> appsExecutorProvider) {
    return new FavoriteThingsRepository_Factory(favoriteThingsDaoProvider, appsExecutorProvider);
  }

  public static FavoriteThingsRepository newFavoriteThingsRepository(
      FavoriteThingsDao favoriteThingsDao, AppsExecutor appsExecutor) {
    return new FavoriteThingsRepository(favoriteThingsDao, appsExecutor);
  }
}
